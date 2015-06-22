package di.core;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Singleton;

public final class Context {

	private static Context INSTANCE;
	private Config config;
	private Map<Class<?>, Method> produces = new HashMap<>();
	private Map<Class<?>, Object> singletons = new HashMap<>();
	
	public static Context getInstance() {
		if (INSTANCE == null)
			throw new RuntimeException("Context não foi inicializado");
		
		return INSTANCE;
	}

	public static Context inicializar(Config config) {
		INSTANCE = new Context(config);
		config.iniciar();
		INSTANCE.inicializar();
		return INSTANCE;
	}
	
	private void inicializar() {
		Method[] methods = config.getClass().getMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(Produces.class)) {
				Class<?> classReturnMethod = method.getReturnType();
				produces.put(classReturnMethod, method);
			}
		}
	}

	private Context(Config config) {
		this.config = config;
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getObject(Class<T> classe) {
		Object object = getSingletons().get(classe);
		if (object == null) {
			Method method = produces.get(classe);
			
			if (method == null)
				throw new RuntimeException("Classe do tipo " + classe.getCanonicalName() + " não foi mapeado");
			
			try {
				object = method.invoke(config);
				if (method.isAnnotationPresent(Singleton.class))
					getSingletons().put(classe, object);
					
			} catch (IllegalArgumentException e) {
				throw new RuntimeException("O metodo bean " + method.getName() + " possui parâmetros inválidos");
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	
		injetarDependencia(object);
		return (T) object;
	}
	
	private void injetarDependencia(Object object) {
		Field[] fields = object.getClass().getDeclaredFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(Inject.class)) {
				Class<?> classType = field.getType();
				Object objectInject = getObject(classType);
				field.setAccessible(true);
				try {
					field.set(object, objectInject);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		}
	}

	private Map<Class<?>, Object> getSingletons() {
		return singletons;
	}
}

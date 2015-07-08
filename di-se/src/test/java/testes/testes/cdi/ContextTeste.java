package testes.testes.cdi;

import di.client.AppConfig;
import di.client.ClienteDAO;
import di.core.Context;


public class ContextTeste {

	public static void main(String[] args) {
		Context context = Context.inicializar(new AppConfig());
		
		new Thread(() -> {
		ClienteDAO clienteDAO = context.getObject(ClienteDAO.class);
		
		clienteDAO.carregar();
		}).start();
	}
}

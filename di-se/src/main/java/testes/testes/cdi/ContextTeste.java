package testes.testes.cdi;


public class ContextTeste {

	public static void main(String[] args) {
		Context context = Context.inicializar(new AppConfig());
		ClienteDAO clienteDAO = context.getObject(ClienteDAOImpl.class);
		
		clienteDAO.carregar();
	}
}

package testes.testes.cdi;

import di.client.AppConfig;
import di.client.ClienteDAO;
import di.client.ClienteDAOImpl;
import di.core.Context;


public class ContextTeste {

	public static void main(String[] args) {
		Context context = Context.inicializar(new AppConfig());
		ClienteDAO clienteDAO = context.getObject(ClienteDAOImpl.class);
		
		clienteDAO.carregar();
	}
}

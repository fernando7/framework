package testes.testes.cdi;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

public class AppConfig extends Config {

	@Produces
	public ClienteDAO getClienteDAO() {
		return new ClienteDAOImpl();
	}

	@Produces @Singleton
	public Configuracao getConfiguracao() {
		return new Configuracao();
	}
	
	@Produces
	public EnderecoDAO getEnderecoDAO() { 
		return new EnderecoDAO();
	}
}

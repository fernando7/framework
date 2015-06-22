package di.client;

import javax.inject.Inject;

public class ClienteDAOImpl implements ClienteDAO {

	@Inject
	private EnderecoDAO enderecoDAO;
	
	@Inject
	private Configuracao configuracao;
	
	public ClienteDAOImpl() {
		System.out.println("Construtor cliente dao");
	}
	
	@Override
	public void salvar() {
		System.out.println("Salvando cliente");
	}
	
	@Override
	public void carregar() {
		if (configuracao.isModoDebug()) {
			System.out.println("modo debug");
		}
		
		System.out.println("Carregando cliente");
		enderecoDAO.carregar();
	}
}

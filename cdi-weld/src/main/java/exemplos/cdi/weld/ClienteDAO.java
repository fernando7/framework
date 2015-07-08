package exemplos.cdi.weld;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

public class ClienteDAO {

	@Inject
	private EnderecoDAO enderecoDAO;

	public void salvar() {
		System.out.println("Salvando um cliente");
		enderecoDAO.salvar();
	}
	
	@PostConstruct
	public void ṕost() {
		System.out.println("Post");
	}
}

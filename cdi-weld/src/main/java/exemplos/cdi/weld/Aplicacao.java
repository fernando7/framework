package exemplos.cdi.weld;

import javax.inject.Inject;

public class Aplicacao {

	@Inject
	private ClienteDAO clienteDAO;
	
	public void executar() {
		clienteDAO.salvar();
	}
}

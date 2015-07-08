package exemplos.cdi.weld;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;

public class AppTest {

	@Test
	public void testWeld() {
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		Aplicacao aplicacao = container.instance().select(Aplicacao.class).get();
		aplicacao.executar();
		weld.shutdown();
	}
}

package acoes;

import com.borland.silktest.jtf.Desktop;
import org.junit.Before;
import com.borland.silktest.jtf.BrowserBaseState;
import org.junit.Test;
import com.borland.silktest.jtf.win32.AccessibleControl;
import com.borland.silktest.jtf.xbrowser.DomListBox;

public class TrocaIdioma {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		// Go to web page 'https://www.trivago.com.br/'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}

	@Test
	public void TrocarIdioma(String idioma) {
		desktop.<AccessibleControl>find("WebBrowser.Maximizar").click();
		desktop.<AccessibleControl>find("WebBrowser.Maximizar").click();
		desktop.<DomListBox>find("trivago_com_br.BrowserWindow.select-country").select(idioma);
	}

}
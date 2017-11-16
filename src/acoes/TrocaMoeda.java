package acoes;

import com.borland.silktest.jtf.Desktop;
import org.junit.Before;
import com.borland.silktest.jtf.BrowserBaseState;
import org.junit.Test;
import com.borland.silktest.jtf.win32.AccessibleControl;
import com.borland.silktest.jtf.xbrowser.DomListBox;

public class TrocaMoeda {
	
	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		// Go to web page 'https://www.trivago.com.br/'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}
	@Test
	public void TrocarMoeda(String moeda) {
		desktop.<AccessibleControl>find("WebBrowser.Maximizar").click();
		desktop.<DomListBox>find("trivago_com_br.BrowserWindow.select-currency").select(moeda);
	}

}

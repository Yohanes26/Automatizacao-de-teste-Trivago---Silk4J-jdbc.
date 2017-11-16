package acoes;

import com.borland.silktest.jtf.Desktop;
import org.junit.Before;
import com.borland.silktest.jtf.BrowserBaseState;
import org.junit.Test;
import com.borland.silktest.jtf.win32.AccessibleControl;
import com.borland.silktest.jtf.xbrowser.DomTextField;
import com.borland.silktest.jtf.xbrowser.DomButton;

public class OfertaEmail {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		// Go to web page 'https://www.trivago.com.br/'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}

	@Test
	public void ReceberOferta() {
		desktop.<AccessibleControl>find("WebBrowser.Maximizar").click();
		desktop.<DomTextField>find("trivago_com_br.BrowserWindow.newsletterRegistrati")
				.setText("paulolobo@hotmail.com");
		desktop.<DomButton>find("trivago_com_br.BrowserWindow.btn btn--secondary i").click();
	}

}
package acoes;

import org.junit.Before;
import org.junit.Test;

import com.borland.silktest.jtf.BrowserBaseState;
import com.borland.silktest.jtf.Desktop;
import com.borland.silktest.jtf.win32.AccessibleControl;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomTextField;

public class PesquisarPorFiltro {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		// Go to web page 'https://www.trivago.com.br/'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}

	@Test
	public void PesquisandoPorFiltro() throws InterruptedException {
		desktop.<AccessibleControl>find("WebBrowser.Maximizar").click();
		desktop.<DomButton>find("trivago_com.BrowserWindow.siteheader__control").click();
		desktop.<DomLink>find("trivago_com.BrowserWindow.Efetuar Login").click();
		desktop.<DomTextField>find("trivago_com.BrowserWindow.emailLogin").setText("yohaneslopes@hotmail.com");
		desktop.<DomTextField>find("trivago_com.BrowserWindow.login-pass").setText("10101010");
		desktop.<DomButton>find("trivago_com.BrowserWindow.btn btn--primary btn").click();
		desktop.<DomTextField>find("trivago_com.BrowserWindow.horus-querytext").typeKeys("<Delete>");
		desktop.<DomTextField>find("trivago_com.BrowserWindow.horus-querytext").setText("SÃ£o Paulo");
		desktop.<DomButton>find("trivago_com.BrowserWindow.btn btn--primary hor").click();
		desktop.<DomElement>find("trivago_com.BrowserWindow.fl-slider__slide-hol").click();
		desktop.<DomElement>find("trivago_com.BrowserWindow.icon-ic fl-group__ic").click();
	}

}


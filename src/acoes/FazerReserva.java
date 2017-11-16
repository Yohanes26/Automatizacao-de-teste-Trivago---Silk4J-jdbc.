package acoes;

import org.junit.Test;

import com.borland.silktest.jtf.Desktop;
import com.borland.silktest.jtf.win32.AccessibleControl;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomTextField;

public class FazerReserva {

	private Desktop desktop = new Desktop();

	
	@Test
	public void FazendoReserva(String cidade) {
		
		desktop.<AccessibleControl>find("WebBrowser.Maximizar").click();
		desktop.<DomTextField>find("trivago_com.BrowserWindow.horus-querytext").setText(cidade);
		desktop.<DomButton>find("trivago_com.BrowserWindow.btn btn--primary hor").click();
		
	}

}
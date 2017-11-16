package CadastroLoginAlteracao;
import org.junit.Test;

import com.borland.silktest.jtf.Desktop;
import com.borland.silktest.jtf.win32.AccessibleControl;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomTextField;


public class Login {
	
	
	private Desktop desktop = new Desktop();


	public Login(Desktop desktop) {
		this.desktop = desktop;
	}
	

	
	@Test
	public void LoginUsuario(String gmail, String senha) {
		
	/*	UsuarioDAO usuDao = new UsuarioDAO();
		List<Usuario> listaResultado = usuDao.consultarTodos();

		for (Usuario usuario2 : listaResultado) {*/
		
		desktop.<AccessibleControl>find("WebBrowser.Maximizar").click();
		desktop.<DomElement>find("trivago_com_br.BrowserWindow.Meu perfil").click();
		desktop.<DomLink>find("trivago_com_br.BrowserWindow.Efetuar Login").click();
		desktop.<DomTextField>find("accounts_trivago_com.BrowserWindow.emailLogin").setText(gmail);
		desktop.<DomTextField>find("accounts_trivago_com.BrowserWindow.login-pass").setText(senha);
		desktop.<DomButton>find("accounts_trivago_com.BrowserWindow.btn btn--primary btn").click();
		desktop.captureBitmap("C:/Automation/Screenshot/UDefD21111ata.png");
		//}
		
	//	alterar.AlteracaoCadastral();
	}
	
	
	/*@Before
	public void baseState() {
		// Go to web page 'www.trivago.com.br'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
		
	}*/
	
	
		//Keyword.ObjBApp.CaptureBitmap("C:/Automation/Screenshot/UDefD21ata.png");

		//typeKeys ("<PrtScr>");


}
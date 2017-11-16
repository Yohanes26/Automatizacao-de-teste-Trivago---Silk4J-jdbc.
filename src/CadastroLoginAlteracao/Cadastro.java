package CadastroLoginAlteracao;


import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.borland.silktest.jtf.BrowserBaseState;
import com.borland.silktest.jtf.Desktop;
import com.borland.silktest.jtf.win32.AccessibleControl;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomTextField;

import Entidades.Usuario;
import JDBC.UsuarioDAO;

public class Cadastro {
	
	
	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		// Go to web page 'www.trivago.com.br'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}
	
	@Test
	public void Cadastro() {
		
		UsuarioDAO usuDao = new UsuarioDAO();
		List<Usuario> listaResultado = usuDao.consultarTodos();

		for (Usuario usuario2 : listaResultado) {
			
		
		desktop.<AccessibleControl>find("WebBrowser.Maximizar").click();
		desktop.<DomElement>find("trivago_com_br.BrowserWindow.Meu perfil").click();
		desktop.<DomLink>find("trivago_com_br.BrowserWindow.Cadastre-se").click();
		desktop.<DomTextField>find("accounts_trivago_com.BrowserWindow.emailRegister").setText(usuario2.getGmail());
		desktop.<DomTextField>find("accounts_trivago_com.BrowserWindow.register-pass").setText(usuario2.getSenha());
		desktop.<DomButton>find("accounts_trivago_com.BrowserWindow.btn btn--primary btn").click();
		desktop.<DomButton>find("accounts_trivago_com.BrowserWindow.btn btn--primary btn").click();
		}
		
	}

}

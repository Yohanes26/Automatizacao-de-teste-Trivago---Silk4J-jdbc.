package CadastroLoginAlteracao;

import com.borland.silktest.jtf.BrowserBaseState;
import com.borland.silktest.jtf.Desktop;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import com.borland.silktest.jtf.Window;
import com.borland.silktest.jtf.win32.AccessibleControl;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;
import com.borland.silktest.jtf.xbrowser.DomTextField;

import Entidades.Usuario;
import JDBC.UsuarioDAO;

import com.borland.silktest.jtf.common.types.MouseButton;
import com.borland.silktest.jtf.common.types.Point;

public class AlteracaoCadastro {

	private Desktop desktop = new Desktop();

	public AlteracaoCadastro(Desktop desktop) {
		this.desktop = desktop;
	}

	@Test
	public void AlteracaoCadastral(String nome, String sobreNome, String dataNascimento, String rua, String cep,
			String cidade, String pais, String telefone) {

		desktop.<DomElement>find("trivago_com_br.BrowserWindow.Yohanes lopes goncal").click();
		desktop.<DomLink>find("trivago_com_br.BrowserWindow.Perfil").click();
		desktop.<DomLink>find("accounts_trivago_com.BrowserWindow.Configurações").click();
		desktop.<DomElement>find("accounts_trivago_com.BrowserWindow.Informações pessoais").click();

		desktop.<DomRadioButton>find("accounts_trivago_com.BrowserWindow.input-select-gender-").select();

		desktop.<DomTextField>find("accounts_trivago_com.BrowserWindow.input-text-firstName").typeKeys("<Delete>");
		desktop.<DomTextField>find("accounts_trivago_com.BrowserWindow.input-text-firstName").setText(nome);
		desktop.<DomTextField>find("accounts_trivago_com.BrowserWindow.input-text-lastName").setText(sobreNome);
		desktop.<DomTextField>find("accounts_trivago_com.BrowserWindow.input-text-dateOfBir").setText(dataNascimento);
		desktop.<DomTextField>find("accounts_trivago_com.BrowserWindow.input-text-street").setText(rua);
		desktop.<DomTextField>find("accounts_trivago_com.BrowserWindow.input-text-zip").setText(cep);
		desktop.<DomTextField>find("accounts_trivago_com.BrowserWindow.input-text-city").setText(cidade);
		desktop.<DomListBox>find("accounts_trivago_com.BrowserWindow.input-select-country").select(pais);
		desktop.<DomTextField>find("accounts_trivago_com.BrowserWindow.input-text-phone").setText(telefone);
		desktop.<DomButton>find("accounts_trivago_com.BrowserWindow.Salvar").click();
		desktop.captureBitmap("C:/Automation/Screenshot/AlteradoCadastro.png");
	}

	// }

}

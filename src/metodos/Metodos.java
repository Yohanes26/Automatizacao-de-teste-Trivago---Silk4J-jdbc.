package metodos;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.borland.silktest.jtf.BrowserBaseState;
import com.borland.silktest.jtf.Desktop;

import CadastroLoginAlteracao.AlteracaoCadastro;
import CadastroLoginAlteracao.Login;
import Entidades.Usuario;
import JDBC.UsuarioDAO;
import acoes.FazerReserva;

public class Metodos {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		// Go to web page 'www.trivago.com.br'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);

	}

	@Test
	public void Logar() throws InterruptedException {
		Login login = new Login(desktop);
		UsuarioDAO usuDao = new UsuarioDAO();
		List<Usuario> listaResultado = usuDao.consultarTodos();

		for (Usuario usuario2 : listaResultado) {

			login.LoginUsuario(usuario2.getGmail(), usuario2.getSenha());
		}

	}

	@Test
	public void AlterarCadastro() {
		AlteracaoCadastro alteracaocadastro = new AlteracaoCadastro(desktop);

		UsuarioDAO usuDao = new UsuarioDAO();
		List<Usuario> listaResultado = usuDao.consultarTodos();

		for (Usuario usuario2 : listaResultado) {
			alteracaocadastro.AlteracaoCadastral(usuario2.getNome(), usuario2.getSobreNome(),
					usuario2.getDataNascimento(), usuario2.getRua(), usuario2.getCep(), usuario2.getCidade(),
					usuario2.getPais(), usuario2.getTelefone());
		}

	}
	
	@Test
	public void FazerReserva() {
		
		FazerReserva fazerReserva = new FazerReserva();
		
		Usuario usuario2 = new Usuario();
		fazerReserva.FazendoReserva(usuario2.getCidade());
				
	}
}
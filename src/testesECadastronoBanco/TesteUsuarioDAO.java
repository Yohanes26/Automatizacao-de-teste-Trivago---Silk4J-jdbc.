/*package testesECadastronoBanco;

import java.util.List;

import Entidades.Usuario;
import JDBC.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String[] args) {

		// TestCadastrar();  tirar comentario e dar Run as para cadastrar Usuario
		//TestCadastrarGmail();
		TestAlterarUsuario();

	}

	
	//classe utilizada para teste de busca ao banco para utiliza��o dentro do webdriver.
	private static void TestConsultarTodos() {
		UsuarioDAO usuDao = new UsuarioDAO();
		List<Usuario> listaResultado = usuDao.consultarTodos();

		Usuario usuario2 = new Usuario();

		for (Usuario u : listaResultado) {

			usuario2.setNome(u.getNome());

			System.out.println(usuario2.getNome());

		}

	}

	
	
	
	private static void TestAlterarUsuario() {

		Usuario usuario = new Usuario();
		usuario.setNome("Yohanes");
		usuario.setSobreNome("Lopes Goncalves");
		usuario.setDataNascimento("26/11/1991");
		usuario.setRua("Rua dr zacarias colaco filho 40");
		usuario.setCep("08032-250");
		usuario.setCidade("São Paulo");
		usuario.setPais("Brasil");
		usuario.setTelefone("11 98738-5051");
		usuario.setGmail("yohaneslopesgoncalves@hotmail.com");
		usuario.setSenha("10101010");
		

		
		UsuarioDAO usuDao = new UsuarioDAO();
		usuDao.Cadastrar(usuario);

	}

	private static void testCadastrarGmail() {

		Usuario usuario = new Usuario();
		
		usuario.setGmail("yohaneslopesgoncalves@hotmail.com");
		usuario.setSenha("10101010");
		
		UsuarioDAO usuDao = new UsuarioDAO();
		usuDao.Cadastrar(usuario);

	}

	
}

*/
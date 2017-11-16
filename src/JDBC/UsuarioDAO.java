package JDBC;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.borland.silktest.jtf.Desktop;

import Entidades.Usuario;



public class UsuarioDAO {

	private Connection con = Conexao.getconnection();

	

	public List<Usuario> consultarTodos() {
		String sql = "SELECT * FROM dados";

		List<Usuario> lista = new ArrayList<Usuario>();

		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();

			while (resultado.next()) {
				Usuario usuario = new Usuario();

				usuario.setNome(resultado.getString("nome"));
				usuario.setSobreNome(resultado.getString("sobrenome"));
				usuario.setDataNascimento(resultado.getString("datanascimento"));
				usuario.setRua(resultado.getString("rua"));
				usuario.setCep(resultado.getString("cep"));
				usuario.setCidade(resultado.getString("cidade"));
				usuario.setPais(resultado.getString("pais"));
				usuario.setTelefone(resultado.getString("telefone"));
				usuario.setGmail(resultado.getString("gmail"));
				usuario.setSenha(resultado.getString("senha"));

				lista.add(usuario);

			}

			preparador.close();

			System.out.println("Consulta efetuada com sucesso!");

		} catch (SQLException e) {
			System.out.println("Erro ao efetuar a consulta!");
		}
		return lista;

	}

}
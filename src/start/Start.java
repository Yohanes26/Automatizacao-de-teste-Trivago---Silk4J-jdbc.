package start;

import org.junit.Test;

import metodos.Metodos;

public class Start {

	Metodos metodos = new Metodos();
	

	@Test
	public void testarTudo() throws InterruptedException {
		metodos.baseState();
		metodos.Logar();
		//metodos.AlterarCadastro();
		metodos.FazerReserva();
	}
}
	
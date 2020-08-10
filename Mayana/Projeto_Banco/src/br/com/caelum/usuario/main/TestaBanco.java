package br.com.caelum.usuario.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaBanco {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		for (int i = 0; i < 5; i++) {
			ContaCorrente conta = new ContaCorrente();
			conta.setTitular("Mayana " + i);
			conta.setNumero(i);
			conta.setAgencia("1000");
			conta.deposita(i * 1000);
			banco.adiciona(conta);
			
		}
		
		//banco.mostraContas();

		

	}

}

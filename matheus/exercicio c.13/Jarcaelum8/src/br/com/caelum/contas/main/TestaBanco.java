package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaBanco {

	public static void main(String[] args) {
		Banco banco = new Banco("CaelumBank", 999);

		ContaCorrente c1 = new ContaCorrente();
		c1.setTitular("Batman");
		c1.setNumero(1);
		c1.setAgencia("1000");
		c1.deposita(100000);
		banco.adiciona(c1);

		ContaCorrente c2 = new ContaCorrente();
		c2.setTitular("Coringa");
		c2.setNumero(2);
		c2.setAgencia("1000");
		c2.deposita(890000);
		banco.adiciona(c2);

		for (int i = 0; i < 13; i++) {
			ContaCorrente c = new ContaCorrente();
			c.setTitular("Coringa");
			c.setNumero(2);
			c.setAgencia("1000");
			c.deposita(890000);
			banco.adiciona(c);
		}
		banco.mostraContas();

		

	}

}

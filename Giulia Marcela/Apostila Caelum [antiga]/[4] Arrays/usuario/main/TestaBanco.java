package br.com.g2ac.usuario.main;

import br.com.g2ac.contas.modelo.Banco;
import br.com.g2ac.contas.modelo.ContaCorrente;


public class TestaBanco {

	public static void main(String[] args) {

		Banco banco = new Banco("G2AC Bank", 1);

		for (int i = 0; i < 5; i++) {
			ContaCorrente conta = new ContaCorrente();
			conta.getTitular().setNome("Usuario " + i);
			conta.setNumero(i);
			conta.setAgencia("123");
			conta.deposita(1000 * (i + 1));
			banco.adiciona(conta);
		}
		banco.mostraContas();
	}
}

package br.com.caelum.contas;

import br.com.caelum.javafx.api.main.TelaDeContas;

public class TestaContas {
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.mudaCPF("12314141234");
		
		 TelaDeContas.main(args);
	}
}

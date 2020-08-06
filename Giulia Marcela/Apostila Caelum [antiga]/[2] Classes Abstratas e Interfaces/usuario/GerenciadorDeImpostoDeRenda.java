package br.com.g2ac.usuario;

import br.com.g2ac.interfaces.Tributavel;

public class GerenciadorDeImpostoDeRenda {

	private double total;

	public void adiciona(Tributavel t) {
		System.out.println("Adicionando tributavel: " + t.getSaldo());
		this.total = this.total + t.calculaTributos();
	}

	public double getTotal() {
		return total;
	}
}

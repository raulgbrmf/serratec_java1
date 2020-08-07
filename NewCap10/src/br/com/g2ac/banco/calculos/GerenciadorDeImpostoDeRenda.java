package br.com.g2ac.banco.calculos;

public class GerenciadorDeImpostoDeRenda {
	private double total;

	void adiciona(Tributavel t) {
		System.out.println("Adicionando tributavel: " + t.getSaldo());
		this.total = this.total + t.calculaTributos();
	}

	public double getTotal() {
		return total;
	}

}

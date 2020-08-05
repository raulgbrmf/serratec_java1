package br.com.caelum.contas.modelo;

public class GerenciadorDeImpostoDeRenda {
	private double total;
	
	void adiciona (Tributavel t) {
		System.out.println("Adicionando tribut�vel: " + t);
		
		this.total = this.total + t.calculaTributos();
	}
	
	public double getTotal() {
		return total;
	}
}

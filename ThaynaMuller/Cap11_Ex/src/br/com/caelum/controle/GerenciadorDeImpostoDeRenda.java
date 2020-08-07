package br.com.caelum.controle;

public class GerenciadorDeImpostoDeRenda {
	
	private double total;
	
	void adicionar(Tributavel t) {
		System.out.println("Adicionando Tributavel " + t);
		
		this.total = this.total + t.calculaTributos();
	}
	
	public double getTotal() {
		return total;
	}
	
	

}

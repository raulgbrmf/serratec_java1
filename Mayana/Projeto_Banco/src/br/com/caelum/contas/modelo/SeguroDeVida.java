package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {

	private double valor;
	private String titular;
	private int numeroApolice;	
	
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumeroApolice() {
		return numeroApolice;
	}
	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}	
	
	@Override
	public double getValorImpostos() {
		return 42 + this.valor * 0.02;
	}
	
	public String getTipo() {
		return "Seguro de Vida";
	}
	
	
}

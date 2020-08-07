package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel{
	
	protected double valor;
	protected String titular;
	protected int numeroApolice;
	
	public double getValorImposto() {
		return 42 + this.valor*0.02;
	}

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
	
	public String getTipo() {
		return "Seguro de Vida";
	}
}

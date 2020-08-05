//	Cap11.5.1

package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel{
	private double valor;
	private String titular;
	private int numeroApolice;
	
	// VALOR IMPOSTO
	public double getValorImposto() {
		return 42 + this.valor * 0.02;
	}
	
	// VALOR
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	// TITULAR
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	// NUMERO APOLICE
	public int getNumeroApolice() {
		return numeroApolice;
	}
	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}
	
	// TIPO DO PRODUTO
	public String getTipo() {
		return "Seguro de Vida";
	}
	
}

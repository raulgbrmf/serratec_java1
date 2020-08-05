package br.com.caelum.contas.modelo;

public class SeguroDeVida  implements Tributavel{
	private double valor;
	private String titular;
	private int numeroApolice;
	

	
	public double getValorImposto() {
		
		return 42+ this.valor*0.02;
	}
	public String getTipo() {
		return "seguro de vida";
	}

	public void setValor(double Valor) {
		this.valor=Valor;
		
	}
	public void setTitular(String Titular) {
		this.titular=Titular;
	}
	public void setNumeroApolice(int numero) {
		this.numeroApolice=numero;
	}
	
	public double getValor() {
		return this.valor;
	}
	public String getTitular() {
		return this.titular;
	}
	public int getNumeroApolice() {
		return this.numeroApolice;
	}
}

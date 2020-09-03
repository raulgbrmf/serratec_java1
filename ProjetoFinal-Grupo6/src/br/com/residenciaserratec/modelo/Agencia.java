package br.com.residenciaserratec.modelo;

public class Agencia {

	public int numero;
	public int totalDeContas;

	public Agencia(int numero) {
		this.numero = numero;
		this.totalDeContas = 0;
	}

	public int getTotalDeContas() {
		return totalDeContas;
	}

	public void setTotalDeContas(int totalDeContas) {
		this.totalDeContas = totalDeContas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Agencia [numero=" + numero + ", totalDeContas=" + totalDeContas + "]";
	}

}

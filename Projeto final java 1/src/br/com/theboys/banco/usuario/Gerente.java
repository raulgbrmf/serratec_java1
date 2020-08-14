package br.com.theboys.banco.usuario;

public class Gerente extends Funcionario {

	private String agencia;

	public Gerente() {
		this.cargo = "Gerente";
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
}

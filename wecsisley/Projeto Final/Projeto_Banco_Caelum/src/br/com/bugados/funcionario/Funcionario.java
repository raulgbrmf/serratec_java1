package br.com.bugados.funcionario;

public abstract class Funcionario {

	protected String cargo;

	public Funcionario() {
	}

	public Funcionario(String cargo) {
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + "]";
	}

}

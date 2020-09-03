package br.com.residenciaserratec.modelo;

public class Presidente extends Diretor {

	@Override
	public String toString() {
		return "Presidente [cpf=" + cpf + ", senha=" + senha + ", cargo=" + cargo + "]";
	}

	public Presidente(long cpf, int senha) {
		super(cpf, senha);
		this.cargo = "Presidente";
	}

	public double imprimeRelatorioFinanceiro() {
		return Conta.saldoTotal;
	}
}

package br.com.residenciaserratec.modelo;

public class ContaCorrente extends Conta {

	private double tributacao;

	public ContaCorrente(int agencia, long cpfTitular, double saldo) {
		super(agencia, cpfTitular, saldo);
		this.tipo = "Conta Corrente";
	}

	public double getTributacao() {
		return tributacao;
	}

	public void saque(double valor) {
		if (valor < 0)
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		if (this.saldo < valor)
			throw new SaldoInsuficiente(valor);

		else {
			this.saldo = this.saldo - (valor + 0.10);
			this.tributacao += 0.10;
			Conta.saldoTotal -= (valor - 0.10);
		}
	}

	public void deposito(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar " + " um valor negativo.");
		} else {

			this.saldo += (valor - 0.10);
			this.tributacao += 0.10;
			Conta.saldoTotal += (valor - 0.10);
		}

	}

	public void transfere(Conta conta, double valor) {
		try {
			if (valor <= 0)
				throw new IllegalArgumentException("Você tentou transferir um valor inválido.");
			if (this.saldo < valor)
				throw new SaldoInsuficiente(valor);
			else {
				this.saldo -= (valor + 0.20);
				conta.saldo += valor;
				this.tributacao += 0.20;
				System.out.println("o valor transferido da conta de " + "foi de " + valor);
				System.out.println("Seu saldo agora é de " + this.saldo);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

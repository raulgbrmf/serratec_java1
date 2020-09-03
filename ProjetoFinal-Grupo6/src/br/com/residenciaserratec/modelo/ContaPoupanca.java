package br.com.residenciaserratec.modelo;

import java.text.DecimalFormat;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, long cpfTitular, double saldo) {
		super(agencia, cpfTitular, saldo);
		this.tipo = "Conta Poupança";
	}

	public void saque(double valor) {
		if (valor < 0)
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		if (this.saldo < valor)
			throw new SaldoInsuficiente(valor);

		else {
			this.saldo = this.saldo - valor;
			Conta.saldoTotal -= valor;
		}
	}

	public void deposito(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar " + " um valor negativo.");
		} else {
			this.saldo += valor;
			Conta.saldoTotal += valor;
		}
	}

	public void transfere(Conta conta, double valor) {
		try {
			if (valor <= 0)
				throw new IllegalArgumentException("Você tentou transferir um valor inválido.");
			if (this.saldo < valor)
				throw new SaldoInsuficiente(valor);
			else {
				this.saldo -= valor;
				conta.saldo += valor;
				System.out.println("O valor transferido da conta de " + "foi de " + valor);
				System.out.println("O saldo do destino titular agora é de " + conta.saldo);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public double rendimento(int mes) {
		double rendimento = 0;
		double controle = 0;
		for (int i = 1; i <= mes; i++) {
			rendimento = rendimento + (this.saldo * 0.1);
			this.saldo = this.saldo + rendimento - controle;
			controle = rendimento;
		}
		DecimalFormat fmt = new DecimalFormat(" 0.00");
		String string = fmt.format(rendimento);
		String[] part = string.split("[,]");
		String string2 = part[0] + "." + part[1];
		rendimento = Double.parseDouble(string2);
		return rendimento;
	}

	@Override
	public double getTributacao() {
		// TODO Auto-generated method stub
		return 0;
	}
}

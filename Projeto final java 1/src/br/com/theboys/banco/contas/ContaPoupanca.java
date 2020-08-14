package br.com.theboys.banco.contas;

public class ContaPoupanca extends Conta {

	public void saca(double valor) {
		if (valor <= 0) {
			System.out.println("##############################");
			System.out.println("####### Valor inválido #######");
			System.out.println("##############################");
			throw new Error();
		} else if (valor > this.saldo) {
			System.out.println("##############################");
			System.out.println("##### Saldo insuficiente #####");
			System.out.println("##############################");
			throw new Error();
		} else {
			this.saldo = saldo - valor;
			System.out.println("O----------------------------O");
			System.out.println("| Valor retirado com sucesso |");
			this.quantidadeSaque++;
		}
	}

	public void deposita(double valor) {
		if (valor <= 0) {
			System.out.println("##############################");
			System.out.println("####### Valor inválido #######");
			System.out.println("##############################");
			throw new Error();
		} else {
			this.saldo = saldo + valor;
			System.out.println("O----------------------------O");
			System.out.println("|Valor depositado com sucesso|");
			this.quantidadeDeposito++;
		}
	}

	public void transfere(double valor, Conta destinatario) {

		if (this.saldo < valor) {
			System.out.println("##############################");
			System.out.println("##### Saldo insuficiente #####");
			System.out.println("##############################");
			throw new Error();

		} else if (valor <= 0) {
			System.out.println("##############################");
			System.out.println("####### Valor inválido #######");
			System.out.println("##############################");
			throw new Error();

		} else if (destinatario != null) {
			this.saldo = this.saldo - valor;
			destinatario.saldo = destinatario.saldo + valor;
			System.out.println("O----------------------------O");
			System.out.println("| Transferência bem-sucedida |");
			this.quantidadeTranferencia++;

		} else {
			System.out.println("##############################");
			System.out.println("##### Cpf não existente! #####");
			System.out.println("##############################");
		}

	}

	public String getTipo() {
		return "Conta Poupança";
	}
}

package br.com.theboys.banco.contas;

public class ContaCorrente extends Conta implements Tributavel {

	private static final double TAXA1 = 0.10;
	private static final double TAXA2 = 0.20;
	private double taxaTotal = 0;

	public String getTipo() {
		return "Conta Corrente";
	}

	public static double getTaxa1() {
		return TAXA1;
	}

	public static double getTaxa2() {
		return TAXA2;
	}

	public void saca(double valor) {

		if (valor <= 0) {
			System.out.println("##############################");
			System.out.println("####### Valor inválido #######");
			System.out.println("##############################");
			throw new Error();
		} else if (valor + TAXA1 > this.saldo) {
			System.out.println("##############################");
			System.out.println("##### Saldo insuficiente #####");
			System.out.println("##############################");
			throw new Error();
		} else {
			this.saldo = saldo - valor - TAXA1;
			System.out.println("O----------------------------O");
			System.out.println("| Valor retirado com sucesso |");
			taxaTotal += TAXA1;
			this.quantidadeSaque++;
		}
	}

	public void deposita(double valor) {

		if (valor <= TAXA1) {
			System.out.println("##############################");
			System.out.println("####### Valor inválido #######");
			System.out.println("##############################");
			throw new Error();
		} else {
			this.saldo = saldo + valor - TAXA1;
			System.out.println("O----------------------------O");
			System.out.println("|Valor depositado com sucesso|");
			taxaTotal += TAXA1;
			this.quantidadeDeposito++;
		}
	}

	public void transfere(double valor, Conta destinatario) {

		if (this.saldo < (valor + TAXA2)) {
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
			this.saldo = this.saldo - valor - TAXA2;
			destinatario.saldo = destinatario.saldo + valor;
			System.out.println("O----------------------------O");
			System.out.println("| Transferência bem-sucedida |");
			taxaTotal += TAXA2;
			this.quantidadeTranferencia++;

		} else {
			System.out.println("##### Cpf não existente! #####");
		}
	}

	@Override
	public double getValorImposto() {
		return taxaTotal;
	}

}

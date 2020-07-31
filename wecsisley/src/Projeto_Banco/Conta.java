package Projeto_Banco;

public class Conta {

	int numero;
	final int agencia = 101;
	String titular;
	String dataAbertura;
	double saldo;
	final double TAXA = 0.0025;

	void saca(double valor) {
		if (this.saldo < valor) {
			System.out.printf("\nSaldo insuficiente para realizar o saque" + "\nSeu saldo atual é de: R$ %.2f%n",
					this.saldo);
		} else {
			System.out.printf("\n" + this.titular + ": " + "\nSaque realizado com sucesso !"
					+ "\nSeu saldo atual é de: R$ %.2f%n", (this.saldo - valor));
		}
	}

	void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	void transferePara(Conta destino, double valor) {
		if (this.saldo >= valor) {
			destino.saldo = destino.saldo + valor;
			this.saldo = this.saldo - valor;
			System.out.println("\nTrnasferência realizada com sucesso !");
		} else {
			System.out.println(
					"Saldo insuficiênte para realizar a transferencia" + " seu saldo atual é de: " + this.saldo);
		}
	}

	void rendimentoMensal() {
		double saldoAtual = this.saldo;
		if (saldoAtual > 0) {
			this.saldo = this.saldo * TAXA + this.saldo;
			System.out.printf("Saldo após rendimentos: R$ %.2f", this.saldo);
		} else {

		}
	}

	void consultaSaldo() {
		System.out.printf("Saldo Atual de " + this.titular + ": R$ %.2f%n", this.saldo);
	}

	void recuperaDados() {
		System.out.println("\n\nDados da conta recuperados: ");
		System.out.print("\nTítular da conta: " + this.titular);
		System.out.print("\nNúmero da conta: " + this.numero);
		System.out.print("\nAgência: " + this.agencia);
		System.out.printf("\nSaldo Atual: R$ %.2f", this.saldo);
		System.out.print("\nRendimento mensal: " + this.TAXA + "%");
		System.out.print("\nData de abertura: " + this.dataAbertura);
	}
}

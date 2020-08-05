package br.com.caelum.contas.modelo;

import javax.swing.JOptionPane;

public class Conta {

	protected int numero;
	protected int agencia;
	protected String titular;
	protected String dataAbertura;
	protected double saldo;
	protected final double SELIC = 0.025;
	protected double taxaCorrente = 2.00;
	protected double taxaPoupanca = 1.00;
	
	

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public String consultaTipo() {
		return "";
	}
	
	public void consultaTaxaCorrente() {
		System.out.printf("Taxa para operaçõe em conta corrente: R$ " + taxaCorrente + "\n");
	}
	
	public void consultaTaxaPoupanca() {
		System.out.printf("Taxa para operaçõe em conta poupança: R$ " + taxaPoupanca + "\n");
	}
	public double taxaCorrente() {
		this.saldo = this.saldo - taxaCorrente;
		return this.saldo;
		
	}
	public double taxaPoupanca() {
		this.saldo = this.saldo - taxaPoupanca;
		return this.saldo;
		
	}
	
	public void saca(double valor) {
		if (this.saldo < valor) {
			System.out.printf("\nSaldo insuficiente para realizar o saque" + "\nSeu saldo atual é de: R$ %.2f%n",
					this.saldo);
		} else {
			System.out.printf("\n" + this.titular + ": " + "\nSaque realizado com sucesso !"
					+ "\nSeu saldo atual é de: R$ %.2f%n", (this.saldo - valor));
		}
	}

	public void deposita(double quantidade) {
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

	public void rendimentoMensal() {
		double saldoAtual = this.saldo;
		if (saldoAtual > 0) {
			this.saldo = this.saldo * SELIC + this.saldo;
			System.out.printf("Saldo após rendimentos: R$ %.2f", this.saldo);
		} else {

		}
	}

	public void consultaSaldo() {
		System.out.printf("Saldo Atual de " + this.titular + ": R$ %.2f%n", this.saldo);
	}

	public Conta criaConta() {

		String entradaTeclado;
		int saidaTeclado;

		entradaTeclado = JOptionPane.showInputDialog("\nDigite:\n1 - Para nova conta \n" + "0 - Para encerrar");
		saidaTeclado = Integer.parseInt(entradaTeclado);

		if (saidaTeclado == 1) {
			entradaTeclado = JOptionPane
					.showInputDialog("Digite:\n1 - Para conta corrente\n" + "2 - Para conta poupança");
			saidaTeclado = Integer.parseInt(entradaTeclado);
			if (saidaTeclado == 1) {
				return new ContaCorrente();
			} else if (saidaTeclado == 2) {
				return  new ContaPoupanca();
			} else {
				System.out.println("Valor inválido");
			}
		}
		if (saidaTeclado == 0) {
			System.out.println("Saiu");
		} else {
			System.out.println("Valor digitado inválido");
		}
		return null;
	}
	
	public void preencheConta() {

		String entradaTitular = JOptionPane.showInputDialog("Informe o nome do títular: ");
		String entradaNuemro = JOptionPane.showInputDialog("Informe o numero para a conta: ");
		int saidaNumero = Integer.parseInt(entradaNuemro);
		String entradaAgencia = JOptionPane.showInputDialog("Informe o numero para a agencia: ");
		int saidaAgencia = Integer.parseInt(entradaAgencia);

		this.titular = entradaTitular;
		this.numero = saidaNumero;
		this.agencia = saidaAgencia;
	}
	
	public void recuperaDados() {
		System.out.println("\n\nDados da conta recuperados: ");
		System.out.print("\nTítular da conta: " + this.titular);
		System.out.print("\nNúmero da conta: " + this.numero);
		System.out.print("\nAgência: " + this.agencia);
		System.out.printf("\nSaldo Atual: R$ %.2f", this.saldo);
		System.out.print("\nRendimento mensal: " + this.SELIC + "%");
		System.out.print("\nData de abertura: " + this.dataAbertura);
	}
}

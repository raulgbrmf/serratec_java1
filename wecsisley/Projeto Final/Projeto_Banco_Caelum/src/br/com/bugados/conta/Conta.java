package br.com.bugados.conta;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import br.com.bugados.util.RelatoriosBanco;

public class Conta {

	protected String titular;
	protected int numero;
	protected int agencia;
	protected String tipo;
	protected int cpf;
	protected double saldo;

	public Conta() {

	}

	public Conta(int cpf, int numero, int agencia, double saldo) {
		this.cpf = cpf;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public static Map<Integer, Conta> lerConta() throws IOException, FileNotFoundException {
		String linha;

		try (BufferedReader csvReader = new BufferedReader(new FileReader("Conta.txt"))) {
			linha = csvReader.readLine();

			Map<Integer, Conta> mapConta = new HashMap<>();

			while ((linha = csvReader.readLine()) != null) {

				linha = linha.replace("\"", "");

				String[] data = linha.split(";");

				int cpf = Integer.parseInt(data[0]);
				int numero = Integer.parseInt(data[1]);
				int agencia = Integer.parseInt(data[2]);
				double saldo = Integer.parseInt(data[3]);

				Conta novaConta = new Conta(cpf, numero, agencia, saldo);
				mapConta.put(cpf, novaConta);

			}
			return mapConta;
		}
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

	public void consultaTipo() {

	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente!!!");
		} else {
			this.saldo -= valor;
		}
	}

	public void transferePara(Conta destino, double valor) {
		if (this.saldo >= valor) {
			destino.saldo = destino.saldo + valor;
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Não há saldo suficiente para transferir esse valor!!!");
		}
	}

	public void menuOpcoes(double valorSaca, double valorDeposito, Conta destino, double valorTransferido) {
		this.saca(valorSaca);
		this.deposita(valorDeposito);
		this.transferePara(destino, valorTransferido);
		this.consultaSaldo();
	}

	public void consultaSaldo() {
		System.out.printf("R$ %.2f%n", this.saldo);
	}

	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getCpfTitular() {
		return cpf;
	}

	public void setCpfTitular(int cpfTitular) {
		this.cpf = cpf;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + ", tipo=" + tipo
				+ ", cpfTitular=" + cpf + ", saldo=" + saldo + "]";
	}

}

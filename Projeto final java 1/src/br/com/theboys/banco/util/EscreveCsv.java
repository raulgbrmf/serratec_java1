package br.com.theboys.banco.util;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

import br.com.theboys.banco.contas.Conta;
import br.com.theboys.banco.contas.ContaCorrente;

public class EscreveCsv {
	public static void salva(List<Conta> contas) {

		PrintStream stream;
		try {
			stream = new PrintStream("Conta.csv");
			for (Conta conta : contas) {
				stream.println(conta.getTipo() + "," + conta.getCpf() + ","
						+ conta.getTitular() + "," + conta.getAgencia() + ","
						+ conta.getNumero() + "," + conta.getSaldo());
			}
			stream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void salvaRelatorio(List<Conta> contas) {

		PrintStream stream;
		try {
			stream = new PrintStream("Relatorio.txt");
			for (Conta conta : contas) {
				if (conta.getTipo().equals("Conta Corrente")) {
					ContaCorrente conta1 = (ContaCorrente) conta;
					stream.println(conta.getTipo() + " - " + "Nº da conta: "
							+ conta.getNumero() + " - " + "Saldo: "
							+ conta.getSaldo());
					stream.println("Tributação Conta Corrente: "
							+ conta1.getValorImposto());

				} else if (conta.getTipo().equals("Conta Poupança")) {
					stream.println(conta.getTipo() + " - " + "Nº da conta: "
							+ conta.getNumero() + " - " + "Saldo: "
							+ conta.getSaldo());
				} else {
					System.out.println("Tipo inválido!");
				}
			}
			stream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void salvaRelatorio(Conta conta) {

		PrintStream stream;
		String arquivo = conta.getTitular().trim() + ".txt";
		try {
			stream = new PrintStream(arquivo);
			if (conta.getTipo().equals("Conta Corrente")) {

				stream.println("Titular: " + conta.getTitular().trim()
						+ " Cpf: " + conta.getCpf() + " Agência: "
						+ conta.getAgencia() + " Nº da conta: "
						+ conta.getNumero() + " Saldo: " + conta.getSaldo());
				stream.println("\nValor cobrado saque (taxa): "
						+ ContaCorrente.getTaxa1() + " quantidade de saques: "
						+ conta.getQuantidadeSaque() + " Valor total (taxa): "
						+ (conta.getQuantidadeSaque()
								* ContaCorrente.getTaxa1()));
				stream.println("\nValor cobrado deposito (taxa): "
						+ ContaCorrente.getTaxa1()
						+ " quantidade de depósitos: "
						+ conta.getQuantidadeDeposito()
						+ " Valor total (taxa): "
						+ (conta.getQuantidadeDeposito()
								* ContaCorrente.getTaxa1()));
				stream.println("\nValor cobrado transferência (taxa): "
						+ ContaCorrente.getTaxa2()
						+ " quantidade de transferências: "
						+ conta.getQuantidadeTranferencia()
						+ " Valor total (taxa): "
						+ (conta.getQuantidadeTranferencia()
								* ContaCorrente.getTaxa2()));
			} else {
				stream.println("Titular: " + conta.getTitular().trim()
						+ " Cpf: " + conta.getCpf() + " Agência: "
						+ conta.getAgencia() + " Nº da conta: "
						+ conta.getNumero() + " Saldo: " + conta.getSaldo());
				stream.println("\nquantidade de saques: "
						+ conta.getQuantidadeSaque());
				stream.println("\nquantidade de depósitos: "
						+ conta.getQuantidadeDeposito());
				stream.println("\nquantidade de transferências: "
						+ conta.getQuantidadeTranferencia());
			}
			stream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}

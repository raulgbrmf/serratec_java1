package br.com.theboys.banco.relatorios;

import br.com.theboys.banco.contas.Conta;
import br.com.theboys.banco.contas.ContaCorrente;

public class RelatorioCliente {
	public static void relatorioCliente(Conta conta) {
		if (conta.getTipo().equals("Conta Corrente")) {
			System.out.println("Titular: " + conta.getTitular().trim()
					+ " Cpf: " + conta.getCpf() + " Agência: "
					+ conta.getAgencia() + " Nº da conta: " + conta.getNumero()
					+ " Saldo: " + conta.getSaldo());
			System.out.println("\nValor cobrado saque (taxa): "
					+ ContaCorrente.getTaxa1() + " quantidade de saques: "
					+ conta.getQuantidadeSaque() + " Valor total (taxa): "
					+ (conta.getQuantidadeSaque() * ContaCorrente.getTaxa1()));
			System.out.println("\nValor cobrado deposito (taxa): "
					+ ContaCorrente.getTaxa1() + " quantidade de depósitos: "
					+ conta.getQuantidadeDeposito() + " Valor total (taxa): "
					+ (conta.getQuantidadeDeposito()
							* ContaCorrente.getTaxa1()));
			System.out.println("\nValor cobrado transferência (taxa): "
					+ ContaCorrente.getTaxa2()
					+ " quantidade de transferências: "
					+ conta.getQuantidadeTranferencia()
					+ " Valor total (taxa): "
					+ (conta.getQuantidadeTranferencia()
							* ContaCorrente.getTaxa2())
					+ "\n");

		} else {
			System.out.println("Titular: " + conta.getTitular().trim()
					+ " Cpf: " + conta.getCpf() + " Agência: "
					+ conta.getAgencia() + " Nº da conta: " + conta.getNumero()
					+ " Saldo: " + conta.getSaldo());
			System.out.println(
					"\nquantidade de saques: " + conta.getQuantidadeSaque());
			System.out.println("\nquantidade de depósitos: "
					+ conta.getQuantidadeDeposito());
			System.out.println("\nquantidade de transferências: "
					+ conta.getQuantidadeTranferencia() + "\n");
		}
	}
}

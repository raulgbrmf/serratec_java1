package br.com.theboys.banco.telas;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import br.com.theboys.banco.contas.Conta;
import br.com.theboys.banco.relatorios.RelatorioCliente;
import br.com.theboys.banco.relatorios.RelatorioDiretor;
import br.com.theboys.banco.relatorios.RelatorioPresidente;
import br.com.theboys.banco.util.EscreveCsv;
import br.com.theboys.banco.util.LerCsv;
import br.com.theboys.banco.util.LimpaTela;
import br.com.theboys.banco.util.SimulacaoPoupanca;

public class TelaPresidente {

	public static void telaMenuPresidente(Conta conta) throws FileNotFoundException {

		int opcao = 0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("O----------------------------O");
		System.out.println("| Presidente: " + conta.getTitular());
		System.out.println("O----------------------------O");
		System.out.println("| Saldo: R$ " + conta.getSaldo());
		System.out.println("O----------------------------O");
		System.out.println("|        Movimentações       |");
		System.out.println("|        " + conta.getTipo() + "      |");
		System.out.println("O----------------------------O");
		System.out.println("|    1 - Saque               |");
		System.out.println("|    2 - Depósito            |");
		System.out.println("|    3 - Transferência       |");
		System.out.println("|    4 - Simulação Poupança  |");
		System.out.println("|    5 - Relatório           |");
		System.out.println("|    9 - Sair                |");
		System.out.println("O----------------------------O");
		System.out.print("|-> Escolha uma operação: ");
		opcao = scanner.nextInt();
		LimpaTela.limpa();
		double valor = .0;
		String cpf = null;

		Map<String, Conta> contasMap = LerCsv.carregaConta();
		contasMap.put(conta.getCpf(), conta);
		List<Conta> contas = new ArrayList<Conta>(contasMap.values());

		try {
			switch (opcao) {
			case 1:
				System.out.println("O----------------------------O");
				System.out.println("|           Saque            |");
				System.out.println("O----------------------------O");
				System.out.println("| Saldo: R$ " + conta.getSaldo());
				System.out.println("O----------------------------O");
				System.out.print("|-> Digite o valor: R$ ");
				valor = scanner.nextDouble();
				LimpaTela.limpa();
				conta.saca(valor);
				break;
			case 2:
				System.out.println("O----------------------------O");
				System.out.println("|          Deposito          |");
				System.out.println("O----------------------------O");
				System.out.println("| Saldo: R$ " + conta.getSaldo());
				System.out.println("O----------------------------O");
				System.out.print("|-> Digite o valor: R$ ");
				valor = scanner.nextDouble();
				LimpaTela.limpa();
				conta.deposita(valor);
				break;
			case 3:
				System.out.println("O----------------------------O");
				System.out.println("|        Transferência       |");
				System.out.println("O----------------------------O");
				System.out.println("| Saldo: R$ " + conta.getSaldo());
				System.out.println("O----------------------------O");
				System.out.print("|-> Digite o valor: R$ ");
				valor = scanner.nextDouble();
				System.out.println("O----------------------------O");
				System.out.print("|-> Cpf do destinatario: ");
				cpf = scanner.next();
				LimpaTela.limpa();
				try {
					conta.transfere(valor, contasMap.get(cpf));
				} catch (RuntimeException e) {
					System.out.println("##############################");
					System.out.println("##### Cpf não existente! #####");
					System.out.println("##############################");
				}
				break;
			case 4:
				SimulacaoPoupanca.simulacaoPoupanca();
				break;
			case 5:
				RelatorioCliente.relatorioCliente(conta);
				EscreveCsv.salvaRelatorio(conta);
				RelatorioDiretor.relatorioDiretor(contas, conta);
				RelatorioPresidente.relatorioPresidente(contas, conta);
				break;
			case 9:
				Tela.telaMenu();
				break;
			default:
				System.out.println("##############################");
				System.out.println("####### Opção inválida #######");
				System.out.println("##############################");
			}
		} catch (Error e) {
			System.out.println(e);
		}

		EscreveCsv.salva(contas);
		telaMenuPresidente(conta);
	}
}

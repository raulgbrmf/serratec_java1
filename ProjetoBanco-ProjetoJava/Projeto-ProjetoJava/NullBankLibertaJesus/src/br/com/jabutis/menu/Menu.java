package br.com.jabutis.menu;

import java.util.ArrayList;
import java.util.Collections;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import br.com.jabutis.contas.*;
import br.com.jabutis.usuarios.*;
import br.com.jabutis.contas.SeguroDeVida;

import java.io.*;

import br.com.jabutis.main.*;

public class Menu {
	
	List<Double> taxaTotal = new ArrayList<>();
	int opcaoseguro;
	
	public void menuOperacoesC(Usuario usuarioLogado, Conta contaLogada, List imprime3) throws IOException {
		
		
		FileWriter arqSaca = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Cliente\\Saca.txt");
		FileWriter arqDep = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Cliente\\Deposito.txt");
		FileWriter arqTransf = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Cliente\\Transferencia.txt");
		FileWriter arqTribu = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Cliente\\Tributacao.txt");
		FileWriter arqRendimento = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Cliente\\Rendimento.txt");
		
		PrintWriter gravaSaca = new PrintWriter(arqSaca);
		PrintWriter gravaDep = new PrintWriter(arqDep);
		PrintWriter gravaTransf = new PrintWriter(arqTransf);
		PrintWriter gravaTribu = new PrintWriter(arqTribu);
		PrintWriter gravaRendimento = new PrintWriter(arqRendimento);
		
		Scanner scan = new Scanner(System.in);

		System.out.println(" ____________________________________");
		System.out.println("|     Escolha uma das operacoes      |");
		System.out.println("|                                    |");
		System.out.println("| Opcao 1 -    Verificar Saldo       |");
		System.out.println("| Opcao 2 -    Sacar                 |");
		System.out.println("| Opcao 3 -    Depositar             |");
		System.out.println("| Opcao 4 -    Transferencia         |");
		System.out.println("| Opcao 5 -    Tributacao            |");
		System.out.println("| Opcao 6 -    Rendimento            |");
		System.out.println("| Opcao 7 -    Seguro de vida        |");
		System.out.println("| Opcao 8 -    Sair                  |");
		System.out.println("|____________________________________|");
		System.out.println(" Digite uma opcao: ");
		int opcao = scan.nextInt();	
		
		
		switch (opcao) {
		
		
		case 1:
			
			System.out.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());

			menuOperacoesC(usuarioLogado, contaLogada, imprime3);

			break;

		case 2:
			System.out.println("Valor que deseja sacar: R$ ");
			double valorSaque = scan.nextDouble();
			
			try {
				if (contaLogada.getTipo() == "CC") {
					contaLogada.saca(valorSaque);
					taxaTotal.add(0.10);
					gravaSaca.println("Valor que deseja sacar: R$ " + valorSaque);
				}else if(contaLogada.getTipo() == "CP"){
					contaLogada.saca(valorSaque);
					gravaSaca.println("Valor que deseja sacar: R$ " + valorSaque);
				}
				System.out.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());
				gravaSaca.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());
			
			}
			catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
			catch(SaldoInsuficienteException e ){
				System.out.println(e.getMessage());
			}
			
			menuOperacoesC(usuarioLogado, contaLogada, imprime3);
		
			break;

		case 3:
			
			System.out.println("Valor que deseja depositar: R$ ");
			double valorDeposita = scan.nextDouble();
			try {
				if (contaLogada.getTipo() == "CC") {
					contaLogada.deposita(valorDeposita);
					taxaTotal.add(0.10);
				}else if(contaLogada.getTipo() == "CP"){
					contaLogada.deposita(valorDeposita);
				}	
					gravaDep.println("Valor que deseja depositar: R$ " + valorDeposita);
					System.out.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());
					gravaDep.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());
				
			}
			catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
			
			menuOperacoesC(usuarioLogado, contaLogada, imprime3);
			
			break;

		case 4: 
			Conta contaTransf = null;
			SistemaInterno1 sisInt = new SistemaInterno1();
			
			
			System.out.println("Informe o cpf da conta para transferencia: ");
			long cpfTransf = scan.nextLong();
			System.out.println("Informe o valor para transferencia: R$ ");
			double valorTransf = scan.nextDouble();
			
			try {
				if (contaLogada.getTipo() == "CC") {
				contaTransf = sisInt.criaConta(cpfTransf, sisInt.mapaContas());
				contaLogada.transfere(contaTransf, valorTransf);
				System.out.println("Transferencia Realizada com sucesso para a conta " + contaTransf.getNumConta() + " da agencia " + contaTransf.getIdAgencia() + "!");
				taxaTotal.add(0.20);
				} else if(contaLogada.getTipo() =="CP"){
					contaTransf = sisInt.criaConta(cpfTransf, sisInt.mapaContas());
					contaLogada.transfere(contaTransf, valorTransf);
					System.out.println("Transferencia Realizada com sucesso para a conta " + contaTransf.getNumConta() + " da agencia " + contaTransf.getIdAgencia() + "!");
				}
				gravaTransf.println("Informe o cpf da conta para transferencia: " + cpfTransf);
				gravaTransf.println("Informe o valor para transferencia: R$ " + valorTransf);
				gravaTransf.println("Transferencia Realizada com sucesso para a conta " + contaTransf.getNumConta() + " da agencia " + contaTransf.getIdAgencia() + "!");
			}
			catch(NullPointerException e){
				System.out.println(e.getMessage());
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			catch(SaldoInsuficienteException e){
				System.out.println(e.getMessage());
			}
			
			menuOperacoesC(usuarioLogado, contaLogada, imprime3);

			break;

		case 5: 
			
			double soma = 0;
			for(int i = 0; i < taxaTotal.size(); i++){ 
				soma += taxaTotal.get(i);
			}
			
			if (contaLogada.getTipo() == "CC") {
				System.out.println("AVISO:");
				System.out.println("Para cada saque sera cobrado o valor de: R$ 0.10 ");
				System.out.println("Para cada depósito sera cobrado o valor de: R$ 0.10 ");
				System.out.println("Para cada transferencia sera cobrado o valor de: R$ 0.20 ");
				System.out.println("Caso opte em ter seguro de vida o tributo será 20% do valor assegurado.");
				System.out.println("-------------------------------------------------------------");
				System.out.println("Total de tributacao: R$ "+ soma);
				
				gravaTribu.println("AVISO:");
				gravaTribu.println("Para cada saque sera cobrado o valor de: R$ 0.10 ");
				gravaTribu.println("Para cada depósito sera cobrado o valor de: R$ 0.10 ");
				gravaTribu.println("Para cada transferencia sera cobrado o valor de: R$ 0.20 ");
				gravaTribu.println("Caso opte em ter seguro de vida o tributo será 20% do valor assegurado. ");
				gravaTribu.println("-------------------------------------------------------------");
				gravaTribu.println("Total de tributacao: R$ "+ soma);
				
			} else if (contaLogada.getTipo() == "CP" && opcaoseguro == 1){
				System.out.println("Caso opte em ter seguro de vida o tributo será 20% do valor assegurado.");
				System.out.println("-------------------------------------------------------------");
				System.out.println("Total de tributacao: R$ "+ soma);
				gravaTribu.println("Caso opte em ter seguro de vida o tributo será 20% do valor assegurado. ");
				gravaTribu.println("-------------------------------------------------------------");
				gravaTribu.println("Total de tributacao: R$ "+ soma);
				
			} else{
				System.out.println("Conta Poupanca nao tem tributacao");
			}
			
			
			menuOperacoesC(usuarioLogado, contaLogada, imprime3);
			break;

		case 6:
			
			if (contaLogada.getTipo() == "CP") {
				
				System.out.println("Informe o o valor que deseja simular: ");
				double valorSimu = scan.nextDouble();
				System.out.println("Informe o numero de dias que deseja simular: ");
				int diasSimu = scan.nextInt();
				
				gravaRendimento.println("Informe o o valor que deseja simular: " + valorSimu);
				gravaRendimento.println("Informe o numero de dias que deseja simular: " + diasSimu);
				
				
				double rend = valorSimu * 0.0010 * diasSimu;
				double valorFinal = valorSimu + rend;
				
				System.out.println("O seu redimento vai ser de: R$ "+ rend);
				System.out.println("O valor final será de: R$" + valorFinal);
				gravaRendimento.println("O seu redimento vai ser de: R$ "+ rend);
				gravaRendimento.println("O valor final será de: R$" + valorFinal);
				
			} else {
				System.out.println("Sua Conta e uma Conta Corrente, portanto nao possui rendimento.");
			}
			
			menuOperacoesC(usuarioLogado, contaLogada, imprime3);
			
			break;
			
		case 7:
			//int opcaoseguro;
			System.out.println("Deseja contratar o seguro de vida? ");
			System.out.println("1 - para sim");
			System.out.println("2 - para retornar ao menu anterior");
			opcaoseguro = scan.nextInt();
			
			if (opcaoseguro == 1) {
				System.out.println("Nos cobramos uma taxa de 20% do valor como tributo do seguro.");
				System.out.println("Informe o valor que sera segurado: ");
				double valorDigitado = scan.nextDouble();
				contaLogada.contrataSeguro(valorDigitado);	
				System.out.println("Taxa de tributacao: R$ " + contaLogada.contrataSeguro(valorDigitado));
				
				taxaTotal.add(contaLogada.contrataSeguro(valorDigitado));
				contaLogada.descontoSeguro(contaLogada.contrataSeguro(valorDigitado));
				
				menuOperacoesC(usuarioLogado, contaLogada, imprime3);
				
			} else if (opcaoseguro == 2) {
				
				menuOperacoesC(usuarioLogado, contaLogada, imprime3);
				
			}
			
			
			break;
			
		case 8:

			System.out.println("Operacao finalizada");

			break;

		default:

			System.out.println("Opcao invalida");

			menuOperacoesC(usuarioLogado, contaLogada, imprime3);
			
			
		}
		
	arqRendimento.close();	
	arqTribu.close();
	arqTransf.close();
	arqDep.close();
	arqSaca.close();
	scan.close();
	}

	public void menuOperacoesG(Usuario usuarioLogado, Conta contaLogada, int quantContas, List imprime3) throws IOException {
		FileWriter arqSaca = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Gerente\\Saca.txt");
		FileWriter arqDep = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Gerente\\Deposito.txt");
		FileWriter arqTransf = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Gerente\\Transferencia.txt");
		FileWriter arqTribu = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Gerente\\Tributacao.txt");
		FileWriter arqRelContas = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Gerente\\RelatorioContas.txt");
		FileWriter arqRendimento = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Gerente\\Rendimento.txt");
		
		PrintWriter gravaSaca = new PrintWriter(arqSaca);
		PrintWriter gravaDep = new PrintWriter(arqDep);
		PrintWriter gravaTransf = new PrintWriter(arqTransf);
		PrintWriter gravaTribu = new PrintWriter(arqTribu);
		PrintWriter gravaRelContas = new PrintWriter(arqRelContas);
		PrintWriter gravaRendimento = new PrintWriter(arqRendimento);
			
		Scanner scan = new Scanner(System.in);

		System.out.println(" ____________________________________");
		System.out.println("|     Escolha uma das operacoes      |");
		System.out.println("|                                    |");
		System.out.println("| Opcao 1 -    Verificar Saldo       |");
		System.out.println("| Opcao 2 -    Sacar                 |");
		System.out.println("| Opcao 3 -    Depositar             |");
		System.out.println("| Opcao 4 -    Transferencia         |");
		System.out.println("| Opcao 5 -    Tributacao            |");
		System.out.println("| Opcao 6 -    Relatorio de Contas   |");
		System.out.println("| Opcao 7 -    Rendimento            |");
		System.out.println("| Opcao 8 -    Seguro de vida        |");
		System.out.println("| Opcao 9 -    Sair                  |");
		System.out.println("|____________________________________|");
		System.out.println(" Digite uma opcao: ");
		int opcao = scan.nextInt();

		switch (opcao) {

		case 1:

			System.out.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());

			menuOperacoesG(usuarioLogado, contaLogada, quantContas, imprime3);

			break;

		case 2:

			System.out.println("Valor que deseja sacar: R$ ");
			double valorSaque = scan.nextDouble();
			
			try {
				if (contaLogada.getTipo() == "CC") {
					contaLogada.saca(valorSaque);
					taxaTotal.add(0.10);
					gravaSaca.println("Valor que deseja sacar: R$ " + valorSaque);
				}else if(contaLogada.getTipo() == "CP"){
					contaLogada.saca(valorSaque);
					gravaSaca.println("Valor que deseja sacar: R$ " + valorSaque);
				}
				System.out.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());
				gravaSaca.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());
				
				
			}
			catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
			catch(SaldoInsuficienteException e ){
				System.out.println(e.getMessage());
			}
			
			
		menuOperacoesG(usuarioLogado, contaLogada, quantContas, imprime3);

			break;

		case 3:

			System.out.println("Valor que deseja depositar: R$ ");
			double valorDeposita = scan.nextDouble();
			try {
				if (contaLogada.getTipo() == "CC") {
					contaLogada.deposita(valorDeposita);
					taxaTotal.add(0.10);
				}else if(contaLogada.getTipo() == "CP"){
					contaLogada.deposita(valorDeposita);
				}	
					gravaDep.println("Valor que deseja depositar: R$ " + valorDeposita);
					System.out.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());
					gravaDep.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());
				
			}
			catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
			
			menuOperacoesG(usuarioLogado, contaLogada, quantContas, imprime3);

			break;

		case 4:

			Conta contaTransf = null;
			SistemaInterno1 sisInt = new SistemaInterno1();
			
			
			System.out.println("Informe o cpf da conta para transferencia: ");
			long cpfTransf = scan.nextLong();
			System.out.println("Informe o valor para transferencia: R$ ");
			double valorTransf = scan.nextDouble();
			
			try {
				if (contaLogada.getTipo() == "CC") {
				contaTransf = sisInt.criaConta(cpfTransf, sisInt.mapaContas());
				contaLogada.transfere(contaTransf, valorTransf);
				System.out.println("Transferencia Realizada com sucesso para a conta " + contaTransf.getNumConta() + " da agencia " + contaTransf.getIdAgencia() + "!");
				taxaTotal.add(0.20);
				} else if(contaLogada.getTipo() =="CP"){
					contaTransf = sisInt.criaConta(cpfTransf, sisInt.mapaContas());
					contaLogada.transfere(contaTransf, valorTransf);
					System.out.println("Transferencia Realizada com sucesso para a conta " + contaTransf.getNumConta() + " da agencia " + contaTransf.getIdAgencia() + "!");
				}
				gravaTransf.println("Informe o cpf da conta para transferencia: " + cpfTransf);
				gravaTransf.println("Informe o valor para transferencia: R$ " + valorTransf);
				gravaTransf.println("Transferencia Realizada com sucesso para a conta " + contaTransf.getNumConta() + " da agencia " + contaTransf.getIdAgencia() + "!");
			}
			catch(NullPointerException e){
				System.out.println(e.getMessage());
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			catch(SaldoInsuficienteException e){
				System.out.println(e.getMessage());
			}
			
			menuOperacoesG(usuarioLogado, contaLogada, quantContas, imprime3);

			break;

		case 5:
			
			double soma = 0;
			for(int i = 0; i < taxaTotal.size(); i++){ 
				soma += taxaTotal.get(i);
			}
			
			if (contaLogada.getTipo() == "CC") {
				System.out.println("AVISO:");
				System.out.println("Para cada saque sera cobrado o valor de: R$ 0.10 ");
				System.out.println("Para cada depósito sera cobrado o valor de: R$ 0.10 ");
				System.out.println("Para cada transferencia sera cobrado o valor de: R$ 0.20 ");
				System.out.println("Caso opte em ter seguro de vida o tributo será 20% do valor assegurado.");
				System.out.println("-------------------------------------------------------------");
				System.out.println("Total de tributacao: R$ "+soma);
				
				gravaTribu.println("AVISO:");
				gravaTribu.println("Para cada saque sera cobrado o valor de: R$ 0.10 ");
				gravaTribu.println("Para cada depósito sera cobrado o valor de: R$ 0.10 ");
				gravaTribu.println("Para cada transferencia sera cobrado o valor de: R$ 0.20 ");
				gravaTribu.println("Caso opte em ter seguro de vida o tributo será 20% do valor assegurado. ");
				gravaTribu.println("-------------------------------------------------------------");
				gravaTribu.println("Total de tributacao: R$ "+soma);
				
			} else {
				
				System.out.println("Conta Poupanca nao tem tributacao");
				
			}
						
			menuOperacoesG(usuarioLogado, contaLogada, quantContas, imprime3);
			
			break;

		case 6: 
			
			System.out.println("A quantidade de contas na sua agencia é: " + quantContas + " Contas");
			gravaRelContas.println("A quantidade de contas na sua agencia é: " + quantContas + " Contas");
				
			menuOperacoesG(usuarioLogado, contaLogada, quantContas, imprime3);
		
			break;
			
		case 7:
			
			if (contaLogada.getTipo() == "CP") {
				
				System.out.println("Informe o o valor que deseja simular: ");
				double valorSimu = scan.nextDouble();
				System.out.println("Informe o numero de dias que deseja simular: ");
				int diasSimu = scan.nextInt();
				
				gravaRendimento.println("Informe o o valor que deseja simular: " + valorSimu);
				gravaRendimento.println("Informe o numero de dias que deseja simular: " + diasSimu);
				
				
				double rend = valorSimu * 0.0010 * diasSimu;
				double valorFinal = valorSimu + rend;
				
				System.out.println("O seu redimento vai ser de: R$ "+ rend);
				System.out.println("O valor final será de: R$" + valorFinal);
				gravaRendimento.println("O seu redimento vai ser de: R$ "+ rend);
				gravaRendimento.println("O valor final será de: R$" + valorFinal);
				
			} else {
				System.out.println("Sua Conta e uma Conta Corrente, portanto nao possui rendimento.");
			}
			
				menuOperacoesG(usuarioLogado, contaLogada, quantContas, imprime3);
			
			break;
			
		case 8:
			int opcaoseguro;
			System.out.println("Deseja contratar o seguro de vida? ");
			System.out.println("1 - para sim");
			System.out.println("2 - para retornar ao menu anterior");
			opcaoseguro = scan.nextInt();
			
			if (opcaoseguro == 1) {
				System.out.println("Nos cobramos uma taxa de 20% do valor como tributo do seguro.");
				System.out.println("Informe o valor que sera segurado: ");
				double valorDigitado = scan.nextDouble();
				contaLogada.contrataSeguro(valorDigitado);	
				System.out.println("Taxa de tributacao: R$ " + contaLogada.contrataSeguro(valorDigitado));
				
				taxaTotal.add(contaLogada.contrataSeguro(valorDigitado));
				contaLogada.descontoSeguro(contaLogada.contrataSeguro(valorDigitado));
				
				menuOperacoesG(usuarioLogado, contaLogada, quantContas, imprime3);
				
			} else if (opcaoseguro == 2) {
				
				menuOperacoesG(usuarioLogado, contaLogada, quantContas, imprime3);
				
			}
			
			break;
			
		case 9:
			
			System.out.println("Operacao finalizada");
			
			break;

		default:

			System.out.println("Opcao invalida");

			menuOperacoesG(usuarioLogado, contaLogada, quantContas, imprime3);

		}
		
		arqRelContas.close();
		arqRendimento.close();	
		arqTribu.close();
		arqTransf.close();
		arqDep.close();
		arqSaca.close();
		scan.close();
	}

	public void menuOperacoesD(Usuario usuarioLogado, Conta contaLogada, int quantContas, List imprime, List imprime3) throws IOException  {
		FileWriter arqSaca = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Diretor\\Saca.txt");
		FileWriter arqDep = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Diretor\\Deposito.txt");
		FileWriter arqTransf = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Diretor\\Transferencia.txt");
		FileWriter arqTribu = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Diretor\\Tributacao.txt");
		FileWriter arqRelContas = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Diretor\\RelatorioContas.txt");
		FileWriter arqRelClientes = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Diretor\\RelatorioClientes.txt");		
		FileWriter arqRendimento = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Diretor\\Rendimento.txt");
		
		PrintWriter gravaSaca = new PrintWriter(arqSaca);
		PrintWriter gravaDep = new PrintWriter(arqDep);
		PrintWriter gravaTransf = new PrintWriter(arqTransf);
		PrintWriter gravaTribu = new PrintWriter(arqTribu);
		PrintWriter gravaRelContas = new PrintWriter(arqRelContas);
		PrintWriter gravaRelClientes = new PrintWriter(arqRelClientes);
		PrintWriter gravaRendimento = new PrintWriter(arqRendimento);
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println(" ____________________________________");
		System.out.println("|     Escolha uma das operacoes      |");
		System.out.println("|                                    |");
		System.out.println("| Opcao 1 -   Verificar Saldo        |");
		System.out.println("| Opcao 2 -   Sacar                  |");
		System.out.println("| Opcao 3 -   Depositar              |");
		System.out.println("| Opcao 4 -   Transferencia          |");
		System.out.println("| Opcao 5 -   Tributacao             |");
		System.out.println("| Opcao 6 -   Relatorio de Contas    |");
		System.out.println("| Opcao 7 -   Relatorio dos Clientes |");
		System.out.println("| Opcao 8 -   Rendimento             |");
		System.out.println("| Opcao 9 -   Seguro de Vida         |");
		System.out.println("| Opcao 10 -  Sair                   |");
		System.out.println("|____________________________________|");
		System.out.println(" Digite uma opcao: ");
		int opcao = scan.nextInt();

		switch (opcao) {

		case 1:

			System.out.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());

			menuOperacoesD(usuarioLogado, contaLogada, quantContas, imprime, imprime3);

			break;

		case 2:

			System.out.println("Valor que deseja sacar: R$ ");
			double valorSaque = scan.nextDouble();
			
			try {
				if (contaLogada.getTipo() == "CC") {
					contaLogada.saca(valorSaque);
					taxaTotal.add(0.10);
					gravaSaca.println("Valor que deseja sacar: R$ " + valorSaque);
				}else if(contaLogada.getTipo() == "CP"){
					contaLogada.saca(valorSaque);
					gravaSaca.println("Valor que deseja sacar: R$ " + valorSaque);
				}
				System.out.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());
				gravaSaca.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());
				
				
			}
			catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
			catch(SaldoInsuficienteException e ){
				System.out.println(e.getMessage());
			}
			
			menuOperacoesD(usuarioLogado, contaLogada, quantContas, imprime, imprime3);

			break;

		case 3:

			System.out.println("Valor que deseja depositar: R$ ");
			double valorDeposita = scan.nextDouble();
			try {
				if (contaLogada.getTipo() == "CC") {
					contaLogada.deposita(valorDeposita);
					taxaTotal.add(0.10);
				}else if(contaLogada.getTipo() == "CP"){
					contaLogada.deposita(valorDeposita);
				}	
					gravaDep.println("Valor que deseja depositar: R$ " + valorDeposita);
					System.out.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());
					gravaDep.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());
				
			}
			catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
			
			menuOperacoesD(usuarioLogado, contaLogada, quantContas, imprime, imprime3);

			break;

		case 4: 
			
			Conta contaTransf = null;
			SistemaInterno1 sisInt = new SistemaInterno1();
			
			
			System.out.println("Informe o cpf da conta para transferencia: ");
			long cpfTransf = scan.nextLong();
			System.out.println("Informe o valor para transferencia: R$ ");
			double valorTransf = scan.nextDouble();
			
			try {
				if (contaLogada.getTipo() == "CC") {
				contaTransf = sisInt.criaConta(cpfTransf, sisInt.mapaContas());
				contaLogada.transfere(contaTransf, valorTransf);
				System.out.println("Transferencia Realizada com sucesso para a conta " + contaTransf.getNumConta() + " da agencia " + contaTransf.getIdAgencia() + "!");
				taxaTotal.add(0.20);
				} else if(contaLogada.getTipo() =="CP"){
					contaTransf = sisInt.criaConta(cpfTransf, sisInt.mapaContas());
					contaLogada.transfere(contaTransf, valorTransf);
					System.out.println("Transferencia Realizada com sucesso para a conta " + contaTransf.getNumConta() + " da agencia " + contaTransf.getIdAgencia() + "!");
				}
				gravaTransf.println("Informe o cpf da conta para transferencia: " + cpfTransf);
				gravaTransf.println("Informe o valor para transferencia: R$ " + valorTransf);
				gravaTransf.println("Transferencia Realizada com sucesso para a conta " + contaTransf.getNumConta() + " da agencia " + contaTransf.getIdAgencia() + "!");
			}
			catch(NullPointerException e){
				System.out.println(e.getMessage());
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			catch(SaldoInsuficienteException e){
				System.out.println(e.getMessage());
			}
			menuOperacoesD(usuarioLogado, contaLogada, quantContas, imprime, imprime3);

			break;

		case 5:		
			
			double soma = 0;
			for(int i = 0; i < taxaTotal.size(); i++){ 
				soma += taxaTotal.get(i);
			}
			
			if (contaLogada.getTipo() == "CC") {
				System.out.println("AVISO:");
				System.out.println("Para cada saque sera cobrado o valor de: R$ 0.10 ");
				System.out.println("Para cada depósito sera cobrado o valor de: R$ 0.10 ");
				System.out.println("Para cada transferencia sera cobrado o valor de: R$ 0.20 ");
				System.out.println("Caso opte em ter seguro de vida o tributo será 20% do valor assegurado.");
				System.out.println("-------------------------------------------------------------");
				System.out.println("Total de tributacao: R$ "+soma);
				
				gravaTribu.println("AVISO:");
				gravaTribu.println("Para cada saque sera cobrado o valor de: R$ 0.10 ");
				gravaTribu.println("Para cada depósito sera cobrado o valor de: R$ 0.10 ");
				gravaTribu.println("Para cada transferencia sera cobrado o valor de: R$ 0.20 ");
				gravaTribu.println("Caso opte em ter seguro de vida o tributo será 20% do valor assegurado. ");
				gravaTribu.println("-------------------------------------------------------------");
				gravaTribu.println("Total de tributacao: R$ "+soma);
				
			} else {
				
				System.out.println("Conta Poupanca nao tem tributacao");
				
			}
						
			menuOperacoesD(usuarioLogado, contaLogada, quantContas, imprime, imprime3);
			
			break;

		case 6: 			
			
			System.out.println("A quantidade de contas na sua agencia é: " + quantContas + " Contas");
			gravaRelContas.println("A quantidade de contas na sua agencia é: " + quantContas + " Contas");
						
			menuOperacoesD(usuarioLogado, contaLogada, quantContas, imprime, imprime3);				
		
			break;
			
		case 7:
			
			
			System.out.println(imprime);
			gravaRelClientes.println(imprime);
			
			menuOperacoesD(usuarioLogado, contaLogada, quantContas, imprime, imprime3);
			
			break;
		
		case 8:
				
			if (contaLogada.getTipo() == "CP") {
				
				System.out.println("Informe o o valor que deseja simular: ");
				double valorSimu = scan.nextDouble();
				System.out.println("Informe o numero de dias que deseja simular: ");
				int diasSimu = scan.nextInt();
				
				gravaRendimento.println("Informe o o valor que deseja simular: " + valorSimu);
				gravaRendimento.println("Informe o numero de dias que deseja simular: " + diasSimu);
				
				
				double rend = valorSimu * 0.0010 * diasSimu;
				double valorFinal = valorSimu + rend;
				
				System.out.println("O seu redimento vai ser de: R$ "+ rend);
				System.out.println("O valor final será de: R$" + valorFinal);
				gravaRendimento.println("O seu redimento vai ser de: R$ "+ rend);
				gravaRendimento.println("O valor final será de: R$" + valorFinal);
				
			} else {
				System.out.println("Sua Conta e uma Conta Corrente, portanto nao possui rendimento.");
			}
			
			
			menuOperacoesD(usuarioLogado, contaLogada, quantContas, imprime, imprime3);
			
			break;
			
		case 9:
			int opcaoseguro;
			System.out.println("Deseja contratar o seguro de vida? ");
			System.out.println("1 - para sim");
			System.out.println("2 - para retornar ao menu anterior");
			opcaoseguro = scan.nextInt();
			
			if (opcaoseguro == 1) {
				System.out.println("Nos cobramos uma taxa de 20% do valor como tributo do seguro.");
				System.out.println("Informe o valor que sera segurado: ");
				double valorDigitado = scan.nextDouble();
				contaLogada.contrataSeguro(valorDigitado);	
				System.out.println("Taxa de tributacao: R$ " + contaLogada.contrataSeguro(valorDigitado));
				
				taxaTotal.add(contaLogada.contrataSeguro(valorDigitado));
				contaLogada.descontoSeguro(contaLogada.contrataSeguro(valorDigitado));
				
				menuOperacoesD(usuarioLogado, contaLogada, quantContas, imprime, imprime3);
				
			} else if (opcaoseguro == 2) {
				
				menuOperacoesD(usuarioLogado, contaLogada, quantContas, imprime, imprime3);
				
			}
			
			
		case 10:
			
			System.out.println("Operacao finalizada");
			
			break;
			

		default:

			System.out.println("Opcao invalida");

			menuOperacoesD(usuarioLogado, contaLogada, quantContas, imprime, imprime3);

		}
		arqRelClientes.close();
		arqRelContas.close();
		arqRendimento.close();	
		arqTribu.close();
		arqTransf.close();
		arqDep.close();
		arqSaca.close();
		scan.close();
	}

	public void menuOperacoesP(Usuario usuarioLogado, Conta contaLogada, int quantContas, List imprime, List imprime2, List imprime3) throws IOException {
		FileWriter arqSaca = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Presidente\\Saca.txt");
		FileWriter arqDep = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Presidente\\Deposito.txt");
		FileWriter arqTransf = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Presidente\\Transferencia.txt");
		FileWriter arqTribu = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Presidente\\Tributacao.txt");
		FileWriter arqRelContas = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Presidente\\RelatorioContas.txt");
		FileWriter arqRelClientes = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Presidente\\RelatorioClientes.txt");
		FileWriter arqRelCapital = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Presidente\\RelatorioCapital.txt");
		FileWriter arqRendimento = new FileWriter("C:\\Users\\Ingrid\\Desktop\\Contas\\Presidente\\Rendimento.txt");
		
		PrintWriter gravaSaca = new PrintWriter(arqSaca);
		PrintWriter gravaDep = new PrintWriter(arqDep);
		PrintWriter gravaTransf = new PrintWriter(arqTransf);
		PrintWriter gravaTribu = new PrintWriter(arqTribu);
		PrintWriter gravaRelContas = new PrintWriter(arqRelContas);
		PrintWriter gravaRelClientes = new PrintWriter(arqRelClientes);
		PrintWriter gravaRelCapital = new PrintWriter(arqRelCapital);
		PrintWriter gravaRendimento = new PrintWriter(arqRendimento);
		
		Scanner scan = new Scanner(System.in);

		System.out.println(" ________________________________________");
		System.out.println("|     Escolha uma das operacoes          |");
		System.out.println("|                                        |");
		System.out.println("| Opcao 1 -   Verificar Saldo            |");
		System.out.println("| Opcao 2 -   Sacar                      |");
		System.out.println("| Opcao 3 -   Depositar                  |");
		System.out.println("| Opcao 4 -   Transferencia              |");
		System.out.println("| Opcao 5 -   Tributacao                 |");
		System.out.println("| Opcao 6 -   Relatorio de Contas        |");
		System.out.println("| Opcao 7 -   Relatorio dos Clientes     |");
		System.out.println("| Opcao 8 -   Relatorio Capital do Banco |");
		System.out.println("| Opcao 9 -   Rendimento                 |");
		System.out.println("| Opcao 10 -  Seguro de Vida             |");
		System.out.println("| Opcao 11 -  Sair                       |");
		System.out.println("|________________________________________|");
		System.out.println(" Digite uma opcao: ");
		int opcao = scan.nextInt();

		switch (opcao) {

		case 1:

			System.out.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());

			menuOperacoesP(usuarioLogado, contaLogada, quantContas, imprime, imprime2, imprime3);

			break;

		case 2:

			System.out.println("Valor que deseja sacar: R$ ");
			double valorSaque = scan.nextDouble();
			
			try {
				if (contaLogada.getTipo() == "CC") {
					contaLogada.saca(valorSaque);
					taxaTotal.add(0.10);
					gravaSaca.println("Valor que deseja sacar: R$ " + valorSaque);
				}else if(contaLogada.getTipo() == "CP"){
					contaLogada.saca(valorSaque);
					gravaSaca.println("Valor que deseja sacar: R$ " + valorSaque);
				}
				System.out.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());
				gravaSaca.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());

			}
			catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
			catch(SaldoInsuficienteException e ){
				System.out.println(e.getMessage());
			}
	
			menuOperacoesP(usuarioLogado, contaLogada, quantContas, imprime, imprime2, imprime3);

			break;

		case 3:

			System.out.println("Valor que deseja depositar: R$ ");
			double valorDeposita = scan.nextDouble();
			try {
				if (contaLogada.getTipo() == "CC") {
					contaLogada.deposita(valorDeposita);
					taxaTotal.add(0.10);
				}else if(contaLogada.getTipo() == "CP"){
					contaLogada.deposita(valorDeposita);
				}	
					gravaDep.println("Valor que deseja depositar: R$ " + valorDeposita);
					System.out.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());
					gravaDep.println("Seu saldo atual é de: R$ " + contaLogada.getSaldo());
				
			}
			catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}

			menuOperacoesP(usuarioLogado, contaLogada, quantContas, imprime, imprime2, imprime3);

			break;

		case 4:
			Conta contaTransf = null;
			SistemaInterno1 sisInt = new SistemaInterno1();
			
			
			System.out.println("Informe o cpf da conta para transferencia: ");
			long cpfTransf = scan.nextLong();
			System.out.println("Informe o valor para transferencia: R$ ");
			double valorTransf = scan.nextDouble();
			
			try {
				if (contaLogada.getTipo() == "CC") {
				contaTransf = sisInt.criaConta(cpfTransf, sisInt.mapaContas());
				contaLogada.transfere(contaTransf, valorTransf);
				System.out.println("Transferencia Realizada com sucesso para a conta " + contaTransf.getNumConta() + " da agencia " + contaTransf.getIdAgencia() + "!");
				taxaTotal.add(0.20);
				} else if(contaLogada.getTipo() =="CP"){
					contaTransf = sisInt.criaConta(cpfTransf, sisInt.mapaContas());
					contaLogada.transfere(contaTransf, valorTransf);
					System.out.println("Transferencia Realizada com sucesso para a conta " + contaTransf.getNumConta() + " da agencia " + contaTransf.getIdAgencia() + "!");
				}
				gravaTransf.println("Informe o cpf da conta para transferencia: " + cpfTransf);
				gravaTransf.println("Informe o valor para transferencia: R$ " + valorTransf);
				gravaTransf.println("Transferencia Realizada com sucesso para a conta " + contaTransf.getNumConta() + " da agencia " + contaTransf.getIdAgencia() + "!");
			}
			catch(NullPointerException e){
				System.out.println(e.getMessage());
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			catch(SaldoInsuficienteException e){
				System.out.println(e.getMessage());
			}
			
			menuOperacoesP(usuarioLogado, contaLogada, quantContas, imprime, imprime2, imprime3);
			
			break;

		case 5:
			
			double soma = 0;
			for(int i = 0; i < taxaTotal.size(); i++){ 
				soma += taxaTotal.get(i);
			}
			
			if (contaLogada.getTipo() == "CC") {
				System.out.println("AVISO:");
				System.out.println("Para cada saque sera cobrado o valor de: R$ 0.10 ");
				System.out.println("Para cada depósito sera cobrado o valor de: R$ 0.10 ");
				System.out.println("Para cada transferencia sera cobrado o valor de: R$ 0.20 ");
				System.out.println("Caso opte em ter seguro de vida o tributo será 20% do valor assegurado.");
				System.out.println("-------------------------------------------------------------");
				System.out.println("Total de tributacao: R$ "+soma);
				
				gravaTribu.println("AVISO:");
				gravaTribu.println("Para cada saque sera cobrado o valor de: R$ 0.10 ");
				gravaTribu.println("Para cada depósito sera cobrado o valor de: R$ 0.10 ");
				gravaTribu.println("Para cada transferencia sera cobrado o valor de: R$ 0.20 ");
				gravaTribu.println("Caso opte em ter seguro de vida o tributo será 20% do valor assegurado. ");
				gravaTribu.println("-------------------------------------------------------------");
				gravaTribu.println("Total de tributacao: R$ "+soma);
				
			} else {
				
				System.out.println("Conta Poupanca nao tem tributacao");
				
			}
			
			
			menuOperacoesP(usuarioLogado, contaLogada, quantContas, imprime, imprime2, imprime3);
			
			break;

		case 6: 
			
			System.out.println("A quantidade de contas na sua agencia é: " + quantContas + " Contas");
			gravaRelContas.println("A quantidade de contas na sua agencia é: " + quantContas + " Contas");
			
			menuOperacoesP(usuarioLogado, contaLogada, quantContas, imprime, imprime2, imprime3);
		
			break;
			
		case 7:
			
			System.out.println(imprime);
			gravaRelClientes.println(imprime);
			
			menuOperacoesP(usuarioLogado, contaLogada, quantContas, imprime, imprime2, imprime3);
			
			break;
			
		case 8: 
			
			System.out.println("O saldo total das contas do JabutisBank é: R$ "+imprime2);
			gravaRelCapital.println("O saldo total das contas do JabutisBank é: R$ "+imprime2);
			
			menuOperacoesP(usuarioLogado, contaLogada, quantContas, imprime, imprime2, imprime3);
		
			break;
			
		case 9:
	
			if (contaLogada.getTipo() == "CP") {
				
				System.out.println("Informe o o valor que deseja simular: ");
				double valorSimu = scan.nextDouble();
				System.out.println("Informe o numero de dias que deseja simular: ");
				int diasSimu = scan.nextInt();
				
				gravaRendimento.println("Informe o o valor que deseja simular: " + valorSimu);
				gravaRendimento.println("Informe o numero de dias que deseja simular: " + diasSimu);
				
				
				double rend = valorSimu * 0.0010 * diasSimu;
				double valorFinal = valorSimu + rend;
				
				System.out.println("O seu redimento vai ser de: R$ "+ rend);
				System.out.println("O valor final será de: R$" + valorFinal);
				gravaRendimento.println("O seu redimento vai ser de: R$ "+ rend);
				gravaRendimento.println("O valor final será de: R$" + valorFinal);
				
			} else {
				System.out.println("Sua Conta e uma Conta Corrente, portanto nao possui rendimento.");
			}
			
			menuOperacoesP(usuarioLogado, contaLogada, quantContas, imprime, imprime2, imprime3);
			
			break;
			
		case 10:
			int opcaoseguro;
			System.out.println("Deseja contratar o seguro de vida? ");
			System.out.println("1 - para sim");
			System.out.println("2 - para retornar ao menu anterior");
			opcaoseguro = scan.nextInt();
			
			if (opcaoseguro == 1) {
				System.out.println("Nos cobramos uma taxa de 20% do valor como tributo do seguro.");
				System.out.println("Informe o valor que sera segurado: ");
				double valorDigitado = scan.nextDouble();
				contaLogada.contrataSeguro(valorDigitado);	
				System.out.println("Taxa de tributacao: R$ " + contaLogada.contrataSeguro(valorDigitado));
				
				taxaTotal.add(contaLogada.contrataSeguro(valorDigitado));
				contaLogada.descontoSeguro(contaLogada.contrataSeguro(valorDigitado));
				
				menuOperacoesP(usuarioLogado, contaLogada, quantContas, imprime, imprime2, imprime3);
				
			} else if (opcaoseguro == 2) {
				
				menuOperacoesP(usuarioLogado, contaLogada, quantContas, imprime, imprime2, imprime3);
				
			}
			
			
			
		case 11:
			
			System.out.println("Operacao finalizada");
			
			break;
			

		default:

			System.out.println("Opcao invalida");

			menuOperacoesP(usuarioLogado, contaLogada, quantContas, imprime, imprime2, imprime3);

		}
		
		arqRelCapital.close();
		arqRelClientes.close();
		arqRelContas.close();
		arqRendimento.close();	
		arqTribu.close();
		arqTransf.close();
		arqDep.close();
		arqSaca.close();
		scan.close();
		
	}

	
	
	

}

package br.com.jabutis.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import br.com.jabutis.contas.*;
import br.com.jabutis.menu.Menu;
import br.com.jabutis.usuarios.*;

public class SistemaInterno1 {

	
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		Menu menu = new Menu();
		
		Map<Long, Cliente> mClientes = mapaClientes();
		Map<Long, Funcionario> mFuncionarios = mapaFuncionarios();
		Map<Long, Conta> mContas = mapaContas();
		Map<String , Conta> ordemContas = contasOrdem();
		
		List<List> imprime3 = transferencia(mContas);	
		List<List> imprime2 = totalBanco(mContas);
		List<List> imprime = listaClientes(ordemContas);

		String linha;
		int senha = 0;
		long cpf = 0;
		long cpfDigi;
		int senhaDigi;
		int quantContas = 0;

		Usuario usuarioLogado = null;
		Conta contaLogada = null;
		
		quantContas = calculaNumAgencia(quantContas, mFuncionarios, mContas);
		

		System.out.println(" _____________________________");
		System.out.println("|                             |");
		System.out.println("|       Seja Bem-Vindo        |");
		System.out.println("|             ao              |");
		System.out.println("|         JABUTISBANK         |");
		System.out.println("|_____________________________|");
		System.out.println("|                             |");
		System.out.println("| Digite seu CPF:             |");
		System.out.println("|_____________________________|");
		cpfDigi = scan.nextLong();
		System.out.println(" _____________________________");
		System.out.println("|                             |");
		System.out.println("|       Seja Bem-Vindo        |");
		System.out.println("|             ao              |");
		System.out.println("|         JABUTISBANK         |");
		System.out.println("|_____________________________|");
		System.out.println("|                             |");
		System.out.println("| Digite sua senha:           |");
		System.out.println("|_____________________________|");
		senhaDigi = scan.nextInt();
		

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		String logou = login(cpfDigi, senhaDigi, mClientes, mFuncionarios);
		tipoUsuario(menu, cpfDigi, quantContas, mClientes, mFuncionarios, mContas, logou, imprime, imprime2, imprime3);
	

	}

	private static List<List> transferencia(Map<Long, Conta> mContas) {
		List<List> imprime3 = new ArrayList();
		for (Map.Entry<Long, Conta> entry : mContas.entrySet()) {
			
			Long key = entry.getKey();
			Conta value = entry.getValue();
			
			Long retornoCpf = value.getCpf();
			
			List<String> retorno = new ArrayList<>();
			retorno.add(retornoCpf.toString());
			
			imprime3.add(retorno);
			
		}
		
		return imprime3;
	}

	private static List<List> totalBanco(Map<Long, Conta> mContas) {
		double soma = 0;
		double total = 0;
		List<List> imprime2 = new ArrayList<>();
		List<String> retorno = new ArrayList<>();
		for (Map.Entry<Long, Conta> entry : mContas.entrySet()) {
			Long key = entry.getKey();
			Conta value = entry.getValue();
			
			
			double saldo = value.getSaldo();
			soma = soma + saldo;
			

		}
		retorno.add(Double.toString(soma));
		imprime2.add(retorno);
		return imprime2;
	}

	private static List<List> listaClientes(Map<String, Conta> ordemContas) {
		List<List> imprime = new ArrayList<>();
		for (Entry<String, Conta> entry : ordemContas.entrySet()) {
			String key = entry.getKey();
			Conta value = entry.getValue();

			String nome = value.getTitular();
			Long retornoCpf = value.getCpf();
			int numAgencia = value.getIdAgencia();

			List<String> retorno = new ArrayList<>();

			retorno.add(nome);
			retorno.add(retornoCpf.toString());
			retorno.add(Integer.toString(value.getIdAgencia()));
		
			imprime.add(retorno);
			
		}
		
		return imprime;
	}

	
	private static void tipoUsuario(Menu menu, long cpfDigi, int quantContas,
			Map<Long, Cliente> mClientes, Map<Long, Funcionario> mFuncionarios, Map<Long, Conta> mContas, String logou,
			List imprime, List imprime2, List imprime3) throws IOException {

		Usuario usuarioLogado;
		Conta contaLogada;

		if (logou.equals("Gerente")) {
			System.out.println("Bem-Vindo, " + logou);
			usuarioLogado = criaFuncionario(cpfDigi, mFuncionarios);
			contaLogada = criaConta(cpfDigi, mContas);
			menu.menuOperacoesG(usuarioLogado, contaLogada, quantContas, imprime3);

		} else if (logou.equals("Cliente")) {
			System.out.println("Bem-Vindo, " + logou);
			usuarioLogado = criaCliente(cpfDigi, mClientes);
			contaLogada = criaConta(cpfDigi, mContas);
			menu.menuOperacoesC(usuarioLogado, contaLogada, imprime3);

		} else if (logou.equals("Diretor")) {
			System.out.println("Bem-Vindo, " + logou);
			usuarioLogado = criaFuncionario(cpfDigi, mFuncionarios);
			contaLogada = criaConta(cpfDigi, mContas);
			menu.menuOperacoesD(usuarioLogado, contaLogada, quantContas, imprime, imprime3);

		} else if (logou.equals("Presidente")) {
			System.out.println("Bem-Vindo, " + logou);
			usuarioLogado = criaFuncionario(cpfDigi, mFuncionarios);
			contaLogada = criaConta(cpfDigi, mContas);
			menu.menuOperacoesP(usuarioLogado, contaLogada, quantContas, imprime, imprime2, imprime3);
		} else {
			System.out.println("Usuario nao encontrado");
		}
	}

	private static int calculaNumAgencia(int quantContas, Map<Long, Funcionario> mFuncionarios,
			Map<Long, Conta> mContas) {

		int numAgencia;
		int numAgencia2 = 0;

		for (Map.Entry<Long, Conta> entry : mContas.entrySet()) {
			Long key = entry.getKey();
			Conta value = entry.getValue();

			numAgencia = value.getIdAgencia();

			for (Map.Entry<Long, Funcionario> entry2 : mFuncionarios.entrySet()) {
				Long key2 = entry2.getKey();
				Funcionario value2 = entry2.getValue();

				numAgencia2 = value2.getNumAgencia();

				if (numAgencia == numAgencia2) {

					quantContas++;

				}
			}

		}
		return quantContas;
	}

	
	public static Map<Long, Cliente> mapaClientes() throws IOException {

		String linha;
		int senha;
		long cpf;

		Map<Long, Cliente> mapaClientes = new HashMap<>();
		BufferedReader csvClientes = new BufferedReader(new FileReader("clientes.csv"));
		linha = csvClientes.readLine();

		while ((linha = csvClientes.readLine()) != null) {
			linha = linha.replace("\"", "");

			String nome;

			String[] data = linha.split(",");

			nome = data[0];
			senha = Integer.parseInt(data[1]);
			cpf = Long.parseLong(data[2]);

			mapaClientes.put(cpf, new Cliente(senha, cpf));
		}

		return mapaClientes;

	}

	public static Map<Long, Funcionario> mapaFuncionarios() throws IOException {

		String linha;
		int senha;
		long cpf;

		Map<Long, Funcionario> mapaFuncionarios = new HashMap<>();
		BufferedReader csvFuncionarios = new BufferedReader(new FileReader("funcionarios.csv"));
		linha = csvFuncionarios.readLine();

		while ((linha = csvFuncionarios.readLine()) != null) {
			linha = linha.replace("\"", "");

			String nome;
			String cargo;
			int agencia;

			String[] data = linha.split(",");

			nome = data[0];
			senha = Integer.parseInt(data[1]);
			cpf = Long.parseLong(data[2]);
			cargo = data[3];
			agencia = Integer.parseInt(data[4]);

			if (cargo.equals("Gerente")) {
				mapaFuncionarios.put(cpf, new Gerente(senha, cpf, cargo, agencia));
			} else if (cargo.equals("Diretor")) {
				mapaFuncionarios.put(cpf, new Diretor(senha, cpf, cargo));
			} else if (cargo.equals("Presidente")) {
				mapaFuncionarios.put(cpf, new Presidente(senha, cpf, cargo));

			}

		}

		return mapaFuncionarios;

	}

	public static Map<Long, Conta> mapaContas() throws IOException {

		String linha;
		String titular;
		long cpf;
		double saldo;
		int agencia;
		int numConta;
		String tipo;

		Map<Long, Conta> mapaContas = new HashMap<>();
		BufferedReader csvContas = new BufferedReader(new FileReader("contas.csv"));
		linha = csvContas.readLine();

		while ((linha = csvContas.readLine()) != null) {
			linha = linha.replace("\"", "");

			String[] data = linha.split(",");

			titular = data[0];
			cpf = Long.parseLong(data[1]);
			saldo = Double.parseDouble(data[2]);
			agencia = Integer.parseInt(data[3]);
			numConta = Integer.parseInt(data[4]);
			tipo = data[5];

			if (tipo.equals("CC")) {
				mapaContas.put(cpf, new ContaCorrente(titular, cpf, saldo, agencia, numConta, tipo));

			} else if (tipo.equals("CP")) {
				mapaContas.put(cpf, new ContaPoupanca(titular, cpf, saldo, agencia, numConta, tipo));

			}

		}
		return mapaContas;

	}

	
	public static String login(long cpf, int senha, Map<Long, Cliente> mapClientes,
			Map<Long, Funcionario> mapFuncionarios) {
		if (mapClientes.get(cpf) != null) {
			Cliente ctemp = mapClientes.get(cpf);
			if ((ctemp.cpf == cpf) && (ctemp.senha == senha)) {
				return "Cliente";
			}
		} else if (mapFuncionarios.get(cpf) != null) {
			Funcionario ftemp = mapFuncionarios.get(cpf);
			if ((ftemp.cpf == cpf) && (ftemp.senha == senha)) {
				return ftemp.cargo;
			}
		}

		return "Usuario nao encontrado";

	}

	
	public static Conta criaConta(long cpfDigi, Map<Long, Conta> contas) {

		return contas.get(cpfDigi);

	}

	public static Cliente criaCliente(long cpfDigi, Map<Long, Cliente> clientes) {

		return clientes.get(cpfDigi);

	}

	public static Funcionario criaFuncionario(long cpfDigi, Map<Long, Funcionario> funcionarios) {

		return funcionarios.get(cpfDigi);

	}
	
	public static Map<String, Conta> contasOrdem() throws IOException {
	        String linha;
	        String titular;
	        long cpf;
	        double saldo;
	        int agencia;
	        int numConta;
	        String tipo;

	        Map<String, Conta> contasOrdem = new TreeMap<>();
	        BufferedReader csvContas = new BufferedReader(new FileReader("contas.csv"));
	        linha = csvContas.readLine();

	        while ((linha = csvContas.readLine()) != null) {
	            linha = linha.replace("\"", "");

	            String[] data = linha.split(",");

	            titular = data[0];
	            cpf = Long.parseLong(data[1]);
	            saldo = Double.parseDouble(data[2]);
	            agencia = Integer.parseInt(data[3]);
	            numConta = Integer.parseInt(data[4]);
	            tipo = data[5];
     
	                contasOrdem.put(titular, new ContaCorrente(titular, cpf, saldo, agencia, numConta, tipo));

	        }
	        return contasOrdem;

	 

	    }

}

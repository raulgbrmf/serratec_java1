package br.com.theboys.banco.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.theboys.banco.contas.Conta;
import br.com.theboys.banco.contas.ContaCorrente;
import br.com.theboys.banco.contas.ContaPoupanca;
import br.com.theboys.banco.usuario.Cliente;
import br.com.theboys.banco.usuario.Diretor;
import br.com.theboys.banco.usuario.Funcionario;
import br.com.theboys.banco.usuario.Gerente;
import br.com.theboys.banco.usuario.Presidente;

public class LerCsv {

	public static Map<String, Cliente> carregaCliente() throws FileNotFoundException {
		Map<String, Cliente> clientes = new HashMap<String, Cliente>();

		File arquivo = new File("Cliente.csv");
		Scanner scanner = new Scanner(arquivo);

		while (scanner.hasNext()) {

			String linha = scanner.nextLine();
			String[] valores = linha.split(",");
			Cliente cliente = new Cliente();
			cliente.setCpf(valores[0]);
			cliente.setSenha(valores[1]);
			cliente.setNome(valores[2]);
			clientes.put(cliente.getCpf(), cliente);
		}
		scanner.close();
		return clientes;
	}

	public static Map<String, Funcionario> carregaFuncionario() throws FileNotFoundException {
		Map<String, Funcionario> funcionarios = new HashMap<String, Funcionario>();

		File arquivo = new File("Funcionario.csv");
		Scanner scanner = new Scanner(arquivo);

		while (scanner.hasNext()) {

			String linha = scanner.nextLine();
			String[] valores = linha.split(",");
			String tipo = valores[0];
			if (tipo.equals("Gerente")) {
				Funcionario funcionario = new Gerente();
				funcionario.setCpf(valores[1]);
				funcionario.setSenha(valores[2]);
				funcionario.setNome(valores[3]);
				funcionarios.put(funcionario.getCpf(), funcionario);
			} else if (tipo.equals("Diretor")) {
				Funcionario funcionario = new Diretor();
				funcionario.setCpf(valores[1]);
				funcionario.setSenha(valores[2]);
				funcionario.setNome(valores[3]);
				funcionarios.put(funcionario.getCpf(), funcionario);
			} else if (tipo.equals("Presidente")) {
				Funcionario funcionario = new Presidente();
				funcionario.setCpf(valores[1]);
				funcionario.setSenha(valores[2]);
				funcionario.setNome(valores[3]);
				funcionarios.put(funcionario.getCpf(), funcionario);
			} else {
				System.out.println("Tipo inválido!");
			}
		}
		scanner.close();
		return funcionarios;
	}

	public static Map<String, Conta> carregaConta()
			throws FileNotFoundException {
		Map<String, Conta> contas = new HashMap<String, Conta>();

		File arquivo = new File("Conta.csv");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(arquivo);
		while (scanner.hasNext()) {

			String linha = scanner.nextLine();
			String[] valores = linha.split(",");
			String tipo = valores[0];

			if (tipo.equals("Conta Corrente")) {
				ContaCorrente conta = new ContaCorrente();
				conta.setCpf(valores[1]);
				conta.setTitular(valores[2]);
				conta.setAgencia(valores[3]);
				conta.setNumero(Integer.parseInt(valores[4]));
				conta.inicializaSaldo(Double.parseDouble(valores[5]));
				contas.put(conta.getCpf(), conta);
			} else if (tipo.equals("Conta Poupança")) {
				ContaPoupanca conta = new ContaPoupanca();
				conta.setCpf(valores[1]);
				conta.setTitular(valores[2]);
				conta.setAgencia(valores[3]);
				conta.setNumero(Integer.parseInt(valores[4]));
				conta.inicializaSaldo(Double.parseDouble(valores[5]));
				contas.put(conta.getCpf(), conta);
			} else {
				throw new Error("Tipo da conta inválido!");
			}
		}
		scanner.close();
		return contas;
	}
}

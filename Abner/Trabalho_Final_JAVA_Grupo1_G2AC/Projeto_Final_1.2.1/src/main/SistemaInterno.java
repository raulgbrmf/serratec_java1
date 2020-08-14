package main;

import java.io.*;
import java.util.*;

import Sistema.*;
import contas.Agencia;
import modelo.contas.*;
import modelo.usuario.*;

public class SistemaInterno {

	public static void main(String[] args) {
		Map<String, Cliente> mapaCliente = null;
		Map<Integer, Agencia> mapaAgencia = null;
		Map<String, Funcionario> mapaFuncionario = null;
		Map<String, ContaCorrente> mapaContaCorrente = null;
		Map<String, ContaPoupanca> mapaContaPoupanca = null;

		Scanner sc = new Scanner(System.in);
		CarregaArquivo importa = new CarregaArquivo();

		try {
			mapaCliente = importa.importaCliente();
			mapaAgencia = importa.importaAgencia();
			mapaFuncionario = importa.importaFuncionario();
			mapaContaCorrente = importa.importaContaCorrente();
			mapaContaPoupanca = importa.importaContaPoupanca();

		} catch (IOException e) {
			System.out.println("Arquivo não localizado." + e);
		}

		Usuario usuarioLogado = null;
		Conta contaLogada = null;
		boolean ativo = false;
		String cpf = "0";
		String senha = "0";
		int op;

		do {
			try {

				Telas.telaLogin();
				System.out.println();
				System.out.print("CPF: ");
				cpf = sc.next();
				System.out.print("Senha: ");
				senha = sc.next();
				usuarioLogado = verificaUsuario(mapaCliente, mapaFuncionario, cpf, senha);
				contaLogada = buscaConta(mapaContaCorrente, mapaContaPoupanca, usuarioLogado);
				ativo = true;
				Telas.imprimeSaudacao(usuarioLogado);
				

			} catch (Exception e) {
				System.out.println("Dados Invalidos!" + e);

			}
		} while (!ativo);		

		do {
			op = sc.nextInt();
			switch (op) {
			case 1:
				Telas.telaSaque(usuarioLogado, contaLogada, mapaContaCorrente, mapaContaPoupanca);
				break;
			case 2:
				Telas.telaDeposito(usuarioLogado, contaLogada, mapaContaCorrente, mapaContaPoupanca);
				break;
			case 3:
				Telas.telaTransferencia(usuarioLogado, contaLogada, mapaContaCorrente, mapaContaPoupanca);
				break;
			case 4:
				Telas.telaSeguro(usuarioLogado, mapaCliente);
				break;
			case 5:
				Telas.telaSaldo(usuarioLogado, contaLogada, mapaContaCorrente, mapaContaPoupanca);
				break;
			case 6:
				Telas.telaRelatorioTributo(usuarioLogado, contaLogada, mapaContaCorrente, mapaContaPoupanca);
				break;
			case 7:
				Telas.telaRelatorioRendimento(usuarioLogado, contaLogada, mapaContaPoupanca);
				break;
			case 8:
				if (mapaFuncionario.get(usuarioLogado.getCpf()).getCargo().equals("Gerente")) {
					Telas.telaRelatorioGerente(usuarioLogado, mapaFuncionario, mapaContaCorrente, mapaContaPoupanca);
				} else if (mapaFuncionario.get(usuarioLogado.getCpf()).getCargo().equals("Diretor")) {
					Telas.telaRelatorioDiretor(usuarioLogado, mapaFuncionario, mapaContaCorrente, mapaContaPoupanca);
				} else if (mapaFuncionario.get(usuarioLogado.getCpf()).getCargo().equals("Presidente")) {
					Telas.telaRelatorioPresidente(usuarioLogado, mapaFuncionario, mapaContaCorrente, mapaContaPoupanca);
				}
				break;
			case 0:
				System.out.println("Programa Finalizado!");
				System.exit(0);
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
			if (mapaFuncionario.get(usuarioLogado.getCpf()) != null) {
				Telas.telaPrincipal();
				Telas.telaRelatorioFuncionario();
			} else {
				Telas.telaPrincipal();
			}

		} while (op != 0);
	}

	public static Usuario verificaUsuario(Map<String, Cliente> mapaCliente, Map<String, Funcionario> mapaFuncionario,
			String cpf, String senha) {

		Usuario usuarioLogado = null;

		if (mapaFuncionario.get(cpf) != null) {
			String cargo = mapaFuncionario.get(cpf).getCargo();

			if (cargo.endsWith("Presidente")) {
				usuarioLogado = (Presidente) mapaFuncionario.get(cpf);
				if (logar(usuarioLogado, senha)) {
					Telas.telaPrincipal();
					Telas.telaRelatorioFuncionario();
				} else {
					System.out.println("Dados incorretos!");
				}
				return usuarioLogado;
			} else if (cargo.endsWith("Diretor")) {
				usuarioLogado = (Diretor) mapaFuncionario.get(cpf);

				if (logar(usuarioLogado, senha)) {
					Telas.telaPrincipal();
					Telas.telaRelatorioFuncionario();
				} else {
					System.out.println("Dados incorretos!");
				}
				return usuarioLogado;
			} else {
				usuarioLogado = (Gerente) mapaFuncionario.get(cpf);

				if (logar(usuarioLogado, senha)) {
					Telas.telaPrincipal();
					Telas.telaRelatorioFuncionario();
				} else {
					System.out.println("Dados incorretos!");
				}
				return usuarioLogado;
			}
		} else if (mapaCliente.get(cpf) != null) {
			usuarioLogado = (Cliente) mapaCliente.get(cpf);
			if (logar(usuarioLogado, senha)) {
				Telas.telaPrincipal();
			} else {
				System.out.println("Dados incorretos!");
			}
			return usuarioLogado;

		} else {
			System.out.println("Não Cadastrado!");
		}

		throw new NullPointerException();
	}

	public static boolean logar(Usuario usuario, String senha) {

		if (usuario.getSenha().endsWith(senha)) {
			return true;
		}
		throw new RuntimeException("Senha incorreta!");
	}

	public static Conta buscaConta(Map<String, ContaCorrente> mapaContaCorrente,
			Map<String, ContaPoupanca> mapaContaPoupanca, Usuario usuarioLogado) {

		Conta contaLogada = null;

		if (mapaContaCorrente.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaCorrente) mapaContaCorrente.get(usuarioLogado.getCpf());
			return contaLogada;
		}

		if (mapaContaPoupanca.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaPoupanca) mapaContaPoupanca.get(usuarioLogado.getCpf());
			return contaLogada;
		}

		return contaLogada;

	}

}

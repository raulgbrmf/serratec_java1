package Sistema;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import java.util.Scanner;

import Exceptions.ValorInvalidoException;
import contas.SeguroDeVida;
import modelo.contas.Conta;
import modelo.contas.ContaCorrente;
import modelo.contas.ContaPoupanca;
import modelo.usuario.Cliente;
import modelo.usuario.Diretor;
import modelo.usuario.Funcionario;
import modelo.usuario.Gerente;
import modelo.usuario.Presidente;
import modelo.usuario.Usuario;

public class Telas {

	public static void telaLogin() {
		System.out.println("Bem vindo ao Banco G2AC!");
		System.out.println("Digite seu CPF e Senha para Logar");
	}
	
	public static void imprimeSaudacao(Usuario usuarioLogado) {
		System.out.println("\n           " + mostraMensagem() + ", " + usuarioLogado.getNome() + "!");
	}

	public static void telaPrincipal() {	
				
		System.out.println("\n               Operações                  ");
		System.out.println(" | [0] Finalizar                           |");
		System.out.println(" | [1] Saque                               |");
		System.out.println(" | [2] Deposito                            |");
		System.out.println(" | [3] Tranferencia                        |");
		System.out.println(" | [4] Contratação Seguro de Vida          |");
		System.out.println("\n                Relatorios                ");
		System.out.println(" | [5] Saldo                               |");
		System.out.println(" | [6] Relatorio Tributação                |");
		System.out.println(" | [7] Relatorio Rendimento Conta Poupanca |");
	}

	public static void telaRelatorioFuncionario() {

		System.out.println(" | [8] Relatorios internos                 |");
	}

	public static String mostraMensagem() {
		Calendar cal = Calendar.getInstance();
		int hora = cal.get(Calendar.HOUR_OF_DAY);
		String mensagem = null;
		if (hora < 12) {
			mensagem = "Bom dia";
		} else if (hora >= 12 && hora < 18) {
			mensagem = "Boa Tarde";
		} else {
			mensagem = "Boa Noite";
		}
		return mensagem;
	}

	public static void telaSaque(Usuario usuarioLogado, Conta contaLogada, Map<String, ContaCorrente> mapaContaCorrente,
			Map<String, ContaPoupanca> mapaContaPoupanca) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" | Saque                                   |");
		System.out.println(" | Digite o valor do saque:                |");
		double valor = sc.nextDouble();

		if (mapaContaCorrente.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaCorrente) mapaContaCorrente.get(usuarioLogado.getCpf());
			ContaCorrente cc = (ContaCorrente) contaLogada;
			try {
				cc.saque(valor);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		else if (mapaContaPoupanca.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaPoupanca) mapaContaPoupanca.get(usuarioLogado.getCpf());
			ContaPoupanca cp = (ContaPoupanca) contaLogada;
			try {
				cp.saque(valor);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void telaDeposito(Usuario usuarioLogado, Conta contaLogada,
			Map<String, ContaCorrente> mapaContaCorrente, Map<String, ContaPoupanca> mapaContaPoupanca) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" | Depósito                                |");
		System.out.println(" | Digite o valor do deposito:             |");
		double valor = sc.nextDouble();

		if (mapaContaCorrente.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaCorrente) mapaContaCorrente.get(usuarioLogado.getCpf());
			ContaCorrente cc = (ContaCorrente) contaLogada;
			try {
				cc.deposito(valor);
			} catch (ValorInvalidoException e) {
				System.out.println(e);
			}
		}

		else if (mapaContaPoupanca.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaPoupanca) mapaContaPoupanca.get(usuarioLogado.getCpf());
			ContaPoupanca cp = (ContaPoupanca) contaLogada;
			try {
				cp.deposito(valor);
			} catch (ValorInvalidoException e) {
				System.out.println(e);
			}
		}
	}

	public static void telaTransferencia(Usuario usuarioLogado, Conta contaLogada,
			Map<String, ContaCorrente> mapaContaCorrente, Map<String, ContaPoupanca> mapaContaPoupanca) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" | Transferência                           |");
		System.out.println(" | Digite o valor da transferência:        |");
		double valor = sc.nextDouble();
		System.out.println(" | Digite o cpf do destinatário:           |");
		String cpfDestinatario = sc.next();
		Conta contaDestino;

		if (mapaContaCorrente.get(cpfDestinatario) != null) {
			contaDestino = mapaContaCorrente.get(cpfDestinatario);

			if (mapaContaCorrente.get(usuarioLogado.getCpf()) != null) {
				contaLogada = (ContaCorrente) mapaContaCorrente.get(usuarioLogado.getCpf());
				ContaCorrente cc = (ContaCorrente) contaLogada;
				try {
					cc.transferePara(contaDestino, valor);
				} catch (ValorInvalidoException e) {
					System.out.println(e);
				}
			}

			else if (mapaContaPoupanca.get(usuarioLogado.getCpf()) != null) {
				contaLogada = (ContaPoupanca) mapaContaPoupanca.get(usuarioLogado.getCpf());
				ContaPoupanca cp = (ContaPoupanca) contaLogada;
				try {
					cp.transferePara(contaDestino, valor);
				} catch (ValorInvalidoException e) {
					System.out.println(e);
				}
			}
		}

		else if (mapaContaPoupanca.get(cpfDestinatario) != null) {
			contaDestino = mapaContaPoupanca.get(cpfDestinatario);

			if (mapaContaCorrente.get(usuarioLogado.getCpf()) != null) {
				contaLogada = (ContaCorrente) mapaContaCorrente.get(usuarioLogado.getCpf());
				ContaCorrente cc = (ContaCorrente) contaLogada;
				cc.transferePara(contaDestino, valor);
			}

			else if (mapaContaPoupanca.get(usuarioLogado.getCpf()) != null) {
				contaLogada = (ContaPoupanca) mapaContaPoupanca.get(usuarioLogado.getCpf());
				ContaPoupanca cp = (ContaPoupanca) contaLogada;
				cp.transferePara(contaDestino, valor);
			}
		}

		else {
			System.out.println("Conta não encontrada!");
		}
	}

	public static void telaSeguro(Usuario usuarioLogado, Map<String, Cliente> mapaCliente) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" | Digite o valor a ser segurado:          |");
		double valorSegurado = sc.nextDouble();

		if (mapaCliente.get(usuarioLogado.getCpf()) != null) {
			usuarioLogado = (Cliente) mapaCliente.get(usuarioLogado.getCpf());
			Cliente c = (Cliente) usuarioLogado;
			try {
				c.contrataSeguro(new SeguroDeVida(valorSegurado));
			} catch (ValorInvalidoException e) {
				System.out.println(e);
			}

		} else {
			System.out.println("Não é possível concluir a operação.");
		}
	}

	public static void telaSaldo(Usuario usuarioLogado, Conta contaLogada, Map<String, ContaCorrente> mapaContaCorrente,
			Map<String, ContaPoupanca> mapaContaPoupanca) {

		if (mapaContaCorrente.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaCorrente) mapaContaCorrente.get(usuarioLogado.getCpf());
			ContaCorrente cc = (ContaCorrente) contaLogada;
			System.out.println("Saldo atual da conta: R$" + String.format("%.2f", cc.getSaldo()));
		}

		else if (mapaContaPoupanca.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaPoupanca) mapaContaPoupanca.get(usuarioLogado.getCpf());
			ContaPoupanca cp = (ContaPoupanca) contaLogada;
			System.out.println("Saldo atual da conta: R$" + String.format("%.2f", cp.getSaldo()));
		}
	}

	public static void telaRelatorioTributo(Usuario usuarioLogado, Conta contaLogada,
			Map<String, ContaCorrente> mapaContaCorrente, Map<String, ContaPoupanca> mapaContaPoupanca) {

		if (mapaContaCorrente.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaCorrente) mapaContaCorrente.get(usuarioLogado.getCpf());
			ContaCorrente cc = (ContaCorrente) contaLogada;
			System.out.println(cc.relatorioTributo());

			try {
				cc.chamaExportaDoc();
			} catch (IOException e) {
				System.out.println("Impossivel gerar o relatório solicitado." + e);
			}
		}

		else if (mapaContaPoupanca.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaPoupanca) mapaContaPoupanca.get(usuarioLogado.getCpf());
			ContaPoupanca cp = (ContaPoupanca) contaLogada;
			System.out.println(cp.relatorioTributo());

			try {
				cp.chamaExportaDoc();
			} catch (IOException e) {
				System.out.println("Impossivel gerar o relatório solicitado." + e);
			}
		}
	}

	public static void telaRelatorioRendimento(Usuario usuarioLogado, Conta contaLogada,

			Map<String, ContaPoupanca> mapaContaPoupanca) {
		Scanner sc = new Scanner(System.in);

		if (mapaContaPoupanca.get(usuarioLogado.getCpf()) != null) {
			contaLogada = (ContaPoupanca) mapaContaPoupanca.get(usuarioLogado.getCpf());
			ContaPoupanca cp = (ContaPoupanca) contaLogada;

			System.out.println("Digite o valor que deseja simular: ");
			double valor = sc.nextDouble();
			System.out.println("Digite o número de dias que deseja simular: ");
			int dia = sc.nextInt();
			System.out.println(cp.simulaRendimento(valor, dia));
		} else {
			System.out.println("Não é uma conta poupança.\nNão é possível realizar a ação!");
		}
	}

	public static void telaRelatorioGerente(Usuario usuarioLogado, Map<String, Funcionario> mapaFuncionario,
			Map<String, ContaCorrente> mapaContaCorrente, Map<String, ContaPoupanca> mapaContaPoupanca) {

		if (mapaFuncionario.get(usuarioLogado.getCpf()) != null) {
			Gerente gerente = (Gerente) mapaFuncionario.get(usuarioLogado.getCpf());
			String relatorio = gerente.relatorioGerente(mapaContaCorrente, mapaContaPoupanca);
			try {
				gerente.exportaDoc(relatorio);
			} catch (IOException e) {
				System.out.println("Impossivel gerar o relatório solicitado." + e);
			}
			System.out.println(relatorio);
		} else {
			System.out.println("Não é possível concluir a operação.");
		}
	}

	public static void telaRelatorioDiretor(Usuario usuarioLogado, Map<String, Funcionario> mapaFuncionario,
			Map<String, ContaCorrente> mapaContaCorrente, Map<String, ContaPoupanca> mapaContaPoupanca) {

		if (mapaFuncionario.get(usuarioLogado.getCpf()) != null) {
			Diretor diretor = (Diretor) mapaFuncionario.get(usuarioLogado.getCpf());
			ArrayList<String> info = new ArrayList<>();
			info = diretor.relatorioDiretor(mapaContaCorrente, mapaContaPoupanca);
			try {
				diretor.exportaDoc(info);
			} catch (IOException e) {
				System.out.println("Impossivel gerar o relatório solicitado." + e);
			}
			for (String i : info) {
				System.out.println(i);
			}
		} else {
			System.out.println("Não é possível concluir a operação.");
		}
	}

	public static void telaRelatorioPresidente(Usuario usuarioLogado, Map<String, Funcionario> mapaFuncionario,
			Map<String, ContaCorrente> mapaContaCorrente, Map<String, ContaPoupanca> mapaContaPoupanca) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> info = new ArrayList<>();
		if (mapaFuncionario.get(usuarioLogado.getCpf()) != null) {
			Presidente presidente = (Presidente) mapaFuncionario.get(usuarioLogado.getCpf());
			System.out.println(" | [1]  Relatorio Nivel Diretor            |");
			System.out.println(" | [2]  Relatorio Nivel Presidende         |");
			int op = sc.nextInt();
			if (op == 1) {
				info = presidente.relatorioDiretor(mapaContaCorrente, mapaContaPoupanca);
				try {
					presidente.chamaExportaDoc(info);
				} catch (IOException e) {
					System.out.println("Impossivel gerar o relatório solicitado." + e);
				}
				for (String i : info) {
					System.out.println(i);
				}

			} else if (op == 2) {

				info = presidente.relatorioPresidente(mapaContaCorrente, mapaContaPoupanca);

				try {
					presidente.chamaExportaDoc(info);
				} catch (IOException e) {
					System.out.println("Impossivel gerar o relatório solicitado." + e);
				}

				for (String i : info) {
					System.out.println(i);
				}

			} else {
				System.out.println("Opção invalida!");
			}

		} else {
			System.out.println("Não é possível concluir a operação.");
		}
	}
}

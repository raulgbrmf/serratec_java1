package br.com.residenciaserratec.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import br.com.residenciaserratec.modelo.*;

public class Menu {

	public static void inicioMenu(HashMap<Long, Funcionario> funcionarios, HashMap<Long, Cliente> clientes,
			HashMap<Long, Conta> contas, long cpf, boolean autenticado) throws IOException {

		Conta contaCliente = contas.get(cpf);
		ControleEscrita gravar = new ControleEscrita();

		String usuario = "vazio";
		if (funcionarios.containsKey(cpf) == true)
			usuario = funcionarios.get(cpf).getCargo();
		if (clientes.containsKey(cpf) == true)
			usuario = clientes.get(cpf).getNome();

		System.out.println(contas.get(cpf).getTipo());
		if (contas.get(cpf).getTipo().equals("Conta Corrente")) {
			contaCliente = (ContaCorrente) contas.get(cpf);

			System.out.println(
					"Valor das opera��es banc�rias: R$ 0,10 por saque, R$ 0,10 por dep�sito, R$ 0,20 por transfer�ncia");

		} else if (contas.get(cpf).getTipo().equals("Conta Poupan�a")) {
			contaCliente = (ContaPoupanca) contas.get(cpf);
		}

		int operacao;
		double x;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bem vindo: " + usuario);

		operacao = menuOperacao(usuario);
		while (operacao != 0) {
			switch (operacao) {
			case 0:
				operacao = 0;
				break;
			case 1:
				try {
					System.out.println("Valor desejado: ");
					x = scan.nextDouble();
					contaCliente.saque(x);
					gravar.imprimeSaque(contas, cpf, x);
				} catch (SaldoInsuficiente e) {
					System.out.println(e.getMessage());
				} catch (IllegalArgumentException e) {
					System.out.println(e.getLocalizedMessage());
				} catch (IOException e) {
					System.out.println("Erro na entrada ou sa�do de arquivos.");
				} catch (Exception e) {
					System.out.println("Erro desconhecido.");
				}
				operacao = menuOperacao(usuario);
				break;
			case 2:
				try {
					System.out.println("Valor desejado: ");
					x = scan.nextDouble();
					contaCliente.deposito(x);
					gravar.imprimeDeposito(contas, cpf, x);
				} catch (SaldoInsuficiente e) {
					System.out.println(e.getMessage());
				} catch (IllegalArgumentException e) {
					System.out.println(e.getLocalizedMessage());
				} catch (IOException e) {
					System.out.println("Erro na entrada ou sa�do de arquivos.");
				} catch (Exception e) {
					System.out.println("Erro desconhecido.");
				}
				operacao = menuOperacao(usuario);
				break;
			case 3:
				try {
					System.out.println("Digite o CPF do destinat�rio: ");
					long cpfDestino = scan.nextLong();
					while (verificaDestinatario(funcionarios, clientes, cpfDestino) == false) {
						System.out.println("Cpf Inv�lido. Digite o CPF do destinat�rio: ");
						cpfDestino = scan.nextLong();
					}
					System.out.println("Valor desejado: ");
					x = scan.nextDouble();
					Conta contaDestino = contas.get(cpfDestino);
					contaCliente.transfere(contaDestino, x);
					gravar.imprimeTransfere(contas, cpf, x, cpfDestino);
				} catch (SaldoInsuficiente e) {
					System.out.println(e.getMessage());
				} catch (IllegalArgumentException e) {
					System.out.println(e.getLocalizedMessage());
				} catch (IOException e) {
					System.out.println("Erro na entrada ou sa�do de arquivos.");
				} catch (Exception e) {
					System.out.println("Erro desconhecido.");
				}
				operacao = menuOperacao(usuario);
				break;
			case 4:
				System.out.println("Seu saldo � " + contaCliente.getSaldo());
				operacao = menuOperacao(usuario);
				break;

			case 5:
				if (contaCliente.getTipo().equals("Conta Corrente")) {
					System.out.println(contaCliente.getTributacao());
					operacao = menuOperacao(usuario);
				} else {
					System.out.println("Sua conta n�o possui tributa��o.");
					operacao = menuOperacao(usuario);
				}
				break;
			case 6:
				if (contaCliente.getTipo().equals("Conta Poupan�a")) {
					System.out.println("Digite a quantidade de meses que deseja saber o rendimento: ");
					int rendeMes = scan.nextInt();
					System.out.println(((ContaPoupanca) contaCliente).rendimento(rendeMes));
					operacao = menuOperacao(usuario);
				} else {
					System.out.println("Sua conta n�o possui rendimento.");
					operacao = menuOperacao(usuario);
				}
				break;

			case 7:
				if (usuario.equals("Gerente") || usuario.equals("Diretor") || usuario.equals("Presidente")) {
					int totalDeContas = funcionarios.get(cpf).numeroDeContas(contas);
					System.out.println("O numero total de contas �: " + totalDeContas);
					operacao = menuOperacao(usuario);
				} else {
					System.out.println("Acesso negado.");
					operacao = menuOperacao(usuario);
				}
				break;
			case 8:
				if (usuario.equals("Diretor") || usuario.equals("Presidente"))
					 {
						List<String> imprime = new ArrayList<>();
						/*for(Map.Entry<Long, Cliente> entry : clientes.entrySet()) {
						    Long key = entry.getKey();
						    Cliente value = entry.getValue();
						    
						    Long retornoCpf = value.getCpf();
						    
						   String nome = value.getNome();
						   		for (Map.Entry<Long, Conta> entry2 : contas.entrySet()) {
									Long key2 = entry2.getKey();
									Conta value2 = entry2.getValue();
									if(key.equals (key2)) {
										List<String> retorno = new ArrayList<>();
										retorno.add(nome);
										retorno.add(retornoCpf.toString());
										retorno.add(Integer.toString(value2.getAgencia()));
										
										imprime.add(retorno);
										
									}
								}
						}*/
						
						HashMap <String, Long> ordena = new HashMap<>();
						for (Long key : clientes.keySet()) {
							imprime.add(clientes.get(key).getNome());
							ordena.put(clientes.get(key).getNome(), key);
							}
							Collections.sort(imprime);
							int tam = imprime.size();
							
						for (int i=0; i<tam; i++) {
							if(ordena.containsKey(imprime.get(i))) {
							System.out.println(imprime.get(i));
							System.out.println(ordena.get(imprime.get(i)));
							System.out.println(contas.get(ordena.get(imprime.get(i))));
						}
						}
						
				
				operacao = menuOperacao(usuario);
					 }
	
			case 9:
				if (usuario.equals("Presidente")) {
					System.out.println("O saldo total do Banco �: " + Conta.getSaldoTotal());
					gravar.imprimeSaldoTotal(Conta.getSaldoTotal());
					operacao = menuOperacao(usuario);
				} else {
					System.out.println("Acesso negado.");
					operacao = menuOperacao(usuario);
				}
				
			default:
				System.out.println("Op��o Inv�lida.");
				operacao = menuOperacao(usuario);
			}
		}
		
	}

	public static int menuOperacao(String usuario) throws InputMismatchException {

		if (usuario.equals("Presidente")) {
			System.out.println("Escolha uma das opera��es: 1-Saque 2-Dep�sito 3-Transfer�ncia  4-Saldo "
					+ "5- Checar Tributa��o 6- Checar Rendimento 7-Numeros de contas na ag�ncia 8-RelatorioCompleto 9-SaldoTotalDoBanco 0-Encerrar Opera��o");
		} else if (usuario.equals("Diretor")) {
			System.out.println("Escolha uma das opera��es: 1-Saque 2-Dep�sito 3-Transfer�ncia  4-Saldo "
					+ "5- Checar Tributa��o 6- Checar Rendimento 7-Numeros de contas na ag�ncia 8-RelatorioCompleto  0-Encerrar Opera��o");

		} else if (usuario.equals("Gerente")) {
			System.out.println("Escolha uma das opera��es: 1-Saque 2-Dep�sito 3-Transfer�ncia  4-Saldo "
					+ "5- Checar Tributa��o 6- Checar Rendimento 7-Numeros de contas na ag�ncia 0-Encerrar Opera��o");
		} else {
			System.out.println("Escolha uma das opera��es: 1-Saque 2-Dep�sito 3-Transfer�ncia  4-Saldo "
					+ "5- Checar Tributa��o 6- Checar Rendimento 0-Encerrar Opera��o");
		}

		try {
			Scanner scan = new Scanner(System.in);
			int operacao = scan.nextInt();
			return operacao;
		} catch (InputMismatchException e) {
			System.out.println("N�mero Inv�lido, Digite um n�mero V�lido.");
			return 53;
		}
	}

	public static boolean verificaDestinatario(HashMap<Long, Funcionario> funcionarios, HashMap<Long, Cliente> clientes,
			long cpf) {
		if (clientes.containsKey(cpf) == true) {

			return true;
		} else if ((funcionarios.containsKey(cpf) == true)) {

			return true;
		} else {
			return false;
		}
	}
}

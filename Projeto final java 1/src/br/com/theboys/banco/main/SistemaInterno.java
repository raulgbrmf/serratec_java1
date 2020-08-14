package br.com.theboys.banco.main;

import java.io.FileNotFoundException;
import java.util.Scanner;

import br.com.theboys.banco.contas.Conta;
import br.com.theboys.banco.telas.Tela;
import br.com.theboys.banco.telas.TelaCliente;
import br.com.theboys.banco.telas.TelaDiretor;
import br.com.theboys.banco.telas.TelaGerente;
import br.com.theboys.banco.telas.TelaPresidente;
import br.com.theboys.banco.usuario.Cliente;
import br.com.theboys.banco.usuario.Funcionario;
import br.com.theboys.banco.util.LerCsv;
import br.com.theboys.banco.util.LimpaTela;
import br.com.theboys.banco.util.LoginException;

public class SistemaInterno {

	public static void login() throws FileNotFoundException {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("O----------------------------O");
		System.out.print("|-> Digite seu cpf: ");
		String cpf = scanner.next();
		System.out.println("O----------------------------O");
		System.out.print("|-> Digite sua senha: ");
		String senha = scanner.next();
		LimpaTela.limpa();
		Conta conta = null;
		String cargo = "Cliente";
		boolean ok = false;

		try {
			if (LerCsv.carregaConta().get(cpf) != null) {
				conta = LerCsv.carregaConta().get(cpf);
			}else {
				throw new LoginException();
			}
			
			if (LerCsv.carregaFuncionario().get(conta.getCpf()) != null) {
				Funcionario funcionario = LerCsv.carregaFuncionario().get(conta.getCpf());
				ok = funcionario.getSenha().equals(senha);
				cargo = funcionario.getCargo();
			} else {
				Cliente cliente = LerCsv.carregaCliente().get(conta.getCpf());
				ok = cliente.getSenha().equals(senha);
			}

			if (ok) {
				switch (cargo) {
				case "Cliente":
					TelaCliente.telaMenuCliente(conta);
					break;
				case "Gerente":
					TelaGerente.telaMenuGerente(conta);
					break;
				case "Diretor":
					TelaDiretor.telaMenuDiretor(conta);
					break;
				case "Presidente":
					TelaPresidente.telaMenuPresidente(conta);
					break;
				default:
					System.out.println("Tipo inválido!");
				}

			} else {
				throw new LoginException();
			}
		} catch (RuntimeException e) {
		}
	}

	public static void main(String[] args) {

		Tela.telaMenu();
	}
}

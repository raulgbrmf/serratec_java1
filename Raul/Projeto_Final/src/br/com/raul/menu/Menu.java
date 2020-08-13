package br.com.raul.menu;

import java.util.*;

import br.com.raul.contas.*;
import br.com.raul.usuario.*;

public class Menu {

	public void menuConta(Usuario usuarioLogado, Conta contaLogada) {
		Scanner scan = new Scanner(System.in);
		int input;
		while(true) {
			System.out.println("Digite 1 para realizar movimentações na conta");
			System.out.println("Digite 2 para relatorios da conta");
			System.out.println("Digite 3 para sair");
			input = scan.nextInt();
			if(input == 1) {
				menuMovimentacoes(usuarioLogado, contaLogada);
			} else if (input == 2) {
				menuRelatoriosConta();
			} else if (input == 3) {
				System.out.println("Byebye");
				break;
			} 
		}		
	}
	
	public void menuMovimentacoes(Usuario usuarioLogado, Conta contaLogada) {
		Scanner scan = new Scanner(System.in);
		int inputMenu;
		double valor;
		while(true) {
			System.out.println("Digite 1 para saque");
			System.out.println("Digite 2 para depósito");
			System.out.println("Digite 3 para transferência");
			System.out.println("Digite 4 para voltar");
			inputMenu = scan.nextInt();
			if(inputMenu == 1) {
				System.out.println("Qual valor você deseja sacar?");
				valor = scan.nextDouble();
				contaLogada.saca(valor);
			} else if (inputMenu == 2) {
				System.out.println("Nao implementado");
			} else if (inputMenu == 3) {
				System.out.println("Nao implementado");
			} else if (inputMenu == 4) {
				menuConta(usuarioLogado, contaLogada);
			}
		}
	}

	
	public void menuRelatoriosConta() {
		Scanner scan = new Scanner(System.in);
		int input;
		while(true) {
			System.out.println("Digite 1 para impressão do saldo");
			System.out.println("Digite 2 para relatorio de tributação ( apenas conta corrente )");
			System.out.println("Digite 3 para poupança ( apenas conta poupança )");
			System.out.println("Digite 4 para sair");
			if(scan.nextInt() == 1) {
				System.out.println("Nao implementado");
			} else if (scan.nextInt() == 2) {
				System.out.println("Nao implementado");
			} else if (scan.nextInt() == 3) {
				System.out.println("Nao implementado");
			}  else if (scan.nextInt() == 4) {
				System.out.println("Byebye");
				break;
			}
		}
	}

}

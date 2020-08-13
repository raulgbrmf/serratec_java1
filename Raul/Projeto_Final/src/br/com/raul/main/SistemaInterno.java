package br.com.raul.main;

import java.util.*;

import br.com.raul.contas.*;
import br.com.raul.menu.Menu;
import br.com.raul.usuario.*;

public class SistemaInterno {

	public static void main(String[] args) {
		
		// INICIALIZA MAPAS DE CLIENTES, CONTAS E FUNCIONARIOS
		Map<Long,Cliente> mapaClientes = new HashMap<>();
		Map<Long, Funcionario> mapaFuncionario = new HashMap<>();
		Map<Long, Conta> mapaContas = new HashMap<>();
		
		// INICIALIZA CLASSE DO MENU
		Menu menu = new Menu();
		
		// INICIALIZA USUARIO E CONTA LOGADO
		Usuario usuarioLogado = null;
		Conta contaLogada = null;
		
		// valores que o usuario digitaria inicialmente
		int senhaDigitada = 123;
		long cpfDigitado = 14731721792L;
		
		// populei meu mapa de clientes e funcionarios na mão para testar o login
		mapaClientes.put(14731721792L,new Cliente(123,14731721792L));
		mapaFuncionario.put(12312312323L, new Gerente(456, 12312312323L, 12));
		mapaFuncionario.put(3123133231L, new Diretor(567, 3123133231L));
		
		// populei meu mapa de contas na mao para testes
		mapaContas.put(14731721792L, new ContaCorrente(14731721792L, 1000, 12));
		
		
		// LOGANDO CLIENTE NO SISTEMA 
		System.out.println("Bem vindo ao sistema do Banco!");
		System.out.println("Digite seu CPF: " + cpfDigitado);
		System.out.println("Digite sua senha: " + senhaDigitada);
		String logou = login(cpfDigitado, senhaDigitada, mapaClientes, mapaFuncionario);
		
		if(logou.equals("Nao encontrado")) {
			System.out.println("CPF nao cadastrado");
		}
		else if(logou.equals("Cliente")) {
			System.out.println("\nBem vindo : " + logou + " " + cpfDigitado); // testando se ele identifica o meu login
			usuarioLogado = criaCliente(cpfDigitado, mapaClientes);
			contaLogada = criaConta(cpfDigitado, mapaContas);
		}
		else {
			System.out.println("\nBem vindo : " + logou + " " + cpfDigitado); // testando se ele identifica o meu login
			usuarioLogado = criaFuncionario(cpfDigitado, mapaFuncionario);
			contaLogada = criaConta(cpfDigitado, mapaContas);
		}
		
		
		
		// USAR USUARIO LOGADO PARA LÓGICA DO PROGRAMA
		if(usuarioLogado.getTipo().equals("Cliente")) {
			menu.menuConta(usuarioLogado, contaLogada);
		}
		
		

	}
	
	public static Conta criaConta(long cpfDigitado, Map<Long, Conta> contas) {
		return contas.get(cpfDigitado);
	}
	
	public static Cliente criaCliente(long cpfDigitado, Map<Long, Cliente> clientes) {
		return clientes.get(cpfDigitado);
	}
	
	public static Funcionario criaFuncionario(long cpfDigitado, Map<Long, Funcionario> funcionarios) {
		return funcionarios.get(cpfDigitado);
	}
	
	public static String login(long cpfDigitado, int senhaDigitada, Map<Long, Cliente> mapCliente, Map<Long, Funcionario> mapFuncionario) {
		if(mapCliente.get(cpfDigitado) != null ) {
			Cliente ctemp = mapCliente.get(cpfDigitado);
			if(ctemp.senha == senhaDigitada) {
				return "Cliente";
			} else {
				return "Senha incorreta";
			}
		} else if (mapFuncionario.get(cpfDigitado) != null) {
			Funcionario ftemp = mapFuncionario.get(cpfDigitado);
			if(ftemp.senha == senhaDigitada) {
				return ftemp.cargo;
			} else {
				return "Senha incorreta";
			}
		} 
		return "Nao existe";
	}

}

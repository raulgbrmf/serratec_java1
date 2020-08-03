package br.com.caelum.main;

import br.com.caelum.contas.Cliente;
import br.com.caelum.contas.Conta;
import br.com.caelum.contas.Funcionario;
import br.com.caelum.contas.Gerente;
import br.com.caelum.util.ControleBonificacoes;

public class Main {
	public static void main(String[] args) {

		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Gerente gerente1 = new Gerente("Raul");
		Funcionario funcionario1 = new Funcionario("Pedro");
		ControleBonificacoes controle1 = new ControleBonificacoes();
		
		controle1.registra(funcionario1);
		controle1.registra(gerente1);
		
		funcionario1.nome = "Pedro";
		funcionario1.cpf = "111.111.111-11";
		
		gerente1.nome = "Ana";
		gerente1.cpf = "222.222.222-22";
		
		funcionario1.consultaBonificacao();
		gerente1.consultaBonificacao();
		System.out.println();
		controle1.consultaTotalBonicacao();
		
		System.out.println();
		funcionario1.imprimeSalario();
		gerente1.imprimeSalario();
		
		conta1.titular = cliente1.nome = "Fabiene Avilla";
		conta1.numero = 3001;
		conta1.dataAbertura = "31.07.2020";
		conta1.saldo = 1000.00;

		conta2.titular = cliente2.nome = "Thayná de Oliveira";
		conta2.numero = 2902;
		conta2.dataAbertura = "29.07.2020";
		conta2.saldo = 1500.00;
		System.out.println();
		
		conta1.consultaSaldo();
		conta1.deposita(50);
		conta1.consultaSaldo();
		conta1.rendimentoMensal();
		System.out.println();
		
		conta1.recuperaDados();
	}
}

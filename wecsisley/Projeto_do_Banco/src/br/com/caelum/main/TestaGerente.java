package br.com.caelum.main;

import br.com.caelum.pessoa.Funcionario;
import br.com.caelum.pessoa.Gerente;
import br.com.caelum.util.ControleBonificacoes;

public class TestaGerente {
	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente("");
		gerente1.setNome("Raul");
		gerente1.setSenha(123);
		gerente1.setSalario(5000);
		
		System.out.println(gerente1.getBonificacao());
		
		ControleBonificacoes controle = new	ControleBonificacoes();
		
		Gerente	funcionario1 = new Gerente("");
		funcionario1.setSalario(5000.0);
		controle.registra(funcionario1);
		
		Funcionario	funcionario2 = new Gerente("");
		funcionario2.setSalario(1000.0);
		controle.registra(funcionario2);
		
		System.out.println(controle.getTotalDeBonificacoes());
		
		
	}

}

package br.com.caelum.usuario.main;

import br.com.caelum.usuario.*;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("Mayana", 1000);
		System.out.println("Nome: " + g1.getNome() + "\nSal�rio: R$" + g1.getSalario() + "\nBonifica��o: R$" 
		+ g1.getBonificacao());
		
		System.out.println("===========================");
		
		SubGerente sg1 = new SubGerente("Pedro", 1000);
		System.out.println("Nome: " + sg1.getNome() + "\nSal�rio: R$" + sg1.getSalario() + "\nBonifica��o: R$"
				+ sg1.getBonificacao());
	}
	
}

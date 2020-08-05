package br.com.g2ac.contas.main;

import br.com.g2ac.usuario.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("João da Silva");
		gerente.setSenha(4231);
		
		Gerente gerenteq = new Gerente();
		gerenteq.setSalario(5000.0);
		System.out.println(gerenteq.getBonificacao());

	}
}

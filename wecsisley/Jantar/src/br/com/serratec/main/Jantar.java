package br.com.serratec.main;

import br.com.serratec.comida.Arroz;
import br.com.serratec.comida.Feijao;
import br.com.serratec.comida.Sorvete;
import br.com.serratec.pessoa.Pessoa;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65, "Pedro");
		
		Arroz prato1 = new Arroz (0.02, "Arroz");
		Feijao prato2 = new Feijao (0.01, "Feijao");
		Sorvete prato3 = new Sorvete (0.1, "Sorvete");
		
		System.out.println("\nO Convidado: " + convidado.getNome() 
		+ ", pesa: " + convidado.getPeso() + "kg.");
		
		convidado.comer(prato1);
		convidado.comer(prato1);
		System.out.println("\nO Convidado: " + convidado.getNome() 
		+ ", pesa: " + convidado.getPeso() + "kg.");
		
		convidado.comer(prato2);
		System.out.println("\nO Convidado: " + convidado.getNome() 
		+ ", pesa: " + convidado.getPeso() + "kg.");
		
		convidado.comer(prato3);
		System.out.println("\nO convidado: " + convidado.getNome() 
		+ ", pesa: " + convidado.getPeso() + "kg." );
		
		
	}
}

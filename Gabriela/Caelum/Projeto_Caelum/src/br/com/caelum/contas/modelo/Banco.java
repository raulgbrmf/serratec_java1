package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Banco {

	private String nome;
	private int numero;
	private Conta[] contas;
	
	
	
	public void adiciona (Conta c){
		List <Conta> conta = new ArrayList<>();
		
		
		
	}
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
		}
		
		public Banco() {
			
		}

		

		/*public void adiciona(Conta c) {
			
			for(int i = 0; i < this.contas.length; i++){
				System.out.println(contas[i]);
				}
		}*/
		
		public void mostraContas() {
			for (int i = 0; i < this.contas.length; i++) {
				contas.toString();		
			}
		}

		
		public String toString() {
			return "Banco [nome=" + nome + ", numero=" + numero + ", contas=" + Arrays.toString(contas) + "]";
		}

			
			
}

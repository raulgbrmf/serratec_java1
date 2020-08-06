package br.com.Serratec.contas;

public class Visitante extends Pessoa {

	@Override
	public void fazerAniversario() {
		this.idade ++;
		System.out.println("\nFeliz Aniversário " + this.nome);
		System.out.println("Você está completando " + this.idade + " anos!");
	}

}

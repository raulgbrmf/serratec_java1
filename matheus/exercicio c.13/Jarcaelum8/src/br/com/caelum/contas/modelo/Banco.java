package br.com.caelum.contas.modelo;

public class Banco {

	private String nome;
	private int numero;
	private Conta[] contas;

	// outros atributos que você achar necessário
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void adiciona(Conta c) {
		for (int i = 0; i < this.contas.length; i++) {
			try {
				if (contas[i] == null) {
					contas[i] = c;
					break;
				}
			} catch (Exception e) {
				System.out.println("erro! conta nao criada");

			}
			

		}
	}

	public void mostraContas() {
		for (int i = 0; i < this.contas.length; i++) {
			if(contas[i]!=null) {
				System.out.println("Conta	na	posição	" + i);
				System.out.println(contas[i].toString());
			}
			
		}
	}
	public boolean contem(Conta conta) {
		for(int i=0;i<contas.length;i++) {
			if(contas[i]==conta) {
				return true;
			}
		}
		return false;
	}

}

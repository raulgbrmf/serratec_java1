package modeloContas;

public class Banco {

	private String nome;
	private int numero;
	private Conta[] contas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new Conta[10];
	}

	public String getNome() {
		return this.nome;
	}

	public int getNumero() {
		return this.numero;
	}

	/*
	 * public void adiciona(Conta conta) {
	 * 
	 * for (int i = 0; i < this.contas.length; i++) { if (this.contas[i] == null) {
	 * this.contas[i] = conta; return; } }
	 * 
	 * throw new NullPointerException("Ops! Parece que o vetor está cheio! x)"); }
	 */

	public void adiciona(Conta conta) { // EXERCICIO 10

		for (int i = 0; i < this.contas.length; i++) {
			if (this.contas[i] == null) {
				this.contas[i] = conta;
				return;
			}
		}
		criaNovoVetor(conta);
	}

	private void criaNovoVetor(Conta conta) { // EXERCICIO 10

		Conta[] vetorTemporario = new Conta[this.contas.length];

		for (int i = 0; i < this.contas.length; i++) {
			vetorTemporario[i] = contas[i];
		}

		contas = new Conta[this.contas.length + 10];

		for (int i = 0; i < vetorTemporario.length; i++) {			
				contas[i] = vetorTemporario[i];					
		}
		adiciona(conta);
	}

	public void mostraConta() {
		for (Conta x : contas) {
			if (x != null) {
				System.out.println("Conta na posição: " + x);
			}
		}
	}

	public boolean contem(Conta conta) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] == conta) {
				return true;
			}
		}
		return false;
	}
}

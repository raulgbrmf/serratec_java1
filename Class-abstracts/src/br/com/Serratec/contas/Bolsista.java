package br.com.Serratec.contas;

public class Bolsista extends Aluno {

	private int bolsa = 15;

	public void renovarMensalidade() {
		System.out.println("Renovando bolsa de " + getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println("O aluno " + getNome() + " é bolsista! Pagamento facilitado.");
		System.out.println("Seu desconto foi de " + this.bolsa + "%");

	}
}

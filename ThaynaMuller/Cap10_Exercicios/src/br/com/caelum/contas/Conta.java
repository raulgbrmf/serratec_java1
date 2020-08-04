package br.com.caelum.contas;

public abstract class Conta {
	
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	//Transformando o método atualiza em abstrato():
	public abstract void atualiza(double taxa);

}

/* Se apagarmos o método atualiza() em Conta isso não afetará as contas filhas. Mesmo não retornando um valor o método atualiza() 
 * deve existir para que não seja preciso o reescrever em todas as contas filhas uma vez que, tendo na conta mãe este método será
 * herdado por todas elas.
 */



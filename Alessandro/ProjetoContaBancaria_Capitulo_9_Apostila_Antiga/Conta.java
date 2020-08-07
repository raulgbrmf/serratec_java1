/*
 * Exercício - 1. Porque possui duas classe filhas que herdaram seus métodos.
 * Uma boa candidata a se tornar abstrata é o método * "atualiza."  
 */

/* 
 * Exercício - 2. A utilidade está no fato de que servirá para o polimorfismo e
 * para a herança dos atributos	e métodos. Sim.
 */

public abstract class Conta {
	
	protected double saldo;
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void saca(double valor) {
		this.saldo = this.saldo - valor;
	}

	public double getSaldo() {
		return this.saldo ;
	}
	
	/*
	 * Exercício - 3. Com a introdução do "abstract" no método, este deixou de
	 * possuir o seu corpo, transferindo toda a sua funcionalidade para a classe
	 * filha "ContaPoupança".
	 */
	
	public abstract void atualiza(double valor); 
	
	/*
	 * Exercício -6. Para que ela possa servir de referência para as classes filhas. Ocorrerá um erro,
	 * pois as classes filhas deixaram de ter a referência da classe mãe, porém, isso ocorrerá se houver
	 * o termo "@override", pois se este for retirado, as classes filhas entenderão que o "atualiza" é
	 * um método próprio de cada uma e, por isso, será compilado.
	 */
	
	// Exercício - 7. Sim.
	
}

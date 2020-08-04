package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {

	/*
	 * exercício 5 - Não, uma classe filha é obrigada a implementar os métodos
	 * abstratos da classe pai.
	 */

	/*
	 * exercício 6 - Para obrigar a implementação do mesmo na classe filha,
	 * através de sobrescrita de método. O código continua funcionado, pois o
	 * método irá pertencer apenas a classe filha
	 */

	public String getTipo() {
		return "Conta Poupança";
	}

}

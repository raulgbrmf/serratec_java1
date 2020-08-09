package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {
	
		
	   // Exercício 10.6.3
	
		/*public String getTipo ()
		{
			return super.getTipo() + "Poupança"; 
		} */
	
	//Como na classe Conta o método está abstract ele determina que a Classe Poupança ( uma classe
	// concreta) a escrever o método.Assim sendo, temos que reescrever o método aqui.
	 
	public String getTipo ()
	{
		return  "Conta Poupança"; 
	} 





}

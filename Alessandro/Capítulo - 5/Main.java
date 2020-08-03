
public class Main {

	public static void main(String[] args) {

		Data dataDeAbertura = new Data();
		dataDeAbertura.dia = 20;
		dataDeAbertura.mes = 07;
		dataDeAbertura.ano = 2010;

		Conta c1 = new Conta("Alessandro"); // Exercício - 4. Ver explicação na classe Conta.java.
		Conta c2 = new Conta();
		Conta c3 = new Conta();
		
		/*
		 * Exercício - 1. Colocando-se o termo "private", os dados dos objetos se tornaram invisíveis
		 * dentro da Main, por isso, não é possível imprimi-los. O programa mostra a ocorrência de erros.
		 * 
		 */
		
		//c1.titular = "Alessandro";  
		//c1.numero = 123;
		//c1.agencia = "3265-4";
		//c1.saldo = 1245.55;
		//c1.dataAbertura = "15/01/2001";
		//System.out.println(c1.titular, c1.numero, c1.agencia, c1.saldo, c1.dataAbertura);
		
		//Exercício - 3. Os dados somente tornaram-se visíveis com o uso de "set" e "get".
			
		c1.setTitular("Alessandro"); 
		System.out.println(c1.getTitular());
		
		
		PessoaFisica pf1 = new PessoaFisica ("12345678921"); // Exercício - 7.
	
		System.out.println(c1.getId());
		System.out.println(c2.getId());
		System.out.println(c3.getId());

		/*
		 * c1.setTitular("Alessandro"); c1.setNumero(126); c1.setAgencia("2981-6");
		 * c1.setSaldo(1895.73); c1.setDataAbertura(dataDeAbertura); System.out.println
		 * (c1.getTitular() + "\n" + c1.getNumero() + "\n" + c1.getAgencia() + "\n" +
		 * c1.getSaldo() + "\n" +c1.getDataAbertura());
		 */

	}

}

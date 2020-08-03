
public class Main {

	public static void main(String[] args) {
		
	
		Conta c1 = new Conta("Ramon"); //Usando construtor para passar um nome.
		Conta c2 = new Conta(); //Usando contrutor sem argumentos.
		
		
		
		c1.saca(100);
		c1.deposita(500);             
		c1.getCalculoRendimento();	
		
		System.out.println("Titular: " + c1.getTitular()); 						     //Utilizando o getTitular
		System.out.println("Agencia: " + c1.getAgencia());                           //Utilizando o getAgencia
		System.out.println("Saldo: " + c1.getSaldo());                               //Utilizando o getSaldo
		System.out.println("Data de abertura da conta: " + c1.getDataDeAbertura());  //Utilizando o getDataDeAbertura
		System.out.println("Rendimento da conta: " + c1.getCalculoRendimento());     //Utilizando o getCalculoRendimento
		
		System.out.println(" ");
		
		c2.saca(600);
		c2.deposita(100);             
		c2.getCalculoRendimento();	
		
		System.out.println("Titular: " + c2.getTitular()); 						     //Utilizando o getTitular
		System.out.println("Agencia: " + c2.getAgencia());                           //Utilizando o getAgencia
		System.out.println("Saldo: " + c2.getSaldo());                               //Utilizando o getSaldo
		System.out.println("Data de abertura da conta: " + c2.getDataDeAbertura());  //Utilizando o getDataDeAbertura
		System.out.println("Rendimento da conta: " + c2.getCalculoRendimento());     //Utilizando o getCalculoRendimento

	}

}

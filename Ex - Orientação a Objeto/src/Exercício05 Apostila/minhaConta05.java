public class minhaConta05 {

	public static void main(String[] args) {
		
		Conta05	c1 = new Conta05();	
		
		c1.titular = "Alan Patrik";
		c1.numero_da_conta = "01.065983-4";
		c1.agencia = "46791-7";
		c1.saldo = 150.50;
		c1.dataDeAbertura = "29/07/2020";
		
		Conta05 c2 = new Conta05();								
		
		c2.titular = "Alan Patrik";
		c2.numero_da_conta = "01.065983-4";
		c2.agencia = "46791-7";
		c2.saldo = 150.50;
		c2.dataDeAbertura = "29/07/2020";
		
		c1 = c2;
		
		if(c1 == c2) {
			System.out.println("iguais");
			
		}	
		else{
			System.out.println("diferentes");	
			
		}
	}
}

package novo_projeto;

public class Aa_Bb {

	public static void main(String[] args) {
		
		
		Conta c1 = new Conta();
		c1.titular= "Nicholas";
		c1.saldo=100;
		
		
		Conta c2 = new Conta();
                c2.titular = "Nicholas";
		c2.saldo=100;
                
		//c2 = c1(opcional);
		
		if (c1==c2) {
			System.out.println("iguais");
			
		}
			
			else {
				
				System.out.println("diferentes");
				
				
				//mesmo que os atributos sejam iguais, os indicadores(id) serão diferentes,
				//mas se eu declarar c2=c1, então serão iguais
			
		}
		
	}
}
	
		
		
				
				
		
		
		
		
		
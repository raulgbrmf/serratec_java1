
public class Exerc�cio2 {

	public static void main(String[] args) {
		
		int numero; 
		int soma = 0; 
		
		//percorrendo de 1 at� 1000, usando a vari�vel soma que inicia em 0 e armazena todos os n�meros de 1 a 1000//
		for(numero = 1; numero <= 1000; numero++) {
			soma = soma + numero;
		}
		
		  System.out.println("Soma: " +soma);
	}

}

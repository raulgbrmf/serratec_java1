
public class Exercício2 {

	public static void main(String[] args) {
		
		int numero; 
		int soma = 0; 
		
		//percorrendo de 1 até 1000, usando a variável soma que inicia em 0 e armazena todos os números de 1 a 1000//
		for(numero = 1; numero <= 1000; numero++) {
			soma = soma + numero;
		}
		
		  System.out.println("Soma: " +soma);
	}

}

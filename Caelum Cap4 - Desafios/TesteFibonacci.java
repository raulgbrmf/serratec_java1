//4.13 DESAFIOS PAG 69
//Numero 2 - Eu acho que e porque ele e chamado varias vezes.
//com 100 demorou bastante para terminar.

public class TesteFibonacci {

	public static void main(String[] args) {
		
			Fibonacci fibonacci = new Fibonacci();
		
			for (int i = 1; i <=50; i++) {
			
			int resultado = fibonacci.calculaFibonacci(i);
			System.out.println(resultado);
		}	
	}
}

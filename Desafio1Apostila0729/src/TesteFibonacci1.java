public class TesteFibonacci1 {
		
	public static void main(String[] args) {
		
		Fibonacci1 fibonacci = new Fibonacci1();
		//OPERADOR CONDICIONAL TERNÁRIO
		//for (int i = 1; i <= 6; i++) {
			//System.out.print(fibonacci.calculaFibonacci(i) + "\t");
		
		for(int i = 1; i <= 6; i++) {
			int resultado = fibonacci.calculaFibonacci(i);
			System.out.print(resultado + "\t");
		
		//Apresenta o problema de desempenho muito lento, 
		//pois as diversas chamadas recursivas fazem com que os mesmos 
		//valores sejam recalculados diversas vezes.
	}

	}

}




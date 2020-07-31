package experimento_aula2;

public class Main2 {
	public static void main (String [] args) {
		Fibonacci fibonacci = new Fibonacci();
		for (int i=1;i<=6;i++) {
			int resultado=fibonacci.calculaFibonacci(i);
			System.out.println(resultado);
		}
	}
}


public class Fibonacci1 {
	
	int calculaFibonacci (int numero) {
		return(numero < 2 ? numero : (calculaFibonacci(numero - 1) + calculaFibonacci(numero - 2)));
	}

}

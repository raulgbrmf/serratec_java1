package Fibonacci;

public class Fibonacci {

	public int calculaFibonacci (int i) {
		if (i==0) {
			return 0;
		}
		else if(i==1) {
			return 1;
		}
		else {
			return calculaFibonacci(i-2) + calculaFibonacci(i-1);
		}
	}
}

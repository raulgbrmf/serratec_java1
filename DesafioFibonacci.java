//Muito lento
public class DesafioFibonacci {
	
	public static long fibonacci (int valor) {
		
		if(valor<2)
			return 1;
		else
			return fibonacci(valor-1)+fibonacci(valor-2);
	}

	public static void main(String[] args) {
		
		int cont;
		
		for(cont=0;cont<=10;cont++) {
			System.out.print(DesafioFibonacci.fibonacci(cont)+" , ");
		}

	}
	
	

}

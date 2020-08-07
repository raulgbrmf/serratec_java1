//imprima	 os	 primeiros	 números	 da	 série	 de	 Fibonacci	 até	 passar	 de	 100.	
public class DesafioFibonacci {

	public static void main(String[] args) {
		
		int numero1=0, numero2=1;
		
		System.out.print(numero1 + "  ");
		while(numero1<=100) {
			numero1 = numero1 + numero2;
			System.out.print(numero1 + "  ");
			numero2 = numero1 - numero2;
		}
		
	}

}
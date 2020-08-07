//mprima	 os	 primeiros	 números	 da	 série	 de	 Fibonacci	 até	 passar	 de	 100.	
public class Exercicio6 {

	public static void main(String[] args) {
		int numero1=0, numero2=1, fibbonaci=0;
		

		for(fibbonaci=0; fibbonaci <= 100; fibbonaci = numero1 + numero2) {
			System.out.print(fibbonaci + "  ");
			numero1 = numero2;
			numero2 = fibbonaci;
		}
	}

}

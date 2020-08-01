
public class Exercicio_5 {

	public static void main(String[] args) {
		
		long fatorial = 1;
		
		for (long i = 1 ; i <= 20; i++) {  //long possui mais capacidade de armazenamento que int.
			
			fatorial = fatorial * i;
			
			System.out.println(fatorial);
		}
	}

}

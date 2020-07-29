
public class Exercício3 {

	public static void main(String[] args) {
		
		int numero; 
		
		//usando o if para que somente apareçam os número divisíveis por 3//
		for(numero = 1; numero <= 100; numero++) {
			if(numero % 3 == 0) {
				System.out.println(numero);
			}
		}

	}

}

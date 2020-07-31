
public class Exercicio8 {

	public static void main(String[] args) {
		
		int linha, coluna;

		for (linha = 1; linha <= 4; linha++) {
			
			for (coluna = 1; coluna <= linha; coluna++) {
				System.out.print(linha * coluna + " ");				
			}
			
			System.out.println(" ");
		}

	}
}
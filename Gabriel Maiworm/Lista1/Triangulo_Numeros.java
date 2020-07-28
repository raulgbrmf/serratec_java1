import java.util.Scanner;

public class Triangulo_Numeros {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int linhas, colunas, contador;
		
		System.out.println("Deseja quantas linhas no seu triângulo? ");
		linhas = scan.nextInt();
		
		for(int i = 0; i < 100;i ++) {    // Limpa tela
			System.out.println();
		}
		
		for(contador = 1;contador <= linhas;contador ++) {
			for(colunas = 1;colunas <= contador;colunas ++) {
				System.out.print(colunas +" ");
			}
			System.out.println();
		}
		
	}

}

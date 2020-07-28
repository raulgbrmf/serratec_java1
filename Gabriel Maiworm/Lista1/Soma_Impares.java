import java.util.Scanner;

public class Soma_Impares {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int quantidade, impar = -1, resultado = 0;
		
		System.out.println("Quantos números ímpares deseja somar? ");
		quantidade = scan.nextInt();
		
		for(int i = 0;i < quantidade;i ++) {
			impar = impar + 2;
			System.out.println(impar);
			resultado = resultado + impar;
		}
		System.out.println("O valor da soma dos "+ quantidade +" números ímpares é: "+ resultado);
		scan.close();
	}

}

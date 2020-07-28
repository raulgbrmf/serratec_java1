import java.util.Scanner;

public class Exercicios7 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		ler.close();
		
		while(num!=1) {
			
			if(num%2==0) {
				num=num/2;
				System.out.print(num+" -> ");
			}
			else {
				num=3*num+1;
				System.out.print(num+" -> ");
			}
		}
		
	}

}

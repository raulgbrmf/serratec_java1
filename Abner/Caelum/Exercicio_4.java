
public class Exercicio_4 {

	public static void main(String[] args) {

		int fat = 1;
		
		System.out.println("O fatorial de 0 � : 1");
		
		for (int i = 1; i <= 10; i++) {
			fat = fat * i;
			System.out.println("O fatorial de " + i + " � ("+ (i - 1) +"!) * " + i + " = " + fat);
		}		
		
	}
}

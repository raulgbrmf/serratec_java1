
public class Exerc�cio4 {

	public static void main(String[] args) {
		int num;
		int fatorial = 1;
		
		//fazendo o fatorial de 1 at� 10
		for(num = 1; num <= 10; num++) {
			fatorial = fatorial * num;
			System.out.println("O fatorial de " + num + " � (" +(num-1)+"!) * "+num+" = "+fatorial);
		}

	}

}

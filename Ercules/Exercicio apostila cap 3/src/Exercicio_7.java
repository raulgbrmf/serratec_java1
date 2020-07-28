import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		
		int num;
		Scanner leia = new Scanner(System.in);
		num = leia.nextInt();
		
		for(int i = 1; i != num; i = 1) {
			
			if(num % 2 == 0) {
				num = num/2;
				System.out.print("->" + num);
			}else {
				num = 3 * num + 1;
				System.out.print("->" + num);
			}
			
		}
		
		leia.close();
		
	}
}

// 4. Imprima os fatoriais de 1	a 10.

public class Exercicio_4 {

	public static void main(String[] args) {
		
	int num = 1;
		for (int i = 1; i <= 10; i++) {
			num = num * i;
			System.out.println ("O fatorial de " + i + " é (" + (i-1) + ")! * " + i + " = " + num);
		}
	}	
}
	





package Pg33;
public class pg33_Exe4 {

	public static void main(String[] args) {
		
		int fatorial = 1;
		System.out.println("Fatorial de 1 até 10: ");
		for(int i = 1; i <= 10; i++) {
			fatorial = fatorial * i;			
			System.out.println(i+" ("+i+"!) = "+fatorial);
		}
	}

}

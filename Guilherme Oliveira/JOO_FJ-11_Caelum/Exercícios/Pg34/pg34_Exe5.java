package Pg34;
public class pg34_Exe5 {

	public static void main(String[] args) {
		
		double fatorial = 1;
		System.out.println("Fatorial de 1 até 40: ");
		for(int i = 1; i <= 40; i++) {
			fatorial = fatorial * i;			
			System.out.println(i+" ("+i+"!) = "+fatorial);
		}
	}

}
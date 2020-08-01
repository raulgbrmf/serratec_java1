package caelum;

public class ex06semfuncao {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		
		for (int i = 0; i < 12; i++) {
			
			System.out.print(a + " ");
			b = b + a;
			a = b - a;
        }
	}
}

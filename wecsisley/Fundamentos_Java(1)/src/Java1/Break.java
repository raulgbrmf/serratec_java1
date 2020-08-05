package Java1;

public class Break {
	public static void main(String[] args) {
		
		int x = 15;
		int y = 10;
		
		for (int i = x; i < y; i++) {
			if (i % 19 == 0) {
				break;
			}
		}
		System.out.println("Achei um número	divisível por 19 entre x e y" );
	}
}

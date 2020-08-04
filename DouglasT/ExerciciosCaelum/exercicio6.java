public class exercicio6 {

	public static void main(String[] args) {
		
		int F = 0;
		int ant = 0;

		for (int i = 0; i <= 12; i++) {

			if (i == 1) {
				F = 1;
				ant = 0;
			} else {
				F = F + ant;
				ant = F - ant;
			}

			System.out.print(F+" ");

		}
	}
}

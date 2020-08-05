package Java1;

public class TrianguloDeNumerosAvancado {
	public static void main(String[] args) {

		escreveLinha(5);
	}

	public static void escreveLinha(int num) {
		if (num <= 1) {
			System.out.println(1);
		} else {
			escreveLinha(num - 1);
			for (int i = 1; i <= num; i++) {
				System.out.print(num * i + " ");
			}
			System.out.println();
		}
	}
}

public class FibonacciDuasVariaveis {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;

		while (n1 + n2 < 100) {
			System.out.print(n1 + ", ");
			n2 += n1;
			System.out.print(n2 + ", ");
			n1 += n2;
		}

	}

}

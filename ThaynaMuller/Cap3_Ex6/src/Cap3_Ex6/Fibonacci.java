package Cap3_Ex6;

public class Fibonacci {

	static long fibonacci(int n) {

		int Num1 = 0;
		int Num2 = 0;

		for (int i = 1; i <= n; i++) {

			if (i == 1) {
				Num1 = 1;
				Num2 = 0;
			} else {
				Num1 += Num2;
				Num2 = Num1 - Num2;
			}

		}

		return Num1;

	}

}


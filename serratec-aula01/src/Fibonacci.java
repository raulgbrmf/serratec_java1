
public class Fibonacci {
	
	static int fibonacci(int n) {
        return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
	
	public static void main(String[] args) {
		
		for (int i = 0; Fibonacci.fibonacci(i) < 100; i++) {
				System.out.print(Fibonacci.fibonacci(i) + ", ");
        }
	}

}

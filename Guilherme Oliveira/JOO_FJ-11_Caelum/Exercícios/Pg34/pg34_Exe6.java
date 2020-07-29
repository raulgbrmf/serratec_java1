package Pg34;
public class pg34_Exe6 {

	public static void main(String[] args) {
		System.out.println("Sequência de Fibonacci até +ou- 100:");
		for(int i = 1; i < 13; i++) {	
			System.out.println(fib(i));	
		}
	}
	static int fib(int n) 
	{ 
	    if (n <= 1) 
	       return n; 
	    return fib(n-1) + fib(n-2);
	} 	       
}



public class Exercicio_6 {

	public static void main(String[] args) {
		
		int fib = 0;
		int pri = 1, seg = 0;
		
		System.out.println(0);
		System.out.println(1);
		
		for(int i = 0; i <= 100; i++) {
			if(fib <= 100) {
				fib = pri + seg;
				seg = pri;
				pri = fib;
				System.out.println(fib);	
			}else {
				break;
			}
		}
	}
}


public class Exercicio_6 {

	public static void main(String[] args) {
		
		for (int x = 0; x <= 12; x++) {
			int result = calculaFibo(x);
			System.out.println(result);
		}

	}
	
	public static int calculaFibo(int num) {
	
		if (num < 2) {
			
			return num;
			
		}
		else {
			
			return calculaFibo(num - 1) + calculaFibo(num - 2);
		}
		
		
		
	}

}

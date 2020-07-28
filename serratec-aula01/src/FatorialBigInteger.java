import java.math.BigInteger;

public class FatorialBigInteger {
	public static void main(String[] args) {

		BigInteger fatorial = new BigInteger("1");
		
		for (int i = 1; i <= 50; i++) {
			
			fatorial = fatorial.multiply(BigInteger.valueOf(i));
			System.out.println("O fatorial de " + i + "! é igual a " + fatorial);
			
		}
		
	}

}

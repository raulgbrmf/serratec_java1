import java.math.BigInteger;

/* O programa começa a apresentar respostas incorretas pois o valor de caracteres que a variavel int 
 suporta é extrapolada*/

public class Exercicio_5 {

	public static void main(String[] args) {
		
		BigInteger f = new BigInteger("1");
		
		for(int i = 1; i <= 60; i++) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(f);
		
	}
}

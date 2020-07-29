package Pg33;
public class pg33_Exe2 {

	public static void main(String[] args) {
		int soma = 0, max = 1000;
		for(int i = 1; i <= max; i++) {		
			soma = soma + i;			
		}
		System.out.printf("A Soma de 1 até " + max +" é: "+ soma);
	}
}

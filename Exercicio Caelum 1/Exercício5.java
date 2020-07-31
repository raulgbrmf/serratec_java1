public class Exercício5 {
	public static void main(String [] args) {
		
		long fatorial =1;
		
		for(int n=1; n<=40; n++){
			fatorial = fatorial * n;
			System.out.println(fatorial);
		}
	}
}

//Os números acabam se tornando muito grandes para o int e também para o long chegando a entrar em hexadecimal.
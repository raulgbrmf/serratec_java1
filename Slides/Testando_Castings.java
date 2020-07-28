// 1  - Declare duas variáveis do tipo int e realize sua soma. 
// Em seguida, realize o casting destes dois inteiros para double para realizar sua divisão. 
// 2 - Declare dois caracteres : “A” e “Z”, 
// depois realize sua soma e armazene em uma variável do tipo inteiro. 
// Qual é o resultado apresentado? Por que você acha que esse foi o resultado apresentado?

public class Testando_Castings {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		int c = a + b;
		double d = (double) a / (double) b;
		
		System.out.println(c);
		System.out.println(d);
		
		char Z = 'Z';
		char X = 'X';
		int w = 0;
	
		w = Z + X;
		
		System.out.println(w); 
		// Ele esta somando o valor que as caracteres 'Z' e 'X' possuem, por isso o resultado estranho.
		
	    
		
		
	}

}

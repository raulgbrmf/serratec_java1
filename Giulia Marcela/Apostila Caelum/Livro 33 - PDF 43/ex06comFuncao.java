package caelum;

public class ex06comFuncao {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++){
			System.out.print(fibonacci(i) + " "); 
		}
	}

	public static int fibonacci(int posicao) {
		if(posicao == 1){
			return 0;
		}
		else if (posicao == 2){
			return 1;
		}
		return fibonacci(posicao - 1) + fibonacci(posicao - 2); 
	}
}

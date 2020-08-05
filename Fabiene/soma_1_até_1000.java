package experimento_aula;

public class soma_1_até_1000 {
	public static void main (String[] args) {
		int i=0;
		int num_inicial=1;
		int num_ultimo=1000;
		int soma=0;
		
		for(i=0;i<=num_ultimo;i++) {
			
			if(num_inicial%3==0) {
				System.out.println(soma);
			}
			num_inicial=num_inicial+i;
			soma=num_inicial-1;
			
		}
		System.out.println(soma);
	}
}

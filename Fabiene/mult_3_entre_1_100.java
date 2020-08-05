package experimento_aula;

public class mult_3_entre_1_100 {
	public static void main (String[] args) {
		int i;
		int num_inicial=1;
		int num_ultimo=100;
	
		
		for(i=num_inicial;num_inicial<=num_ultimo;i++) {
			
			if(num_inicial%3==0) {
				System.out.printf(num_inicial+" ");
			}
			num_inicial=num_inicial+1;
			
		}
	}
}	
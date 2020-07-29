package experimento_aula;


public class De_150_a_300 {
	public static void main (String[] args) {
		int i;
		int num_inicial=150;
		int num_ultimo=300;
		
		for(i=0;num_inicial<=num_ultimo;i++) {
			System.out.printf(num_inicial+" - ");
			num_inicial=num_inicial+1;
		}
			
	}
}

package experimento_aula;

public class fatorial_long {
	public static void main (String[] args) {
		long num_inicial=1;
		long num_ultimo=40;
		long fatorial=1;
		long i;
					
		System.out.println("O fatorial de 0 é 1");
		
		for(i=num_inicial; i<=num_ultimo; i++){
			fatorial*=i;
			System.out.println("O fatorial de "+i+" é "+fatorial);
		}
	}
}

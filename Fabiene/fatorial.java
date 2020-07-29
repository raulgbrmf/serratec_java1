package experimento_aula;

public class fatorial {
	public static void main (String[] args) {
		int num_inicial=1;
		int num_ultimo=10;
		int fatorial=1;
		int i;
					
		System.out.println("O fatorial de 0 é 1");
		
		for(i=num_inicial; i<=num_ultimo; i++){
			fatorial*=i;
			System.out.println("O fatorial de "+i+" é "+fatorial);
		}
	}
}

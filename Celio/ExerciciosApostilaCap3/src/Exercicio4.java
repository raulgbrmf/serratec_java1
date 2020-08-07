//Imprima	os	fatoriais	de	1	a	10.
public class Exercicio4 {

	public static void main(String[] args) {
		
		int numero, fatorial=1;
		
		System.out.println("O fatorial de 0 é: " + fatorial);
		
		for(numero=1; numero <=10; numero++) {
			fatorial = numero*fatorial;
			System.out.println("O fatorial de " + numero + " é: " + fatorial);
		}
	}

}

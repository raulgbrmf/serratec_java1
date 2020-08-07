//Imprima	os	fatoriais	de	1	a	20, 30, 40.
public class Exercicio5 {

	public static void main(String[] args) {
		
		long numero, fatorial=1;
		
		System.out.println("O fatorial de 0 é: " + fatorial);
		
		for(numero=1; numero <=20; numero++) {
			fatorial = numero*fatorial;
			System.out.println("O fatorial de " + numero + " é: " + fatorial);
		}
	}

}

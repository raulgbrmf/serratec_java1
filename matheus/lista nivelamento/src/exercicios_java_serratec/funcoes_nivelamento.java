package exercicios_java_serratec;
import java.util.Scanner;

public class funcoes_nivelamento {
	Scanner read = new Scanner(System.in);

	public void nomeCompleto() {
		System.out.print("digite seu nome: ");
		String a = read.nextLine();
		
		System.out.print("digite seu sobrenome: ");
		String b = read.nextLine();
		
		System.out.print("meus nome � :"+a+" " +b);
		
	}
	public void temperatura() {
		int far;
		System.out.print("Digite o valor da temperatura em celcius: ");
		int a = read.nextInt();
		far=a*9/5+32;
		System.out.print(a+" graus celsius � o mesmo que "+far+" graus fahrenheit");
		
		
	}
	
	public void somaImpar(int a) {
		int soma=0, vetor[],j=1;
		vetor = new int[a];
		System.out.print("numero de entrada �: " +a);
		System.out.println();
		System.out.print("os numero impares s�o: ");
		System.out.println();
		for(int i=0;i<vetor.length;i++) {
			vetor[i]=j;
			j=j+2;
			
		}
		
		for(int i=0;i<vetor.length;i++) {
			
				System.out.println(vetor[i]);
				soma=soma+vetor[i];
			
		}
		System.out.print("a soma dos n�meros impares naturais at� "+a+" � : "+soma);
		
	}
	
	public void triangulo(int a) {
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+1);
				}
			System.out.println();			
		}				
	}

	public void palindromo() {
		int num=0, aux;
		int a = read.nextInt();
		aux=a;
		while(a!=0) {
		num=(num*10)+a%10;
			a=a/10;
		}
		if(num==aux) {
			System.out.print("� palindromo");
		}else {
			System.out.print("n�o � palindromo");
		}
	}
}

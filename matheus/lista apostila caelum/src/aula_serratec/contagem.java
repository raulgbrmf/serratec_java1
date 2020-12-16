package aula_serratec;

public class contagem {

	public void conta(int a, int b) {

		while (a <= b) {
			System.out.println(a);
			a++;
		}
	}

	public void somaAte(int a, int b) {
		int soma = 0;
		while (a <= b) {
			soma = a + b;
			a++;
		}
		System.out.println(soma);
	}

	public void multiplo3(int a, int b) {
		while (a <= b) {
			if (a % 3 == 0) {
				System.out.println(a);

			}
			a++;
		}
	}

	public void fatorialRetorno(int a) {
		for (int i = 0; i <= a; i++) {
			if (a == 0) {
				System.out.println("O fatorial de 0 é " + 1);
			} else {
				System.out.println("o fatorial de " + i + " é " + fatorial(i));
			}
		}

	}

	public int fatorial(int a) {
		if(a==0){
			return 1;
		}else {
			return a*fatorial(a-1);
		}
	}

	public void fibonacci(int a) {
		int num1=0,num2=1,i,soma;
		System.out.print(num1+", ");
		System.out.print(num2+", ");
		for(i=0;i<=a;i++) {
			soma=num1+num2;
			System.out.print(soma+", ");
			num1=num2;
			num2++;
		}
	}
	
	public void questao7(int x) {
		
		while(x!=1) {
		if(x%2==0) {
			x=x/2;
			System.out.print(x+",");
		}else {
			x=3*x+1;
			System.out.print(x+",");
		}
		
	}
		}

	public void enquantoEncadeado(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j*i+" ");
			}
			System.out.println();
		}
	}
}
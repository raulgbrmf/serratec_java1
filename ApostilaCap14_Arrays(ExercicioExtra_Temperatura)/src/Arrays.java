
public class Arrays {

	public static void main(String[] args) {
		
		/*double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		...*/
		
		
		double[] temperaturas = new double [365];	//boa pratica colocar os colchetes logo após declarar o tipo do array
		temperaturas [0] = 31.3;	//valor inicial do indice sempre sera 0
		temperaturas [1] = 32;
		temperaturas [2] = 33.7;
		temperaturas [3] = 34;
		temperaturas [4] = 33.1;
	
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
		
		//para saber o tamanho do array usando length

		System.out.println("O tamanho do array: " + temperaturas.length);
		
		/*imprimir os valores do array
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas);	//não roda!
		*/
		
		//o PADRÃO:	*prefiro esse*
		/*
		for(int i = 0 ; i < temperaturas.length ; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[0]);
		}
		*/
		
		//um for "melhorado"
		for(double temp: temperaturas) {
			System.out.println(temp);
		}
	}

}

package experimento_aula;

public class Main {
	public static void main (String[]args) {
		Conta minhaconta = new Conta();
		Data data = new Data(); //Exercício 6 página 57
		
		minhaconta.titular = "Fabiene Avilla";
		minhaconta.dataAbertura = data; //Exercício 6 página 57
		data.dia=20;
		data.mes=7;
		data.ano=2020;
		minhaconta.agencia = "3533";
		minhaconta.numero = 20;
		minhaconta.saldo = 100.00;
		
		Conta outraconta = new Conta();
		outraconta.titular = "Hugo";
		outraconta.dataAbertura = data; //Exercício 6 página 57
		data.dia=20;
		data.mes=7;
		data.ano=2020;
		outraconta.agencia = "3533";
		outraconta.numero = 20;
		outraconta.saldo = 100.00;
		
		
		/*Exercício 4 página 57
		 * Saída: Diferentes. Apesar de igualarmos os atributos os endereços que as classes
		 * ocupam são diferentes.
		 
		if	(minhaconta	==outraconta)	{
			System.out.println("iguais");
		}else{
			System.out.println("diferentes");								
		}*/
		
		/*Exercício 5 página 57
		 * Saída: Iguais. Ao atribuir o minhaconta=outraconta, dizemos que o endereço de
		 * minha conta passou a ser o endereço de outraconta.
		minhaconta=outraconta; 
		if	(minhaconta	==outraconta)	{
			System.out.println("iguais");
		}else{
			System.out.println("diferentes");								
		}*/

		 
		/*Saída Exercício 3 página 56 ou 
		 * Exercício 7 página 58 ou 
		 * Exercício 9 página 58 
		 * dependendo do que estiver fora dos 
		comentários*/
		System.out.println(minhaconta.recuperaDadosParaImpressao ());
		
		//Saídas Exercíco 2 página 55
		minhaconta.saca(75.50);
		
		minhaconta.deposita(200.00);
		
		System.out.println("Seu saldo com rendimento é de "+minhaconta.calculaRendimento());
		
		
		//Exercício apostila Raul
		minhaconta.transfere(outraconta, 25.50);
		
	}
}

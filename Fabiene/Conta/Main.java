package experimento_aula;

public class Main {
	public static void main (String[]args) {
		Conta minhaconta = new Conta();
		Data data = new Data(); //Exerc�cio 6 p�gina 57
		
		minhaconta.titular = "Fabiene Avilla";
		minhaconta.dataAbertura = data; //Exerc�cio 6 p�gina 57
		data.dia=20;
		data.mes=7;
		data.ano=2020;
		minhaconta.agencia = "3533";
		minhaconta.numero = 20;
		minhaconta.saldo = 100.00;
		
		Conta outraconta = new Conta();
		outraconta.titular = "Hugo";
		outraconta.dataAbertura = data; //Exerc�cio 6 p�gina 57
		data.dia=20;
		data.mes=7;
		data.ano=2020;
		outraconta.agencia = "3533";
		outraconta.numero = 20;
		outraconta.saldo = 100.00;
		
		
		/*Exerc�cio 4 p�gina 57
		 * Sa�da: Diferentes. Apesar de igualarmos os atributos os endere�os que as classes
		 * ocupam s�o diferentes.
		 
		if	(minhaconta	==outraconta)	{
			System.out.println("iguais");
		}else{
			System.out.println("diferentes");								
		}*/
		
		/*Exerc�cio 5 p�gina 57
		 * Sa�da: Iguais. Ao atribuir o minhaconta=outraconta, dizemos que o endere�o de
		 * minha conta passou a ser o endere�o de outraconta.
		minhaconta=outraconta; 
		if	(minhaconta	==outraconta)	{
			System.out.println("iguais");
		}else{
			System.out.println("diferentes");								
		}*/

		 
		/*Sa�da Exerc�cio 3 p�gina 56 ou 
		 * Exerc�cio 7 p�gina 58 ou 
		 * Exerc�cio 9 p�gina 58 
		 * dependendo do que estiver fora dos 
		coment�rios*/
		System.out.println(minhaconta.recuperaDadosParaImpressao ());
		
		//Sa�das Exerc�co 2 p�gina 55
		minhaconta.saca(75.50);
		
		minhaconta.deposita(200.00);
		
		System.out.println("Seu saldo com rendimento � de "+minhaconta.calculaRendimento());
		
		
		//Exerc�cio apostila Raul
		minhaconta.transfere(outraconta, 25.50);
		
	}
}

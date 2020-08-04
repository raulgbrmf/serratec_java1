package Banco;

public class Programa {

		public	static	void	main(String[]	args) {
			Conta	c1	=	new	Conta();
			c1.titular	=	"Hugo";
			c1.numero	=	123;
			c1.agencia	=	"45678-9";
			c1.saldo	=	50.0;
			Data data1 = new Data();
			data1.dia = 05;
			data1.mes = 06;
			data1.ano = 2015;
			c1.dataAbertura = data1;
			
			/*System.out.println(c1.titular);
			System.out.println(c1.numero);
			System.out.println(c1.agencia);
			System.out.println("valor atual da conta : "+c1.saldo); 
			System.out.println(c1.dataAbertura);
			
			c1.saca(10);
			System.out.println("Valor depois do saque : "+c1.saldo);
			
			c1.deposita(30);
			System.out.println("Valor depois do deposito : "+c1.saldo);
			
			c1.calculaRendimento();
			System.out.println("Rendimento Mensal : "+c1.calculaRendimento()); ---- Exercicios cap.4 num 1 e 2*/
			
			//System.out.println(c1.recuperaDadosParaImpressao());-------Exercicios cap.4 num 3
			
			/*Conta	c1	=	new	Conta();								
			c1.titular	=	"Danilo";
			c1.saldo	=	100;
			Conta	c2	=	new	Conta();								
			c2.titular	=	"Danilo";
			c2.saldo	=	100;
			if	(c1	==	c2)	{
							System.out.println("iguais");
			}	else	{
							System.out.println("diferentes");			-------Exercicios cap.4 num 4 e 5					
			}*/

			System.out.println(c1.recuperaDadosParaImpressao());//-------Exercicios cap.4 num 3

		}
}


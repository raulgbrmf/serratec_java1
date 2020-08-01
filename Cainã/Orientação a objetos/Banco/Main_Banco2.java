
public class Main_Banco2 
{
	public static void main(String[] args) 
	{
		Data2 data1 = new Data2();
		data1.dia = 25;
		data1.mes = 04;
		data1.ano = 2015;
		
		Conta c1 = new Conta();
		//Conta c2 = new Conta(); <-------- declaração da conta 2
		
		//Dados da 1ª conta
		/*c1.setTitular("Hugo");
		String nomeTitular = c1.getTitular();
		c1.setNumeroConta(123);
		c1.setAgencia("45678-9");
		c1.setSaldo(50);
		double saldo = c1.getSaldo();
		c1.setDataAbertura(data1);*/
		
		//c1 = c2; <------------- igualando c1 com c2

		//Dados da 2ª conta
		/*c2.titular = "Hugo";
		c2.numeroConta = 123;
		c2.agencia = "45678-9";
		c2.saldo = 50;
		c2.dataAbertura = "25/04/2015";
		
		if(c1 == c2) <----------------------- if da questão 4
		{
			System.out.print("Iguais");
		}
		else
		{
			System.out.print("Diferentes");
		}*/
		
		//System.out.println(c1.recuperaDadosParaImpressao());
		
		c1.deposita(100);
		c1.saca(75);
		
		//System.out.println("\n" + c1.recuperaDadosParaImpressao());
	}
}

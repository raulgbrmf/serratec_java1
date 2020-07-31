public class Main {
	public static void main (String[]args) {
		
		Conta minhaconta = new Conta();
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		
		
		
		minhaconta.titular = "Rafael";
		minhaconta.numero = 123;
		minhaconta.agencia = "45612-3";
		minhaconta.saldo = 1000.50;
		
		
		//Testanto função Saca
		System.out.println("Meu saldo antes do saque é: " + minhaconta.saldo);
		minhaconta.saca(100);
		System.out.println("Meu saldo depois do saque é: " + minhaconta.saldo);
		
		
		//Testando função Deposito
		System.out.println("Meu saldo antes do depósito é: " + minhaconta.saldo);
		minhaconta.deposita(200);
		System.out.println("Meu saldo depois do depósito é: " + minhaconta.saldo);
		
		//Testando o Rendimento Mensal
		minhaconta.calculaRendimento(0);
		System.out.println("Meu rendimento no mês atual é: " + minhaconta.saldo);
		
		
		//Exercicio 4 Comparando - Resultado: São diferentes pq apesar dos valores serem iguais os Id são diferentes.
		c1.titular = "Danilo";
		c1.saldo = 100;
		
		c2.titular = "Danilo";
		c2.saldo = 100;
		
		if(c1==c2) {
			System.out.println("Iguais");
		}
		else {
			System.out.println("Diferentes");
		}
		
		//Exerciocio 5 - As contas agora são iguais pois as contas foram igualizadas.
		
		c2 = c1;
		if(c1==c2) {
			System.out.println("Iguais");
		}
		else {
			System.out.println("Diferentes");
		}
		
		//Exercicio 6 - Criar classe data 
		
		Data data = new Data();
		data.dia= 03;
		data.mes = 11;
		data.ano = 1989;
		minhaconta.dataAbertura = data;
		System.out.println("Data de abertura " + minhaconta.dataAbertura);
		System.out.println(minhaconta.recuperaDadosParaImpressao());
		
		
	}
}



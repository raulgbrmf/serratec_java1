package exerciocio_encapsulamento;
public class Main {
	public static void main (String[]args) {
		
		Conta minhaconta = new Conta();
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		Conta outraconta = new Conta("rafael"); //Exercicio 4
		
		String nome = minhaconta.getTitular();
		minhaconta.setTitular(nome);
	
		int numero = minhaconta.getNumero();
		minhaconta.setNumero(numero); // ou o valor dentro do paranteses
		
		String agencia = minhaconta.getAgencia();
		minhaconta.setAgencia(agencia); // nome da agencia dentro do parenteses
		
		double saldo = minhaconta.getSaldo();
		
		
		//Testanto função Saca
		System.out.println("Meu saldo antes do saque é: " + minhaconta.getSaldo());
		minhaconta.saca(100);
		System.out.println("Meu saldo depois do saque é: " + minhaconta.getSaldo());
		
		
		//Testando função Deposito
		System.out.println("Meu saldo antes do depósito é: " + minhaconta.getSaldo());
		minhaconta.deposita(200);
		System.out.println("Meu saldo depois do depósito é: " + minhaconta.getSaldo());
		
		//Testando o Rendimento Mensal
		minhaconta.calcularRendimento(0);
		System.out.println("Meu rendimento no mês atual é: " + minhaconta.getSaldo());
		
		
		//Exercicio 4 Comparando - Resultado: São diferentes pq apesar dos valores serem iguais os Id são diferentes.
		c1.setTitular("Danilo");
		c1.getSaldo();
		
		c2.setTitular ("Danilo");
		c2.getSaldo();
		
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
		
		
		System.out.println("numero do identificador " + minhaconta.identificador);
		System.out.println("Codigo do identificador da minhaconta é: " + minhaconta.codIdentificador);
		System.out.println("numero do identificador c1 " + c1.identificador);
		System.out.println("Codigo do identificador da conta é: " + c1.codIdentificador);
	}
}



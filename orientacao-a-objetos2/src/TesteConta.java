/*Exercício extra - Refatorando o código anterior com os conhecimentos que já 
 * possuo em java */

public class TesteConta {

	public static void main(String[] args) {

		double valorDeposito = 150.0;
		double valorSaque = 450.0;

		Data data = new Data();
		data.dia = 11;
		data.mes = 10;
		data.ano = 2019;

		Conta conta1 = new Conta(1000.0);
		conta1.setTitular("Renato Viana");
		conta1.setNumero(123);
		conta1.setAgencia("56789-7");
		conta1.setDataDeAbertura(data);

		Conta conta2 = new Conta(1250.0);
		conta2.setTitular("Ana Guimarães");
		conta2.setNumero(578);
		conta2.setAgencia("54763-2");
		conta2.setDataDeAbertura(data);

		System.out.println(conta1.toString());
		System.out.println(conta2.toString());

		System.out.println("\nDeposito no valor de : " + valorDeposito);
		conta1.deposita(valorDeposito);
		System.out.println(conta1.toString());

		System.out.println("\nSaque no valor de : " + valorSaque);
		conta2.saca(valorSaque);
		System.out.println(conta2.toString());

		System.out.println("\n-----Transferência entre contas-----\n");
		conta1.transfere(conta2, 150);

		conta2.transfere(conta1, 1000);

	}

}

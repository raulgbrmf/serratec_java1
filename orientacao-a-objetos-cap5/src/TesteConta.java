/* Exercício Capítulo 5 apostila Caelum 1 - 6 */

public class TesteConta {

	public static void main(String[] args) {

		double valorDeposito = 150.0;
		double valorSaque = 450.0;

		Data data = new Data();
		data.validaData(29, 2, 2020);

//		Data inválida o ano 2021 não é bissexto
//		data.validaData(29, 2, 2021); 

//		Data inválida dia 32
//		data.validaData(32, 7, 2021); 

		Conta conta1 = new Conta("Renato Viana", 1000.0);
		conta1.setNumero(123);
		conta1.setAgencia("56789-7");
		conta1.setDataDeAbertura(data);

		Conta conta2 = new Conta("Ana Guimarães", 1250.0);
		conta2.setNumero(578);
		conta2.setAgencia("54763-2");
		conta2.setDataDeAbertura(data);

		Conta conta3 = new Conta();
		conta3.setTitular("Felipe Aguiar");
		conta3.setNumero(532);
		conta3.setAgencia("24963-5");
		conta3.setDataDeAbertura(data);

		System.out.println(conta1.toString());
		System.out.println(conta2.toString());
		System.out.println(conta3.toString());

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

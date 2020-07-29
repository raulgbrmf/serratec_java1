/*EXERCÍCIOS: ORIENTAÇÃO A OBJETOS. Seguindo os enunciados 1 - 9 */

public class TesteConta {

	public static void main(String[] args) {

		Data data = new Data();
		data.dia = 29;
		data.mes = 7;
		data.ano = 2020;

		Conta conta = new Conta();
		conta.titular = "Renato Viana";
		conta.numero = 123;
		conta.agencia = "56789-7";
		conta.saldo = 1000.0;
		conta.dataDeAbertura = data;
		
		Conta conta2 = new Conta();
		conta2.titular = "Ana Guimarães";
		conta2.numero = 578;
		conta2.agencia = "54763-2";
		conta2.saldo = 1250.0;
		conta2.dataDeAbertura = data;

		Conta conta3 = new Conta();
		conta3.titular = "Ana Guimarães";
		conta3.numero = 578;
		conta3.agencia = "54763-2";
		conta3.saldo = 1250.0;
		conta3.dataDeAbertura = data;

//		System.out.println("Dados da conta: " + "\nTitular: " + conta.titular
//				+ "\nNúmero: " + conta.numero + "\nAgencia: " + conta.agencia
//				+ "\nSaldo: " + conta.saldo + "\nData de Abertura: "
//				+ conta.dataDeAbertura);

		System.out.println(conta.recuperaDadosParaImpressao());

		conta.deposita(150.0);
		System.out.println("\nSaldo atual: " + conta.saldo);
		System.out.println("Rendimento mensal: " + conta.calculaRendimento());

		conta.saca(200.0);
		System.out.println("\nSaldo atual: " + conta.saldo);
		System.out.println("Rendimento mensal: " + conta.calculaRendimento());
		
		//Compara se duas referências se referem ao mesmo objeto
		System.out.println("");
		if (conta == conta2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

		System.out.println("");
		if (conta2 == conta3) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

		conta = conta2;
		System.out.println("");
		if (conta == conta2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

	}

}

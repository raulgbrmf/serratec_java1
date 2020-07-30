import java.util.Scanner;

public class Conta_Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Conta minhaconta = new Conta();
		Conta outraconta = new Conta();
		Conta contaescolhida = new Conta();
		double saque, deposito;

		minhaconta.titular = "Gabriel";
		minhaconta.numero = 15;
		minhaconta.saldo = 27000;
		minhaconta.data_abertura = "18/09/2019";
		minhaconta.agencia = "123-39";

		outraconta.titular = "Robert";
		outraconta.numero = 83;
		outraconta.saldo = 5500;
		outraconta.data_abertura = "30/03/2019";
		outraconta.agencia = "321-93";

		System.out.println("Digite seu número: [15 / 83] ");
		int id = scan.nextInt();
		
		for(int i = 0; i < 100;i ++) {    // Limpa tela 
			System.out.println();
		}

		if (id == 15) {
			contaescolhida = minhaconta;
		}
		if (id == 83) {
			contaescolhida = outraconta;
		}
		if (id != 15 & id != 83) {
			System.out.println("Número Incorreto.");
			System.exit(0);
		}


		System.out.println(contaescolhida.impressao());
		System.out.println();

		System.out.println("Qual operação você deseja fazer? [Saque / Deposito / Rendimento] ");
		String operacao = scan.next();

		switch (operacao) {
		case "Saque":
			System.out.println("Qual o valor do saque? ");
			saque = scan.nextInt();

			contaescolhida.saca(saque);

			System.out.println("O seu saldo após o saque é de: R$" + contaescolhida.saldo);
			break;

		case "Deposito":
			System.out.println("Qual o valor do deposito? ");
			deposito = scan.nextInt();

			contaescolhida.deposita(deposito);

			System.out.println("O seu saldo após o deposito é de: R$" + contaescolhida.saldo);
			break;

		case "Rendimento":
			contaescolhida.rendimento();
			System.out.println("O seu rendimento mensal é de: R$" + contaescolhida.saldo);

		}
		scan.close();
	}

}

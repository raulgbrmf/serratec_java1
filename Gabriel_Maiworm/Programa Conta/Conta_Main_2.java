import java.util.Scanner;

public class Conta_Main_2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Conta_2 minhaconta = new Conta_2();
		Conta_2 outraconta = new Conta_2();
		Conta_2 contaescolhida = new Conta_2();

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

		for (int i = 0; i < 100; i++) { // Limpa tela
			System.out.println();
		}

		if (id == 15) {
			contaescolhida = minhaconta;
		} else if (id == 83) {
			contaescolhida = outraconta;
		} else {
			System.out.println("Número Incorreto.");
			System.exit(0);
		}

		System.out.println(contaescolhida.impressao());
		System.out.println();

		System.out.println("Qual operação você deseja fazer? [Saque / Deposito / Rendimento] ");
		String operacao = scan.next();
		
		contaescolhida.escolha(operacao, contaescolhida);

		scan.close();
	}

}
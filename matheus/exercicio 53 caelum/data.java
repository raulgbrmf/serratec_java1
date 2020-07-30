import java.util.Scanner;

public class data {
	int dia;
	int mes;
	int ano;
	Scanner read = new Scanner(System.in);

	public data() {
//questão 6
		while (dia == 31 & mes == 2 & ano == 2012) {
			System.out.print("escolha outro dia: ");
			dia = read.nextInt();

			System.out.print("escolha outro mes: ");
			mes = read.nextInt();

			System.out.print("escolha outro ano: ");
			ano = read.nextInt();
		}

	}

	public String formatada() {
		return dia + "/" + mes + "/" + ano;
	}
}

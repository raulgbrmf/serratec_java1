package Aniversario;

public class Pessoa {

	String nome;
	String sobreNome;
	int dia = 10;
	int mes = 9;
	final int anoAtual = 2020;
	int anoNascimento;
	int informaDia;
	int informaMes;
	int informeAno;

	boolean verificaDataValida() {
		if (this.informaDia < 1 || this.informaDia > 31) {
			System.out.println("Dia informado inválido, informe um dia entre 1 e 31");
			return false;
		} else if (this.informaMes < 1 || this.informaMes > 12) {
			System.out.println("O mês informado é inválido, informe um mês entre 1 e 12");
			return false;
		} else if (this.informaMes == 4 && this.informaDia > 30 || this.informaMes == 6 && this.informaDia > 30
				|| this.informaMes == 9 && this.informaDia > 30 || this.informaMes == 11 && this.informaDia > 30) {
			System.out.println("O mês " + this.informaMes + " pode ter no máximo 30 dias !");
			return false;
		} else if (this.informeAno % 4 == 0 || this.informeAno % 4 == 0 && this.informeAno % 100 != 0
				&& this.informaMes == 2 && this.informaDia > 29) {
			System.out.println("Atenção ano Bissexto !!\n" + "O dia informado é inválido, o mês " + this.informaMes
					+ " no ano de " + this.informeAno + " teve 29 dias");
			return false;
		} else if (this.informeAno % 4 == 1 || this.informeAno % 4 == 1 && this.informeAno % 100 == 0
				&& this.informaMes == 2 && this.informaDia > 28) {
			System.out.println("O dia informado é inválido, o mês " + this.informaMes + " no ano de " + this.informeAno
					+ " teve 28 dias");
			return false;
		} else if (this.informeAno < this.anoNascimento || this.informeAno > this.anoAtual) {
			System.out.println(
					"O ano informado é inválido, informe um ano entre " + this.anoNascimento + " e " + this.anoAtual);
			return false;
		} else {
			return true;
		}
	}

	void verificaAniversario() {
		if (verificaDataValida() == true) {
			if (this.dia == this.informaDia && this.mes == this.informaMes) {
				System.out.println(this.nome + " " + this.sobreNome + " Feliz Aniversário !!!");
				System.out.println(
						"Em " + this.informeAno + " você fez " + (this.informeAno - this.anoNascimento) + " ano(s).");
			} else {
				System.out.println("Não foi seu aniversário :(");
			}
		}
	}
}

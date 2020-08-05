package br.com.caelum.contas.util;

public class Data {

	private int dia, mes, ano;

	Data(int dia, int mes, int ano) {

		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia >= 1 && dia <= 31) {
			
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia >= 1 && dia <= 30) {
			
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}else if (mes == 2 && this.verificaAno(ano) == 1 && dia >= 1 && dia <= 28) {
			
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}else if (mes == 2 && this.verificaAno(ano) == 0 && dia >= 1 && dia <= 29) {
			
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}else {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
			this.getData();
			System.out.println("Data invalida");
			this.dia = 0;
			this.mes = 0;
			this.ano = 0;
		}
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public void getData() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
	}

	private int verificaAno(int ano) {
		int resto = ano % 4;
		if (resto == 0) {
			return 0;
		} else {
			return 1;
		}
	}
}

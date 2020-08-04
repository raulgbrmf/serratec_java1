package br.com.caelum.util;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	public String imprimeData() {
		return dia + "/" + mes + "/" + ano;
	}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data() {

	}

	public boolean dataValida() {
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (dia > 30) {
				return false;
			}
		}

		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia > 31) {
				return false;
			}
		}

		if (mes == 2) {
			if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
				if (dia > 29) {
					return false;
				} 
			}	
			else {
				if (dia > 28) {
					return false;
				}
			}
		}	
		return true;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia <= 31 && dia > 0) {
			this.dia = dia;
		}

	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes <= 12 && mes > 0) {
			this.mes = mes;
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}

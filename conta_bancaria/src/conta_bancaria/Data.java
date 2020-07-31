package conta_bancaria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	Data(int dia, int mes, int ano) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);

	}

	String imprimeData() {
		return dia + "/" + mes + "/" + ano; // -> QUESTÃO 9
	}

	public boolean isValid() {

		if (!mesValido() || !checaDiasMesCom30() || !checaDiasMesCom31()) {
			return false;

		}

		if (anoBissexto()) {
			if (!checaFevereiroBissexto()) {
				return false;
			}

		} else if (!checaFevereiro()) {
			return false;
		}
		
		return true;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {

		this.dia = dia;

	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {

		this.mes = mes;

	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean anoBissexto() {
		return ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0;

	}

	public boolean mesValido() {
		List<Integer> meses = new ArrayList<Integer>();
		meses.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));

		if (!meses.contains(mes)) {
			return false;
		}
		return true;
	}

	public boolean checaDiasMesCom30() {
		List<Integer> mesesCom30Dias = new ArrayList<Integer>(Arrays.asList(4, 6, 9, 11));

		if (mesesCom30Dias.contains(mes)) {
			if (dia > 30) {
				return false;
			}
		}
		return true;
	}

	public boolean checaDiasMesCom31() {
		List<Integer> mesesCom31Dias = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 7, 8, 10, 12));

		if (mesesCom31Dias.contains(mes)) {
			if (dia > 31) {
				return false;
			}
		}
		return true;
	}

	public boolean checaFevereiroBissexto() {
		if (mes == 2 && dia > 29) {
			return false;
		}
		return true;
	}
	public boolean checaFevereiro() {
		if (mes == 2 && dia > 28) {
			return false;
		}
		return true;
	}

}
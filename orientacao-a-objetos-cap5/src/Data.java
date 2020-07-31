
public class Data {
	private int dia;
	private int mes;
	private int ano;

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public void validaData(int dia, int mes, int ano) {
		if ((mes == 02 && dia >= 1 && dia <= 29)
				&& ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else if (mes == 02 && dia >= 1 && dia <= 28) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8
				|| mes == 10 || mes == 12) && dia >= 1 && dia <= 31) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1
				&& dia <= 30) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else {
			throw new Error("Data inválida!");
		}
	}

	@Override
	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

}

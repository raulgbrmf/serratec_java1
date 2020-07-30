package conta_bancaria;

public class Data {

	int dia;
	int mes;
	int ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String imprimeData() {
		return dia + "/" + mes + "/" + ano; // -> QUESTÃO 9
	}

}
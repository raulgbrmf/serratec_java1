package br.com.caelum.contas.data;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(int dia, int mes, int ano){
	
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		
	public String dataFormatada() {
		String dataFormatada = (dia + " / " + mes + " / "+ ano);
		return dataFormatada;
		
	}
}

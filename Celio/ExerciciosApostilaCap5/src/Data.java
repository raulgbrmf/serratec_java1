
public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(int dia, int mes, int ano){
	
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		
	String dataFormatada() {
		String dataFormatada = (dia + " / " + mes + " / "+ ano);
		return dataFormatada;
		
	}
}

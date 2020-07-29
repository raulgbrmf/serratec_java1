
public class Data {
	int dia;
	int mes;
	int ano;
	
	String formatada() {
		String dataFormatada = this.dia + "/" + this.mes + "/" + this.ano;
		return dataFormatada;
	}
	
}

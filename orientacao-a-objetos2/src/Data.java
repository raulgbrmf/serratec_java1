
public class Data {
	int dia;
	int mes;
	int ano;

	public String formatada() {
		String dataFormatada = this.dia + "/" + this.mes + "/" + this.ano;
		return dataFormatada;
	}
}

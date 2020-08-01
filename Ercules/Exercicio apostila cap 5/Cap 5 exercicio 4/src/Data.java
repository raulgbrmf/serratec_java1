
public class Data {

	private String dia, mes, ano;

	Data() {
	}

	Data(String dia, String mes, String ano) {

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String getDia() {
		return dia;
	}

	public String getMes() {
		return mes;
	}

	public String getAno() {
		return ano;
	}

	public String getData() {

		String data = this.dia;
		data += "/" + this.mes;
		data += "/" + this.ano;
		return data;
	}
}

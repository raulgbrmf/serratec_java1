
public class Data {

	private int dia, mes, ano;
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String formataData() {
		String data = "Data de abertura: " + this.dia;
		data += "/" + this.mes;
		data += "/" + this.ano;
		return data;
	}
}

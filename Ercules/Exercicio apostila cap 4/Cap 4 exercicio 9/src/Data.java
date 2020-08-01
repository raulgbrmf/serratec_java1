
public class Data {

	String dia, mes, ano;
	
	String formataData() {
		String data = this.dia;
		data += "/" + this.mes;
		data += "/" + this.ano;
		return data;
	}
}

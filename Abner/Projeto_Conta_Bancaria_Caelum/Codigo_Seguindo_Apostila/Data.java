public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		if(validaData(dia, mes, ano)) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		else {
			System.out.println("Data invalida.");
		}		
	}
	
	private boolean validaData(int dia, int mes, int ano) {
		if(mes <= 12 && mes >= 1) {	
		
			if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia <= 30 && dia > 0)){
				return true;
			}
			else if((mes != 2) && (dia<= 31 && dia > 0)) {
				return true;
			}
			else {
				if((Bissexto(ano) == true) && (dia >= 1 && dia <= 29)) {
					return true;
				}
				else if((Bissexto(ano) == false) && (dia >=1 && dia <= 28)) {
					return true;
				}
			}			
		}
		return false;
	}
	
	private boolean Bissexto(int ano) {
		return ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0));
	}
	
	String getRetornarData() {		
		String formatada = this.dia + "/" + this.mes + "/" + this.ano;
		return formatada;		
	}	
}
	

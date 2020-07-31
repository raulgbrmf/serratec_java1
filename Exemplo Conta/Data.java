package encapsulamento;

public class Data {
		
		int dia,mes,ano;
		
		public Data (int dia, int mes, int ano) {
				
			if ((dia==30 || dia==31) && mes==2) {
				System.out.println("Dia inválido para fevereiro.");
			}
			else {
				this.dia=dia;
				this.mes=mes;
				this.ano=ano;
			}
		}
		
		String formatada() {
			
			return dia+"/"+mes+"/"+ano;
		}
}

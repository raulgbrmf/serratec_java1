package br.com.caelum.contas.modelo;

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
		
		public String formatada() {
			
			return dia+"/"+mes+"/"+ano;
		}
}

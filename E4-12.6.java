package novo_projeto;

public class Aa_Bb {

	public static void main(String[] args) {
		
		
		Conta c1 = new Conta();
		
		Data diaDeHoje = new Data();
		diaDeHoje.dia = 30;
		diaDeHoje.mes = 7;
		diaDeHoje.ano = 2020;
		
		
		c1.titular = "Hugo";
		c1.numero = 123;
		c1.dataDeAbertura =diaDeHoje;
		
		System.out.println("Data de abertura da conta: " + c1.dataDeAbertura);
		
		
		
		
		
		

	}

}




//public class Data 
	
	//int dia;
	//int mes;
	//int ano;


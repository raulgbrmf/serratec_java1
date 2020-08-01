public class Data
{
	private int dia, mes, ano;
	
	public Data(int dia, int mes, int ano)
	{
		if(validaData(dia, mes, ano) == true)
		{
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		else
		{
			System.out.println("Data inválida");
		}
	}
	
	public boolean verificaBissexto(int ano)
	{
		if((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean verificaFevereiro(int mes, int dia)
	{
		if((mes == 2 && this.verificaBissexto(ano) == true) && (dia <= 29 && dia >= 1))
		{
			return true;
		}
		else if((mes == 2 && verificaBissexto(ano) == false) && (dia <= 28 && dia >= 1))
		{
			return true;
		}
			return false;
	}
		
	public boolean verificaOutrosMeses(int mes, int dia)
	{
		if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia <= 31 && dia >= 1))
		{
			return true;
		}
		else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia <= 30 && dia >= 1))
		{
			return true;
		}
			return false;
	}
	
	public boolean validaData(int dia, int mes, int ano)
	{
		if((verificaFevereiro(mes, dia) == true) || (verificaOutrosMeses(mes, dia) == true))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String retornaData()
	{
			return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
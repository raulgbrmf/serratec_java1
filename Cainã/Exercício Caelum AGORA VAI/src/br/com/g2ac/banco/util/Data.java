package br.com.g2ac.banco.util;

public class Data 
{
	private int dia;
	private int mes;
	private int ano;
	
	public Data (int dia, int mes, int ano)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	private boolean verificaBissexto(int ano)
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
	
	private boolean verificaFevereiro(int dia, int mes)
	{
		if((mes == 2 && this.verificaBissexto(2) == true) && (dia <= 29 && dia >= 1))
		{
			return true;
		}
		else if((mes == 2 && this.verificaBissexto(2) == false) && (dia <= 28 && dia >= 1))
		{
			return true;
		}
			return false;
	}
	
	private boolean verificaOutrosMeses(int dia, int mes)
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
	
	private boolean validaData()
	{
		if((this.verificaFevereiro(dia, mes) == true) || (this.verificaOutrosMeses(dia, mes) == true))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String imprimeData()
	{
		if(this.validaData() == true)
		{
			return this.dia + "/" + this.mes + "/" + this.ano;
		}
		else
		{
			return "Data inválida!";
		}
	}
}

package br.com.g2ac.util;

public class Data {
	private int dia; 
	private int mes; 
	private int ano; 
	
	public Data(int dia, int mes, int ano){
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}

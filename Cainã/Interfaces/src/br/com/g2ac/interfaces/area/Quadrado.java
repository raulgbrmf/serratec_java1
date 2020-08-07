package br.com.g2ac.interfaces.area;

public class Quadrado implements AreaCalculavel
{
	private double lado;
	
	public Quadrado(double lado)
	{
		this.lado = lado;
	}
	
	public double calculaArea()
	{
		double res = this.lado * this.lado;
		return res;
	}
}

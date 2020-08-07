package br.com.g2ac.interfaces.area;

public class Retangulo implements AreaCalculavel
{
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura)
	{
		this.base = base;
		this.altura = altura;
	}
	
	public double calculaArea()
	{
		double res = this.base * this.altura;
		return res;
	}
}

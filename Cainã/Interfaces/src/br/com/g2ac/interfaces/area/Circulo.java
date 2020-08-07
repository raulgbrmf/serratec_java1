package br.com.g2ac.interfaces.area;

public class Circulo implements AreaCalculavel
{
	private double raio;
	
	public Circulo(double raio)
	{
		this.raio = raio;
	}
	
	public double calculaArea()
	{
		double res = Math.PI * (this.raio * this.raio);
		return res;
	}
}

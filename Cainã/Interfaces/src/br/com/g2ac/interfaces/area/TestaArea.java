package br.com.g2ac.interfaces.area;

public class TestaArea 
{
	public static void main(String[] args) 
	{
		AreaCalculavel circ = new Circulo(4);
		
		System.out.println(circ.calculaArea());
	}
}

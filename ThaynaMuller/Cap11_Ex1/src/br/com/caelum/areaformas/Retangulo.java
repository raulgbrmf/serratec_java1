package br.com.caelum.areaformas;

public class Retangulo implements AreaCalculavel {
	
	private int altura;
	private int largura;
	
	public Retangulo(int altura, int largura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calculaArea() {
		return this.altura * this.largura;
	}

}

package EstudoInterface;

public class Retangulo extends Formas implements AreaCalculavel{
	
	private int largura;
	private int altura;
	
	Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calculaArea() {
		return this.largura * this.altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}

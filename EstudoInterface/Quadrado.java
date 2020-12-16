package EstudoInterface;

public class Quadrado extends Formas implements AreaCalculavel{
	
	private int lado;
	
	Quadrado(int lado) {
	this.lado = lado;
	}
		
	public double calculaArea() {
		return this.lado * this.lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
}

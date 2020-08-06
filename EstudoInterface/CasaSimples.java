package EstudoInterface;

public class CasaSimples extends Construcoes implements AreaCalculavel{
		
	CasaSimples(double lado) {
		super(lado);
	}
		
	public double calculaArea() {
		return this.lado * this.lado;
	}
		
}

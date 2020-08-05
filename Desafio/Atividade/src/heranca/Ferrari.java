package heranca;

public class Ferrari extends Carro{
	
	@Override //metodo ja existente na classe pai
	public void Acelerar() {
		
		velocidadeAtual += 10;
		
	}

}

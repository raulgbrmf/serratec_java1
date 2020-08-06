package heranca;

public class Ferrari extends Carro{
	
	Ferrari() { //CONSTRUTOR
		
		super(350);
		
	}
	
	Ferrari(int velocidadeMaxima) {
		
		super(velocidadeMaxima);
		x = 15; //PARA TESTAR A VELOCIDADE MAXIMA DA FERRARI BASTA COLOCAR O X = 200
	}

	/*@Override //metodo ja existente na classe pai
	public void Acelerar() {
		
		velocidadeAtual += 15;
		
	}*/

}

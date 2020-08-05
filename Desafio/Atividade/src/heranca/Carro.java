package heranca;

public class Carro {
	
	int velocidadeAtual;
	
	public void  Acelerar() {
		
		velocidadeAtual = velocidadeAtual + 5; // ou velocidadeAtual += 10
			
		}
	
	public void frear() {
		
		if(velocidadeAtual >= 5) {
			
			velocidadeAtual = velocidadeAtual - 5; // ou velocidadeAtual -= 10
		} else {
			
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		
		return "Velocidade atual é: " + velocidadeAtual + " KM/H";
	}

}

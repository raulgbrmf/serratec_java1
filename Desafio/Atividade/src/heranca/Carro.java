package heranca;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;  // FINAL E USADO PARA QUE O ATRIBUTO POSSA TER SEY VALOR ATRIBUIDO UMA UNICA VEZ
	protected int velocidadeAtual;
	protected int x = 5; //PARA TESTAR A VELOCIDADE MAXIMA BASTA COLOCA X = 200 PARA TESLA IR NO MAXIMO A 250
	
	Carro(int velocidadeMaxima) {
		
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	

	
	public void  Acelerar() {
		
		if(velocidadeAtual + x > VELOCIDADE_MAXIMA) {
			
			velocidadeAtual = VELOCIDADE_MAXIMA;
			
		} else {
			
			velocidadeAtual = velocidadeAtual + x; // ou velocidadeAtual += 10
		}
			
	}
	
	public void Frear() {
		
		if(velocidadeAtual >= 5) {
			
			velocidadeAtual = velocidadeAtual - 5; // ou velocidadeAtual -= 10
		} else {
			
			velocidadeAtual = 0;
		}
	}
	
	public String toString() { //Metodo que retorna String
		
		return "Velocidade atual é: " + velocidadeAtual + " KM/H";
	}

}

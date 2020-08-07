package polimorfismo;

public class Pessoa {

	private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
		
	}

	public void comer( Comida comida) { //NAO PRECISO FAZER 3 TIPOS DE COMER UM PARA CADA TIPO DE ALIMENTO BASTA EU USAR POLIMORFISMO E FAZER APENAS UM METODO USANDO "COMIDA" QUE E A CLASSE MAE DE TODOS OS ALIMENTOS
		this.peso += comida.getPeso(); // ASSIM MESMO QUE EU ADICIONE OUTROS ALIMENTOS, BASTA ELES SEREM CLASSES FILHAS DE "COMIDA"
		
	}
	
	public double getPeso() {
		
		return peso;
		
	}

	public void setPeso(double peso) {
		
		if(peso >=0) { //PARA SEMPRE SER POSITIVO
			
			this.peso = peso;

		}
	}
	
}

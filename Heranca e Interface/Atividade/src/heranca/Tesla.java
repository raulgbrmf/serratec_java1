package heranca;

public class Tesla extends Carro implements Ar{
	
	private boolean ligarAr = false;
	
	Tesla() { //CONSTRUTOR
		
		super(250); //Carro.Carro(int velocidadeMaxima)
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getAce() {
		if(ligarAr) {
			return 4;
		} else  {
			return 5;	
		}
	}

}

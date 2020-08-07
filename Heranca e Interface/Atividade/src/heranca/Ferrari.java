package heranca;

public class Ferrari extends Carro implements Esportivo, Ar{
	
	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	
	
	Ferrari() { //CONSTRUTOR
		
		super(350);
		
	}
	
	Ferrari(int velocidadeMaxima) {
		
		super(velocidadeMaxima);
		setAce(15);
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
		
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
		
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
		if (ligarTurbo && !ligarAr) {
			return 25;
		} else if (ligarTurbo && ligarAr) {
			return 20;
		} else	{
			return 15;
		}
		
		
	}


}



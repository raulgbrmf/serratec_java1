
public class MainCaneta {
	public static void main(String[] args) {
		Caneta c1 = new Caneta("BIC", "AZUL", 0.5f);
		Caneta c2 = new Caneta("FABER CASTEL", "PRETA", 0.7f);
		c1.status();
		c2.status();
		
		
		//System.out.println("Tenho uma caneta " + c1.getModelo() + " " + c1.getPonta() + "mm");
	}

}

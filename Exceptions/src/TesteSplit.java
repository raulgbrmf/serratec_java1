
public class TesteSplit {

	public static void main(String[] args) {
		
		String inverter = "Perdi o ônibus!";

		String[] arrayinverter = inverter.split(" ");

		String novaForma = " ";

		for(int i = arrayinverter.length - 1; i >= 0; i--){
		  novaForma += arrayinverter[i] + " ";
		}

		System.out.println(novaForma);
		
	}
}

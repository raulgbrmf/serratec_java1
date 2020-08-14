
public class TesteErro {

	public static void main(String[] args) {
		
		String inverter = "Socorram-me, subi no ônibus em Marrocos";

		String[] arrayinverter = inverter.split(" ");

		String novaForma = " ";

		for(int i = arrayinverter.length - 1; i >= 0; i--){
		  novaForma += arrayinverter[i] + " ";
		}

		System.out.println(novaForma);
		
	}
}

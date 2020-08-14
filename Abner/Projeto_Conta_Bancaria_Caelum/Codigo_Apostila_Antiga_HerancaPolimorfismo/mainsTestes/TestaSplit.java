package mainsTestes;

public class TestaSplit {

	public static void main(String[] args) {
		
		String frase = "Socorram-me, subi no ônibus em Marrocos";
		
		String invertido [] = frase.split(" ");
		
		for(int i = invertido.length; i > 0; i--) {
			System.out.print(invertido[i - 1] + " ");
		}
	}
}

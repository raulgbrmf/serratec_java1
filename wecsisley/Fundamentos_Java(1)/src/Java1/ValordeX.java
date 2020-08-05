package Java1;

import javax.swing.JOptionPane;

public class ValordeX {
	public static void main(String[] args) {

		String entrada;
		int x;

		entrada = JOptionPane.showInputDialog("Digite um valor inteiro: ");
		x = Integer.parseInt(entrada);

		while (x != 1) {

			if (x % 2 == 0) {
				System.out.println(x = x / 2);

			} else if (x % 2 == 1) {
				System.out.println(x = 3 * x + 1);
			} else {

			}
		}
	}
}

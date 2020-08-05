package Java1;

import javax.swing.JOptionPane;

public class MultiplosDe3 {
	public static void main(String[] args) {

		String entrada1;
		String entrada2;
		int valorFinal;
		int valorInicial;
		
		entrada1 = JOptionPane.showInputDialog("Digite o valor inicial: ");
		valorInicial = Integer.parseInt(entrada1);
		
		entrada2 = JOptionPane.showInputDialog("Digite o valor final: ");
		valorFinal = Integer.parseInt(entrada2);

		for (int i = valorInicial; i <= valorFinal; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			} else {
				
			}
		}
	}
}

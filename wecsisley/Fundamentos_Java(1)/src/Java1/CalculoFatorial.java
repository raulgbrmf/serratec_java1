package Java1;

import javax.swing.JOptionPane;

public class CalculoFatorial {
	public static void main(String[] args) {
		
		String entrada;
		int saida;
		
		entrada = JOptionPane.showInputDialog("Digite o valor a ser consultado: ");
		saida = Integer.parseInt(entrada);
		
		System.out.println("O fatorial de " + saida  +" é " + fatorial(saida));
	}
	static int fatorial(int numero) {
		int fact = 1;
		for(int i = 1; i <= numero; i++) {
			fact *= i;
		}
		return fact;
	}
}

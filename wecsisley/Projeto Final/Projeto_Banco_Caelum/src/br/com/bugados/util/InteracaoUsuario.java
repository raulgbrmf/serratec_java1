package br.com.bugados.util;

import javax.swing.JOptionPane;

public class InteracaoUsuario {

	public static String lerString(String menssagem) {
		return JOptionPane.showInputDialog(menssagem);
	}

	public static Integer lerInteiros(String menssagem) {
		try {
			String entrada = JOptionPane.showInputDialog(menssagem);
			return Integer.parseInt(entrada);
		} catch (NumberFormatException e) {
			System.out.println("Valor informado diferente do esperado(Inteiro)");
			e.printStackTrace();
			return null;
		}
	}

	public static String lerDoubles(String menssagem) {
		return JOptionPane.showInputDialog(menssagem);
	}
}

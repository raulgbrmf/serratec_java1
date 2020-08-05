package Aniversario;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		String entradaDia = "";
		String entradaMes = "";
		String entradaAno = "";
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Wecsisley";
		pessoa1.sobreNome = "Jesus";
		pessoa1.anoNascimento = 1995;
		
		entradaDia = JOptionPane.showInputDialog("Informe o dia (apenas números): ");
		pessoa1.informaDia = Integer.parseInt(entradaDia);
		
		entradaMes = JOptionPane.showInputDialog("Informe o mes (apenas números): ");
		pessoa1.informaMes = Integer.parseInt(entradaMes);	
		
		entradaAno = JOptionPane.showInputDialog("Informe o ano (apenas números): ");
		pessoa1.informeAno = Integer.parseInt(entradaAno);	
		
		pessoa1.verificaAniversario();
	}
}

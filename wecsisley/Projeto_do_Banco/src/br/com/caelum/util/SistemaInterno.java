package br.com.caelum.util;

import javax.swing.JOptionPane;

import br.com.caelum.pessoa.*;

public class SistemaInterno {
	
	public void login(Autenticavel pessoa) {
		
		String pegaSenha = JOptionPane.showInputDialog("Digite uma senha: ");
		int senhaDigitada = Integer.parseInt(pegaSenha);
		int senha = senhaDigitada; 
		boolean ok = pessoa.autentica(senha);
		
	}
}

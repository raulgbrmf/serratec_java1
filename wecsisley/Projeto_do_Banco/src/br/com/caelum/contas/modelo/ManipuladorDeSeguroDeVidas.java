package br.com.caelum.contas.modelo;

import javax.swing.JOptionPane;

import br.com.caelum.util.SeguroDeVida;

public class ManipuladorDeSeguroDeVidas extends SeguroDeVida{
	
	private SeguroDeVida seguroDeVida;
	
	public void criarSeguro() {
		
		this.seguroDeVida =	new	SeguroDeVida();
		
		String entradaTeclado1 = JOptionPane.showInputDialog("Digite o número da apólice: ");
		int saidaTeclado1 = Integer.parseInt(entradaTeclado1);
				
		this.seguroDeVida.setNumeroApolice(saidaTeclado1);
		
		String entradaTeclado2 = JOptionPane.showInputDialog("Digite o nome do títular: ");
		
		this.seguroDeVida.setTitular(entradaTeclado2);
		
		String entradaTeclado3 = JOptionPane.showInputDialog("Digite o valor: ");
		double saidaTeclado3 = Double.parseDouble(entradaTeclado3);
		
		this.seguroDeVida.setValor(saidaTeclado3);
	}
}

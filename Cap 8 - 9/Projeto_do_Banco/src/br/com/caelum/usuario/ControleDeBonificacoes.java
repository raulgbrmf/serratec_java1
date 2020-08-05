package br.com.caelum.usuario;

public class ControleDeBonificacoes {
	
	private double totaldeBonificacoes = 0;
	
	public void registra(Funcionario funcionario) {
		
		this.totaldeBonificacoes += funcionario.getBonificacao();
		
	}
	
	public double getTotalDeBonificacoes() {
		
		return this.totaldeBonificacoes;
	}
	

}

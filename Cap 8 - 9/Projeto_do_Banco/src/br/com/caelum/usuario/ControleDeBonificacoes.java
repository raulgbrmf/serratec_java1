package br.com.caelum.usuario;

public class ControleDeBonificacoes {
	
	private double totaldeBonificacoes = 0;
	
	public void registra(Funcionario funcionario) {
		
		System.out.println("Adicionando bonificacao do funcionario: " + funcionario); //CAP 10
		this.totaldeBonificacoes += funcionario.getBonificacao();
		
	}
	
	public double getTotalDeBonificacoes() {
		
		return this.totaldeBonificacoes;
	}
	

}

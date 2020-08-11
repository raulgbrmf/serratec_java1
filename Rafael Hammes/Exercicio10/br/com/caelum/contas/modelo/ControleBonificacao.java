package br.com.caelum.contas.modelo;

public class ControleBonificacao {
		private double totalDeBonificacoes = 0;
		
			public void registra(Funcionario f) {
				System.out.println("Adicionando bonificação do funcionario: " + f);
				this.totalDeBonificacoes += f.getBonificacao();
			}
			
			public double getTotalDeBonificacoes() {
				return this.totalDeBonificacoes;
				
			}
}

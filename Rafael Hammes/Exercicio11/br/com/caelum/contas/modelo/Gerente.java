package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario{
		public double getBonificacao() {
			return this.salario + 1.4 + 1000;
			
		}
}

package br.com.caelum.usuario;

public class Main {
	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setNome("João da Silva");
		gerente.setSalario(5000);

		System.out.println(gerente.getBonificacao());

		ControleDeBonificacoes controle = new ControleDeBonificacoes();

		Gerente funcionario1 = new Gerente();
		funcionario1.setNome("João da Silva");
		funcionario1.setSalario(5000.0);
		controle.registra(funcionario1);

		System.out.println(controle.getTotalDeBonificacoes());
		
		Presidente presidente1 = new Presidente();
		presidente1.setNome("Maria da Silva");
		presidente1.setSalario(10000.0);
		controle.registra(presidente1);

		System.out.println(controle.getTotalDeBonificacoes());
		
		SecretariaAgencia secretaria1 = new SecretariaAgencia();
		secretaria1.setNome("Alberto Nunes");
		secretaria1.setSalario(2000.0);
		controle.registra(secretaria1);

		System.out.println(controle.getTotalDeBonificacoes());
	}
}

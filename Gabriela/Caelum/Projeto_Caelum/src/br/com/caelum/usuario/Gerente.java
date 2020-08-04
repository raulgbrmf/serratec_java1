package br.com.caelum.usuario;
public class Gerente extends Funcionario {

	private int senha;
	private int numeroDeFuncionariosGerenciados;

	
	public Gerente (String nome){
		super (nome); //chamando o construtor da mae, que tem a mesma construcao do gerente 
	}
	
	Gerente (){
		
	}
	
	public double getBonificacao() {

		return salario * 0.1; // Se o atributo salario estiver private, tenho q chamar um get, pq ele nao vai
									// reconhecer o salário aqui.
									// Se o atributo salario estivesse protected, ai eu posso puxar direto o
									// atributo salario, entao ficaria this.salario = this.salario * 0.1

		//Se eu quisesse que a bonificacao do gerente fosse 15%, eu poderia escrever aqui com o 0.15, e isso nao ia alterar o getBonificacao da minha classe mae (Funcionario) 
	}
}
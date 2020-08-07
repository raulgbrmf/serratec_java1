package Exercícios;

public class TestaFunc {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Data data = new Data(23, 01, 2015);	
		
		f1.nome = "Giulia";
		f1.departamento = "Gerencia";
		f1.salario = 100000;
		f1.rg = "23.999.543-8";
		f1.admissao = data;
		System.out.println(f1.toString());
		System.out.println("salario:" + f1.salario);
		f1.bonifica(400);
		System.out.println("salario atual:" + f1.salario);
	}
}

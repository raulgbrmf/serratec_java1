package br.com.Serretec.contas.main;
import br.com.Serratec.contas.*;

public class Main {

	public static void main(String[] args) {
		
		Visitante v1 = new Visitante();
		v1.setNome("Alan");
		v1.setIdade(25);
		v1.setSexo("Masculino");
		System.out.println("\n"+v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Raul");
		a1.setMatricula(123123);
		a1.setCurso("Informática");
		a1.setIdade(16);
		a1.setSexo("Masculino");
		System.out.println("\n"+a1.toString());
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(321321);
		b1.setNome("Celso");
		b1.setSexo("Masculino");
		b1.setIdade(15);
		System.out.println("\n"+b1.toString());
		System.out.println("");
		b1.pagarMensalidade();
		b1.fazerAniversario();
	}

}

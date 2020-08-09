package br.com.caelum.usuario.main;
import br.com.caelum.usuario.*;


public class MainUsuario {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("Mayana");
		Diretor d1 = new Diretor();
		//Funcionario f1 = new Funcionario("Raul");
		
		
		ControleDeBonificacoes cb = new ControleDeBonificacoes();
		
		cb.registra(g1);
		//cb.registra(f1);
		
		System.out.println(g1.getSalario());
		System.out.println(d1.getBonificacao());

	}

}

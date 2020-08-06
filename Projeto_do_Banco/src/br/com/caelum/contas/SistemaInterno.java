package br.com.caelum.contas;
import br.com.caelum.interfaces.Autenticavel;

public class SistemaInterno {

	public void login(Autenticavel a, int senha) {

		boolean ok = a.autentica(senha);
		
		if(ok) {
			System.out.println("Logou");
		}else {
			System.out.println("Não logou");
		}
	}
	

}

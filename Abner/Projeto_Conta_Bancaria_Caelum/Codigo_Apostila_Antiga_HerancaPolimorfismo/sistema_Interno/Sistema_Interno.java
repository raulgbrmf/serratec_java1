package sistema_Interno;

import interfaces.Autenticavel;

public class Sistema_Interno {
	
	public void login(Autenticavel a) {
		int senha = 222;
		boolean ok = a.autentica(senha);
		System.out.println(ok);
	}
}


public class SistemaInterno {
	
	public void entrar(Autenticavel a, int senha) {
		if(a.autentica(senha)) {
			System.out.println("Login Efetuado.");
		}
		else {
			System.out.println("Senha Incorreta.");
		}
	}

}

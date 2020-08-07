package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.ContaCorrente;
//import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaBanco {

	public static void main(String[] args) {
		
		Banco banco = new Banco("SerratecBank",666);
		
		ContaCorrente	c1	=	new	ContaCorrente();
		c1.setTitular("Rodrigo");
		c1.setNumero(1);
		c1.setAgencia(1000);
		c1.deposita(100000);
		banco.adiciona(c1);

		ContaCorrente	c2	=	new	ContaCorrente();
		c2.setTitular("Raul");
		c2.setNumero(2);
		c2.setAgencia(1000);
		c2.deposita(890000);
		banco.adiciona(c2);
		
		for(int i=0;i<8;i++) {
			ContaCorrente	conta	=	new	ContaCorrente();
			conta.setTitular("Titular	"	+	i);
			conta.setNumero(i);
			conta.setAgencia(1000);
			conta.deposita(i	*	1000);
			banco.adiciona(conta);
		}
		
		banco.monstraContas();
		
		ContaCorrente	c3	=	new	ContaCorrente();//Mostra o erro de falta de espaço de array
		c3.setTitular("Raul");
		c3.setNumero(2);
		c3.setAgencia(1000);
		c3.deposita(890000);
		banco.adiciona(c3);
		
		banco.contem(c2);
		banco.contem(c3);
		
		c3	=	new	ContaCorrente();//Usa método adiciona2 que gera um novo array
		c3.setTitular("Raul");
		c3.setNumero(2);
		c3.setAgencia(1000);
		c3.deposita(890000);
		banco.adiciona2(c3);
		
		banco.monstraContas();
		banco.contem(c2);
		banco.contem(c3);
	}

}

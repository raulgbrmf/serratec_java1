package mainsTestes;
//import modeloContas.*;
import sistema_Interno.Sistema_Interno;
import interfaces.Autenticavel;
import usuario.*;

public class Programa {

	public static void main(String[] args) {

		Sistema_Interno si = new Sistema_Interno();
		Autenticavel diretor = new Diretor();
		Autenticavel gerente = new Gerente();
		Autenticavel cliente = new Cliente();
		
		si.login(cliente);
		si.login(gerente);
		si.login(diretor);		
		
		
		/*Conta c = new ContaCorrente();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		System.out.println("Saldo Total: " + adc.getSaldoTotal());*/
	}
}

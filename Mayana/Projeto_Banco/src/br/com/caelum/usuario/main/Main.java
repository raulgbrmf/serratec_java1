package br.com.caelum.usuario.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.usuario.PessoaFisica;
import br.com.caelum.util.Data;



public class Main {

	public static void main(String[] args) {

		Data data1 = new Data(28, 2, 2019);
		Data data2 = new Data(30, 12, 2020);
		
		PessoaFisica cpf1 = new PessoaFisica("123456789");
		//PessoaFisica cpf2 = new PessoaFisica("987654321");	
		
		ContaCorrente cc1 = new ContaCorrente("3");
		//ContaCorrente cc2 = new ContaCorrente("1");
		
		ContaCorrente conta1 = new ContaCorrente(100, 20, "48", "Mayana");
		conta1.setData_abertura(data1);
		conta1.setPessoa(cpf1);	
		
		
		
		/*Conta conta2 = new Conta(300, 10, "21", "Pedro");		
		conta2.setData_abertura(data2);
		conta2.setPessoa(cpf2);*/
		
		
		System.out.println(conta1.recuperaDadosImpressao() + "\n");
		System.out.println("=========================");
		
		
		//System.out.println(conta2.recuperaDadosImpressao() + "\n"); 
		//System.out.println("=========================");
		
		System.out.println("Quantidade de contas abertas : " + Conta.getTotalDeContas());
		
		
	}

}

package banco;

import banco.administrativo.Cliente;
import banco.administrativo.Endereco;
import banco.administrativo.PessoaFisica;
import banco.administrativo.PessoaJuridica;
import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;
import banco.utils.Data;

public class Main {

	public static void main(String[] args){

		Data data1 = new Data(31,8,2020);
		Data data2 = new Data(8,02,2019);
	
		
		Endereco end1 = new Endereco("Rua teste", "1090-3388", "Centre", "S/N", "Petropolis", "RJ");
		Endereco end2 = new Endereco("Rua novo teste", "122090-3388", "Centro", "S/N", "Petropolis", "RJ");
		
		PessoaFisica titular1 = new PessoaFisica("Rafael",end1,"16353926758");
		PessoaJuridica titular2 = new PessoaJuridica("Raul",end2,"00056500000145");
		
	
		ContaPoupanca cp1 = new ContaPoupanca(1,"08090-9",titular1,100,data1,0.2);
		
		ContaCorrente cc1 = new ContaCorrente(2,"080980390-9",titular2,100,data2,6000);
		
		
		
		System.out.println();
		
		cc1.realizaEmprestimo(300);
			
		System.out.println(cp1.recuperaDadosImpressao());
		System.out.println("=============================");
		System.out.println(cc1.recuperaDadosImpressao());

		System.out.println("Quantidades de contas " + Conta.getTotalDeContas());

	}

}

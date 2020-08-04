package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.PessoaFisica;
import br.com.caelum.usuario.*;
import br.com.caelum.util.Data;

public class Main {
//POSSO CRIAR UM PACOTE br.com.caelum.main, e ai ele nao ficaria dentro de contas 
	public static void main(String[] args) {
		
		
		
		
		PessoaFisica p1 = new PessoaFisica("111.111.111-11");
		Data dataMinhaConta = new Data(28, 2, 2019);
		Data dataSuaConta = new Data(21, 7, 2015);
		Conta minhaConta = new Conta(1, "Gabriela", "555", 2000, dataMinhaConta);
		Conta suaConta = new Conta(2, "João", "555", 1500, dataSuaConta);
		Conta contaTeste = new Conta();
		Conta contaTeste2 = new Conta();
		
		/*minhaConta.setNumero(1);
		minhaConta.setTitular("Gabriela");      //--------------> Capitulo 5 Questão
		minhaConta.setAgencia ("555");
		minhaConta.data_abertura = dataMinhaConta;
		
		
		
		suaConta.setNumero(2);
		suaConta.setTitular("João");
		suaConta.setAgencia("555");
		suaConta.data_abertura = dataSuaConta;
		
		
		
		
		
	
			
			 
	//Exercicios capitulo 4:
		
		//System.out.println(minhaConta.saca(100));
		//minhaConta.deposita(500);
		
		
		//System.out.println(minhaConta.recuperaDadosParaImpressao(dataMinhaConta));
		
		//suaConta = minhaConta;

		/*if(suaConta==minhaConta) {
			System.out.println("As contas são iguais");
		}
		else {
			System.out.println("As contas são diferentes");
		}*/
		
		//Exercicios capitulo 5:
		
		
		//System.out.println(minhaConta.getSaldo());
			
		//minhaConta.getTitular();
		
		//System.out.println(contaTeste.getIdentificador());
		//System.out.println(contaTeste2.getIdentificador());
		
		//System.out.println(dataMinhaConta.validaData());
		//System.out.println(minhaConta.recuperaDadosParaImpressao(dataMinhaConta));
		
		//p1.validaCpf("26.789.245-1");
		
		
		//System.out.println("seu cpf é: " + p1.getCpf());
		
		
		//minhaConta.transfere(suaConta,200);
		
		
		
		//System.out.println(contaTeste2.getIdentificador());
		
		
		
		//System.out.println(contaTeste.gettotalContas());
		//System.out.println(contaTeste2.gettotalContas());
		
		
		
	
	}
		}
		
		
	



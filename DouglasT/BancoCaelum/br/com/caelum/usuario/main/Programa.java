package br.com.caelum.usuario.main;

import br.com.caelum.banco.util.Data;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.usuario.PessoaFisica;

public class Programa {

		public	static	void main(String[]	args) {
			Conta	c1	=	new	Conta("Hugo"); // ----Exercicios cap.5 num 4
			c1.setNumero (123);             //---- Exercicios cap.5 num 2
			c1.setAgencia ("45678-9");
			c1.setSaldo (50.0);
			Data data1 = new Data();
			data1.setDia (29);
			data1.setMes (12);
			data1.setAno (2019);
			c1.setDataAbertura(data1);
			PessoaFisica p1= new PessoaFisica();
			
			/*System.out.println(c1.titular);
			System.out.println(c1.numero);
			System.out.println(c1.agencia);
			System.out.println("valor atual da conta : "+c1.saldo); 
			System.out.println(c1.dataAbertura);
			
			c1.saca(10);
			System.out.println("Valor depois do saque : "+c1.saldo);
			
			c1.deposita(30);
			System.out.println("Valor depois do deposito : "+c1.saldo);
			
			c1.calculaRendimento();
			System.out.println("Rendimento Mensal : "+c1.calculaRendimento()); ---- Exercicios cap.4 num 1 e 2*/
			
			//System.out.println(c1.recuperaDadosParaImpressao());-------Exercicios cap.4 num 3
			
			/*Conta	c1	=	new	Conta();								
			c1.titular	=	"Danilo";
			c1.saldo	=	100;
			Conta	c2	=	new	Conta();								
			c2.titular	=	"Danilo";
			c2.saldo	=	100;
			if	(c1	==	c2)	{
							System.out.println("iguais");
			}	else	{
							System.out.println("diferentes");			-------Exercicios cap.4 num 4 e 5					
			}*/

			//System.out.println(c1.recuperaDadosParaImpressao());//-------Exercicios cap.4 num 6/7/9
			if(c1.getDataAbertura().validaData()) {
				System.out.println(c1.getDataAbertura().imprimeData());
			}else {
				System.out.println("Data inválida");
			}
			
			p1.setCpf("264.165.784-88");
			c1.setPessoa(p1);
			
			
			System.out.println(c1.getPessoa().getCpf());
		}   
}


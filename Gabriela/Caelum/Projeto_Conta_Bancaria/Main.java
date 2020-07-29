
public class Main {

	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		Conta suaConta = new Conta();
		Data data = new Data();
		
		data.dia = 20;
		data.mes = 5; //----------------------> Questão 7
		data.ano = 2006;
		
		minhaConta.numero = 1;
		minhaConta.titular = "Gabriela";
		minhaConta.agencia = "555";
		minhaConta.data_abertura = data;
		minhaConta.saldo = 500;
		

		suaConta.numero = 2;
		suaConta.titular = "João";
		suaConta.agencia = "555";
		//suaConta.Data.data_abertura = "27/08/2006";
		suaConta.saldo = 250;
		
		
		//suaConta=minhaConta; ----------------> Questão 5
		
		
		//System.out.println(minhaConta.titular);
		//System.out.println(suaConta.titular);
		//minhaConta.saca(50);
		//System.out.println("Meu saldo antes do saque: " + minhaConta.saldo);
		//minhaConta.saca(50);
		//System.out.println("Meu saldo após o saque: " + minhaConta.saldo); --------------> Questão 2
		
		//System.out.println("Meu saldo atual é: " + minhaConta.saldo);
		
		//minhaConta.deposita(100);
		
		//System.out.println("Meu novo saldo é: " + minhaConta.saldo);
		
		
		
		//System.out.println("Meu rendimento é de: " + minhaConta.calculaRendimento());
		System.out.println(minhaConta.recuperaDadosParaImpressao()); //---------------------->Questão 3
		
		/*if(minhaConta == suaConta) {
			System.out.println("São iguais");      
		}                                    -----------------------------------> Questão 4
		else {                                        
			System.out.println("São diferentes");
		}*/
	}

}

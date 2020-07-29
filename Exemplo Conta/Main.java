
public class Main {

	public static void main(String[] args) {
		
		Conta minhaConta1 = new Conta();
		//Conta minhaConta2 = new Conta();
		
		minhaConta1.titular="Rodrigo";
		minhaConta1.saldo=2000.00;
		minhaConta1.agencia="Pet";
		//minhaConta1.dataabertura="05/01/2010";
		Data data=new Data();
		data.dia=05;
		data.mes=07;
		data.ano=2005;
		minhaConta1.dataabertura=data;
		
		/*minhaConta2.titular="Rodrigo";
		minhaConta2.saldo=2000.00;
		minhaConta2.agencia="Pet";
		minhaConta2.dataabertura="05/01/2010";*/
		//minhaConta2=minhaConta1;
		
		minhaConta1.saca(75);
		
		System.out.println("O saldo atual do cliente "+minhaConta1.titular+" é "+minhaConta1.saldo);
		System.out.println(minhaConta1.recuperaDadosParaImpressao());
		System.out.println(minhaConta1.calculaRendimento());
		
		/*if	(minhaConta1 == minhaConta2)	
			System.out.println("iguais");
	    else	
			System.out.println("diferentes");*/							


	}

}


public class Main {

	public static void main(String[] args) {

		Conta minhaConta = new Conta();
		Conta suaConta = new Conta();
		Data data1 = new Data();
		data1.dia = 05;
		data1.mes = 05;
		data1.ano = 2020;
		Data data2 = new Data();
		data2.dia = 23;
		data2.mes = 8;
		data2.ano = 2019;
		
		minhaConta.titular = "Douglas";
		minhaConta.numero = 1264-1;
		minhaConta.agencia =7;
		minhaConta.data_abertura = data1;
		minhaConta.saldo = 105;
		
		suaConta.titular = "Raul";
		suaConta.numero = 34534-1;
		suaConta.agencia =9;
		suaConta.data_abertura = data2;
		suaConta.saldo = 678;

		minhaConta.deposita(120);
		/*System.out.println("Saldo Atual: R$" + minhaConta.saldo);              -> exercicio 2
        System.out.println("Rendimento Mensal: R$" + minhaConta.Rendimento());*/
		System.out.println(minhaConta.RecuperaImpressao());
	
        /*
         * if(minhaConta == suaConta) { 
         *    System.out.println("Iguais"); 
         * }                                            -> exercicio 4
         * else {
         *    System.out.println("Diferentes."); 
         * }
         */

 

        /*suaConta = minhaConta; 
        if (minhaConta == suaConta) {
            System.out.println("Iguais");
        }                                                  -> exercicio 5
        else {
            System.out.println("Diferentes.");
        }*/
	}

}

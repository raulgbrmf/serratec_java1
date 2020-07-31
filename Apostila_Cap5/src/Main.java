
public class Main {

	public static void main(String[] args) {
		
		/*Conta conta = new Conta();
		
		//conta.setTitular("Ingrid");		//PERMITE QUE O VALOR SEJA MODIFICADO
		
		System.out.println("Titular: ");
		System.out.println("Titular: " + conta.getTitular());
		
		conta.setNumero(01);			//PERMITE QUE O VALOR SEJA MODIFICADO
		System.out.println("Numero: " + conta.getNumero());
		
		conta.setAgencia("45568-9");	//PERMITE QUE O VALOR SEJA MODIFICADO
		System.out.println("Numero: " + conta.getAgencia());
		
		conta.setSaldo(100);			//PERMITE QUE O VALOR SEJA MODIFICADO
		System.out.println("Saldo:" + conta.getSaldo());
		
		//conta.setDataAberturaConta("30/07/2020");  NAO LEVA SETDATA POIS EU NAO QUERO QUE ESTA SEJA MODIFICADA POR OUTREM
		System.out.println("Data de abertura da conta: " + conta.getDataAberturaConta());*/
		
		//Exercicio4
		Conta conta = new Conta("Ingrid Coelho");
		Conta outraConta = new Conta();
		
		System.out.println("Titular da primeira conta: " + conta.Titular);
		System.out.println("Titular da segunda conta: " + outraConta.Titular);
		
	}

}

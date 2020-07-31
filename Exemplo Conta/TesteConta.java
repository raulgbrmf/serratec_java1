package encapsulamento;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta minhaConta1 = new Conta();
		Conta minhaConta2 = new Conta("Matheus");
		
		minhaConta1.setTitular("Rodrigo");
		minhaConta1.deposita(2000.00);
		minhaConta1.setAgencia("Pet");
		minhaConta1.setNumero(1);
		
		Data data=new Data(28,2,2012);
		minhaConta1.setDataabertura(data);
		
		minhaConta1.saca(75);
		
		System.out.println("O saldo atual do cliente "+minhaConta1.getTitular()+" é "+minhaConta1.getSaldo());
		System.out.println(minhaConta1.recuperaDadosParaImpressao());
		System.out.println(minhaConta1.getRendimento());
		System.out.println(minhaConta1.getId()+" , "+minhaConta2.getId());
		
	}

}

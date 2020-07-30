
public class MovimentacaoUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta minhaConta = new Conta();
		Data dataAberturaCliente = new Data(); 
		
		//Conta outraConta = new Conta();
		
		// Inserindo os dados da Cliente Carla
		
		minhaConta.titular = "CarlaH";
		minhaConta.numero  = 1234567;
		minhaConta.agencia = "1234";
		minhaConta.saldo = 5000;
		minhaConta.DataAbertura = dataAberturaCliente;
		
		
		// Inserindo os dados da Cliente Catia
		
				/*outraConta.titular = "CatiaH";
				outraConta.numero  = 1234568;
				outraConta.agencia = "1234";
				outraConta.saldo = 3000;
				outraConta.DataAbertura = "15.07.2020";	*/	
 		
	
		 minhaConta.saca(1000);
		 minhaConta.deposita(0);
		 minhaConta.calculaRendimento();
		 
		 
		 System.out.println("\n" + minhaConta.recuperaDadosParaImpressao());
	}

}

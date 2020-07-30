
public class MovimentacaoUsuarioComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta minhaConta = new Conta();
		Conta outraConta = new Conta();
		
		// Inserindo os dados da Cliente Carla
		
		minhaConta.titular = "CarlaH";
		//minhaConta.numero  = 1234567;
		//minhaConta.agencia = "1234";
		minhaConta.saldo = 5000;
		//minhaConta.DataAbertura = "01.07.2020";
		
		minhaConta.titular = "CatiaH";
		minhaConta.saldo = 5000;
		
		
		// Inserindo os dados da Cliente Catia
		
				outraConta.titular = "CarlaH";
				//outraConta.numero  = 1234568;
				//outraConta.agencia = "1234";
				outraConta.saldo = 5000;
				//outraConta.DataAbertura = "15.07.2020";	
				
				outraConta = minhaConta;
 	
		if ( minhaConta == outraConta)
		{
			System.out.println ("iguais");
		}else {
			System.out.println ("diferentes");	
		}
		
		//  Nos meus testes a primeira simulação o reultado foi "diferentes" e a segunda o resultado foi "iguais". 
	}

}

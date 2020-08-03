package Cap5_Exercicios;


public class Main {

	public static void main(String[] args) {
	
		
		
		Conta C1 = new Conta("Thayna"); //Utilizando um construtor
		Conta C2 = new Conta();
		
			
		
		//Cada conta possui um identificador		
		System.out.println("Identificador C1: "+C1.getIdentificador());
		System.out.println("Identificador C2: "+ C2.getIdentificador());
		
		
		
		C1.setNumero_conta(25654);
		C1.setAgencia(63);	
	
		
		C2.setTitular("Ezequiel");
		C2.setNumero_conta(25778);
		C2.setAgencia(89);
	
		
		
		C1.Deposito(100.00);
		C2.Deposito(500.00);
				
		
		int T = C1.Transferencia(C2 ,150);
		
		switch (T) {
		
			case 1: System.out.println("Transferencia realizada com sucesso");
						break;
			case 100: System.out.println("Saldo insuficiente");
						break;
			case 101: System.out.println("Valor de transferencia excede o limite diário");
						break;
						
			default: break;
		}
		
		
		System.out.println(C1.recuperaDadosParaImpressao());
		System.out.println(C2.recuperaDadosParaImpressao());
		
	}

}

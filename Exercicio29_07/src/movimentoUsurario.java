
public class movimentoUsurario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta novaconta = new Conta();
		
			novaconta.nomeTitular = "Maycon";
			novaconta.numConta = 1410;
			novaconta.agencia = "1114-M";
			novaconta.dataAbertura = "10/10/2019";
			novaconta.saldo = 500;
		
		
		
		/*EXERCICIO 2 System.out.println("Saldo Atual: " + novaconta.saldo);
		
		novaconta.deposita(100.0);
			
		System.out.println("Saldo Atual após dep: " + novaconta.saldo );
		
		novaconta.saca(50.0);
		
		System.out.println("Saldo Atual após saque: " + novaconta.saldo );

		novaconta.calculaRendimento();
		
		System.out.println("Saldo Atual com Rendimento: " + novaconta.saldo ); */
		
		
		/*EXERCICIO 3 Conta Impressao = new Conta();				
			Impressao.nomeTitular = "Maycon";
			Impressao.numConta = 1410;
			Impressao.agencia = "1114-M";
			Impressao.dataAbertura = "10/10/2019";
			Impressao.saldo = 500;
		
		System.out.println(Impressao.recuperaDadosParaImpressao());*/
		
		Conta conta1 = new Conta();   // EXERCICIO 4
		conta1.nomeTitular = "Juvenal";
		conta1.saldo = 100;
		
		conta1.nomeTitular = "Juvenilda";  // EXERCICIO 5
		conta1.saldo = 100;
				
		Conta conta2 = new Conta(); // EXERCICIO 4
		conta2.nomeTitular = "Juvenal";
		conta2.saldo = 100;
		conta2 = conta1;
		
		if (conta1 == conta2) {
			System.out.println("Iguais");
		}	
			else {
			System.out.println("São Diferentes");
				
			}
		
		
		
				
		}
	
		
		
	}
		
			
		



	

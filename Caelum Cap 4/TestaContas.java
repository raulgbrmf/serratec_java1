
public class TestaContas {

	public static void main(String[] args) {
		
		Conta Conta1 = new Conta();
		
		Conta1.titular = "Ramon Ives";
		Conta1.numero = 123;
		Conta1.agencia = "12345-6";
		Conta1.saldo = 1000;
		Conta1.dataDeAbertura = "29/07/2020";
		
//Numero 4: diferente pois usa parte diferente da memoria
//Numero 5: ao criar 2 referencia para a mesma conta a resposta 
//do if sera igual pois esta usando o mesmo espaco na memoria
//Tinha feito os codigos porem achei que ficou poluido o scrip.
			
		Conta1.saca(200);
		
		Conta1.deposita(300);
		
		Conta1.calculoRendimento();
		
		Conta1.recuperacaoDeDados();

	}

}


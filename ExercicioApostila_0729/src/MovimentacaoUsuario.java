
public class MovimentacaoUsuario {

	public static void main(String[] args) {
				
		Conta conta = new Conta();
		conta.titular = "Ingrid";
		conta.numero = 01;
		conta.agencia = "45568-9";
		conta.saldo = 1000.0;
		conta.dataAberturaConta = "29/07/2020";
		
		System.out.println(conta.recuperacaoDadosParaImpressao());
		
		conta.saca(250);
		conta.deposita(500);
		conta.calculaRendimento();
				
	}

}

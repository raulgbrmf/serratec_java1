
public class Conta {
	
		String titular;
		int numero;
		String agencia;
		double saldo;
		String dataAberturaConta;
		double rendimento;	
				
		void saca(double valor)
		{
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			
			System.out.println("\nSaque: R$" + valor);
			System.out.println("Seu saldo após o saque: R$" + this.saldo);
			
		}
		
		void deposita(double valor) 
		{
			double novoSaldo = this.saldo + valor;
			this.saldo = novoSaldo;
			System.out.println("\nDepósito: R$" + valor);
			System.out.println("Seu saldo após o depósito: R$" + this.saldo);
			
		}
		
		void calculaRendimento() 
		{
			rendimento = this.saldo * 0.1;
			System.out.println("\nRendimento do saldo: R$" + rendimento);
			double novoSaldo = (rendimento) + this.saldo;
			this.saldo = novoSaldo;
			
			System.out.println("Saldo total: R$" + this.saldo);
		}

		String recuperacaoDadosParaImpressao() {
			String dados = "Titular: " + this.titular;
			dados += "\nNúmero: " + this.numero;
			dados += "\nAgencia: " + this.agencia;
			dados += "\nData de abertura de conta: " + this.dataAberturaConta;
			dados += "\nSaldo: R$" + this.saldo;
			
			return dados;
		}
		

}

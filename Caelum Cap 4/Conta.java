
public class Conta {
	
	String titular;
	int numero;
	String agencia;
	double saldo;
	String dataDeAbertura;
	double rendimento;
	
	
	
	
	void saca (double valor) {
		
		if (this.saldo >= valor) {
			System.out.println("Voce sacou R$ " + valor);
			this.saldo = this.saldo - valor;
			System.out.println("Seu saldo agora e de R$ " + this.saldo);
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		
		
	}
	
	void deposita (double valor) {
		
		if (valor > 0 ) {
			System.out.println("Voce depositou R$ " + valor);
			this.saldo = this.saldo + valor;
			System.out.println("Seu saldo agora e de R$ " + this.saldo);
		}
		
	}
	
	double calculoRendimento(){
		double rend;
		rend = this.saldo * 0.1;
		System.out.println("O rendimento mensal da sua conta e: R$ " + rend);
		return rend;

		
	}
	
	/*void recuperacaoDeDados() {  
		
		System.out.println("Titular da conta: " + this.titular + ", Numero da conta: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: R$ " + this.saldo + ", Data de abertura da conta: " + this.dataDeAbertura);
		
	}*/ //PRIMEIRA FORMA QUE RESOLVI.
	
	String recuperacaoDeDados() {
		
		String dados = "Titular: " + this.titular;
		dados = dados + "\nNumero: " + this.numero;
		dados = dados + "\nAgencia: " + this.agencia;
		dados = dados + "\nSaldo: " + this.saldo;
		dados = dados + "\nData de Abertura: " + this.dataDeAbertura;
		System.out.println(dados);
		return dados;
	} //SEGUNDA FORMA QUE RESOLVI. (MELHOR FORMA POIS APENAS ASSOCIEI TUDO A "DADOS" E DEI PRINT NELE)
	
}

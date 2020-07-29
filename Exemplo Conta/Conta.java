
public class Conta {
	
	int numero;
	String titular,agencia;
	double saldo;
	Data dataabertura;
	
	boolean saca(double quantidade) {
		
		if(this.saldo < quantidade)
			return false;
		
		else{
			double novoSaldo = this.saldo - quantidade;
			this.saldo = novoSaldo;
			return true;
			}
		
		}
	
	void deposita(double quantidade) {
		
		double novoSaldo = this.saldo + quantidade;
		this.saldo = novoSaldo;
	}
	
	double calculaRendimento() {
		
		return this.saldo*0.1;
	}
	
	String recuperaDadosParaImpressao() {
		
		return "Conta [numero= " + numero + ", titular= " + titular + ", agencia= " + 
		 agencia + ", Data de abertura= "+ dataabertura.formatada() +", saldo= " + saldo + "]";
		
	}
	
	
}

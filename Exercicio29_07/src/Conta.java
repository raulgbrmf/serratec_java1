
public class Conta {

		
		String nomeTitular, agencia, dataAbertura;
		int numConta;
		double saldo;
		
		void saca(double valor) {
			double novosaldo = this.saldo - valor;
			this.saldo = novosaldo;
		
	}
		
		void deposita(double valor) {
			double novosaldo = this.saldo + valor;
			this.saldo = novosaldo;
			
		
		}
		
		void calculaRendimento() {
			double novosaldo = this.saldo * 0.1;
			this.saldo = novosaldo;
			
		}
		
		String	recuperaDadosParaImpressao() {
			String dados = "nomeTitular: " + this.nomeTitular;
			dados += "\nnumConta: " + this.numConta;
			dados += "\nagencia: " + this.agencia;
			dados += "\ndataAbertura: " + this.dataAbertura;
			dados += "\nsaldo: " + this.saldo;
			return	dados;
		

}
}

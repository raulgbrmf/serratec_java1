
public class Conta {
		
		int numero;
		int agencia;
		String titular;
		double saldo;
		Data data_abertura;
		
		boolean saca(double valor){
			if(this.saldo >= valor) {
				this.saldo = this.saldo - valor;
				return true;
			}else {
				return false;
			}
			
		}
		
		boolean transfere(Conta destino,double valor) {
			if (this.saca (valor)) {
				destino.deposita(valor);
				return true;
			}else {
				return false;
			}
		}
		
		void deposita(double valor) {
			this.saldo = this.saldo+valor;
		}
		
		double Rendimento() {
			return this.saldo*0.1;
		}
		
		String RecuperaImpressao() {
			return "Titular: "+this.titular+
					"\nAngeica: "+this.agencia+
					"\nNº Conta: "+this.numero+
					"\nData De Criação da Conta: "+this.data_abertura.imprimeData()+
					"\nSaldo Atual: "+this.saldo+
					"\nRendimento Mensal: R$"+this.Rendimento();
	}
}
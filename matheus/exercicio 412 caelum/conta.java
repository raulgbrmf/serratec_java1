package exercicio412;

public class conta{
	
	double saldo;
	String titular, agencia;
	int numero;
	data dataAbertura;
	
	
	
	
	
	void saca (double valor) {
		
		if(valor<saldo) {
			saldo=saldo-valor;
		}else {
			System.out.print("operação abortada");
		}
		
	}
	
	void deposita (double valor) {
		saldo=valor+saldo;
		
	}
	
	double calculaRendimento() {
		double rendimento;
		rendimento=saldo*0.1;
		return rendimento;
		
	}
	
	
	public String recuperaDadosParaImpressao() {
		return "conta [saldo=" + saldo + ", titular=" + titular + ", agencia=" + agencia + ", dataAbertura="
				+ dataAbertura.formatada()+ ", numero=" + numero + "]";
	}
}

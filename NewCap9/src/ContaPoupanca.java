

public class ContaPoupanca extends Conta {

	//@Override
	protected void atualiza(double taxa) {
		this.saldo += this.saldo * (taxa*3);
		
	}
	
/*	void atualiza(double taxa) {
		super.atualiza(taxa * 3); 
		}	
		*/
}

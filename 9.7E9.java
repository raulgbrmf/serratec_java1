


// Método trasfere na classe conta

public void transfere(Conta destino, double valor) {
		if(this.saldo>=valor) {
			
			this.saldo = this.saldo - valor;
			destino.saldo = destino.saldo + valor;
}





// Método transfere na classe ManipuladorDeContas
public void transfere(Evento evento) {
	    Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
	    c1.transfere(destino, evento.getDouble("valorTransferencia"));
	}


		
		
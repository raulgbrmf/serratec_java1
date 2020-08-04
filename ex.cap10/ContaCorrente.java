package ex09;

public class ContaCorrente extends Conta{
	ContaCorrente(String nome, int numeroDaConta, int agencia, String tipo)
    {
        super(nome,numeroDaConta, agencia, tipo);
    }
	
	@Override
	public boolean sacar(double valor)
	{
		if(!validarSaldo(valor))
			return false;

			this.saldo -= valor + 0.1;
			return true;
			
	}

	
    
}

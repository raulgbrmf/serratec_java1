

public abstract class Conta {

	protected double saldo;

	public void deposita(double valor) throws ValorInvalidoException { // Exercício - 1.
		if (valor < 0) {
			throw new ValorInvalidoException(valor); // Exercícios -3 e 6.
		} else {
			this.saldo += valor * 0.9962;
		}
	}

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new IllegalArgumentException("Valor insuficiente.");
		} else {
			this.saldo -= valor;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public abstract void atualiza(double valor);

}

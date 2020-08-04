package br.com.caelum.usuario;

public class SecretariaAgencia extends Secretaria {

	@Override
	protected double getBonificacao() {
		return this.salario * 0.2 + 100;
	}

}

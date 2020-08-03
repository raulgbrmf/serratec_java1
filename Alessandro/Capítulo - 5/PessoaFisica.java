// Exercício - 7.

public class PessoaFisica {
	private String cpf;

	public PessoaFisica(String cpf) {
		if (validaCpf(cpf)) {
			this.cpf = cpf;
		} else {
			System.out.println("CPF inválido");
		}
	}

	public String getCpf() {
		return this.cpf;
	}

	public boolean verificaDigitos(String cpf) {
		long num = Long.parseLong(cpf);

		if (num != 0) {
			return true;
		}
		return false;
	}

	public boolean validaCpf(String cpf) {
		int digitos = cpf.length();

		if (verificaDigitos(cpf)) {
			if (digitos == 11) {
				return true;
			}
		}
		return false;
	}
}

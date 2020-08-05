package br.com.caelum.contas.util;

public final class Util {
	
	 public static boolean validaCPF(String cpf) {

		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
				|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
				|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
				|| cpf.equals("99999999999") || cpf.length() != 11)
			return false;

		char cpfArray[] = cpf.toCharArray();
		int primeiroDigito = Integer.parseInt(String.valueOf(cpfArray[9]));
		int segundoDigito = Integer.parseInt(String.valueOf(cpfArray[10]));
		int resultado = 0;
		int peso = 10;

		// Verifica primeiro digito verificador
		for (int i = 0; i <= 8; i++) {
			resultado += Integer.parseInt(String.valueOf(cpfArray[i])) * peso--;
		}

		resultado = (resultado * 10) % 11;

		if (resultado == 10 || resultado == 11)
			resultado = 0;

		if (resultado != primeiroDigito)
			return false;

		// Verifica segundo digito verificador
		resultado = 0;
		peso = 11;

		for (int i = 0; i <= 8; i++) {
			resultado += Integer.parseInt(String.valueOf(cpfArray[i])) * peso--;
		}

		resultado += (primeiroDigito * 2);

		resultado = (resultado * 10) % 11;

		if (resultado == 10 || resultado == 11)
			resultado = 0;

		if (resultado != segundoDigito)
			return false;

		return true;

	}
}

public class Pessoa {
    private String cpf;

    Pessoa(String cpf) {
        if (verificarDigitos(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF Invalido! Deve digitar somente numeros... Quantidade de digitos deve ser igual a 11");
        }
    }

    public String getCpf() {
        return this.cpf;
    }

    public boolean verificarDigitos(String cpf) {
        int digitos = cpf.length();
        if (diferenteZero(cpf)) {
            if (digitos == 11) {
                return true;
            }
        }
        return false;
    }

    public boolean diferenteZero(String cpf) {
        long numero = Long.parseLong(cpf);
        if (numero != 0) {
            return true;
        }
        return false;
    }
}

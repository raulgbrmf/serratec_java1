public class Data {
    private int dia;
    private int mes;
    private int ano;

    Data(int dia, int mes, int ano) {
        if (verificarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida!");
        }
    }

    boolean verificarData(int dia, int mes, int ano) {
        if ((mes >= 1 && mes <= 12) || (dia >= 1 && dia <= 30)) {
            if (mes == 4 && mes == 6 && mes == 9 && mes == 11) {
                return true;
            } else if ((mes != 2) && (dia >= 1 && dia <= 31)) {
                return true;
            } else {
                if ((anoBissexto(ano) == true) && (dia >= 1 && dia <= 29))
                    return true;
                else if ((anoBissexto(ano) == false) && dia >= 1 && dia <= 28)
                    return true;
            }
        }
        return false;
    }

    private boolean anoBissexto(int ano) {
        return ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0));
    }

    String formatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}

public class Conta {

    String titular;
    int numero;
    String agencia;
    double saldo;
    Data dataAbertura;

    void saque(double valor){
        if(saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saque indisponível.");
        }
    }
    void depositar(double valor){
            this.saldo += valor;
    }
    double calcularRendimento(){
        if(saldo != 0) {
            return this.saldo * 0.1;
        } else {
            System.out.print("Não possui rendimento, pois, saldo = 0");
            return 0;
        }
    }

    String imprimeDados(){
        return "Informações da Conta "
            +"\nNome do titular: " + this.titular
            + "\nNúmero da Conta: " + this.numero
            + "\nAgência: " + this.agencia
            + "\nSaldo: " + this.saldo
            + "\nData de Abertura: "+ this.dataAbertura.formatada() //Modificado no exercício 9
            + "\nRendimento mensal: " + this.calcularRendimento();
    }
}

public class Conta {
    //Exercise 1 - add private
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataAbertura;
    private int userID;
    private static int increment;


    //Exercise 2
    String getTitular() {
        return this.titular;
    }

    void setTitular(String nome) {
        this.titular = nome;
    }

    //Exercise 4
    Conta() {
        this.userID = gerarID();
    }

    Conta(String nome) {
        this.userID = gerarID();
        this.titular = nome;
    }
    //Exercise 5

    int gerarID() {
        Conta.increment += 1;
        return Conta.increment;
    }

    int getUserID() {
        return this.userID;
    }
}

import java.net.StandardSocketOptions;

public class Main {
    public static void main(String[] args) {

        Data data = new Data (); //Exercise 6
        data.dia = 20;
        data.mes = 11;
        data.ano = 1998;

        Conta user = new Conta();
        user.titular = "Fernando";
        user.numero = 234;
        user.agencia = "56900-3";
        user.saldo = 1000.0;
        user.dataAbertura = data;

        user.saque(500);
        user.depositar(200);

        System.out.println(user.imprimeDados());
    }
}

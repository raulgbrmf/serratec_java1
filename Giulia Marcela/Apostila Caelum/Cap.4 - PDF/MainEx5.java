public class MainEx5 {
    public static void main(String[] args) {

        Conta user = new Conta (); // Reserva um espaço na memória para esse dado
        user.titular = "Hugo";
        user.saldo = 100;

        Conta user1 = new Conta ();
        user1.titular = "Danilo";
        user1.saldo = 100;

        user = user1;

        if (user == user1){
            System.out.println("Iguais!");
        } else {
            System.out.println("Diferentes!");
        }
    }
}

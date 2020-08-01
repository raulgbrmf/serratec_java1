public class MainEx4 {
    public static void main(String[] args) {

        Conta user = new Conta ();
        user.titular = "Danilo";
        user.saldo = 100;

        Conta user1 = new Conta ();
        user1.titular = "Danilo";
        user1.saldo = 100;

        if (user == user1){
            System.out.println("Iguais!");
        } else {
            System.out.println("Diferentes!");
        }
    }
}

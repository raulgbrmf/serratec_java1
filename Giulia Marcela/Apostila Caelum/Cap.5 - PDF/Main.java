public class Main {
    public static void main(String[] args) {

        //Exercise 6
        Data data = new Data(20, 11, 1998);
        System.out.println("Data: " + data.formatada());

        //Exercise 3
        Conta user = new Conta();
        user.setTitular("Bruce Wayne");
        System.out.println("Id [" + user.getUserID() + "] " + user.getTitular());

        //Exercise 4
        Conta userEx4 = new Conta("Bruce Banner");
        System.out.println("Id [" + userEx4.getUserID() + "] " + userEx4.getTitular());

        //Exercise 7
        Pessoa people = new Pessoa("23415698712");
        System.out.println("CPF: " + people.getCpf());
    }
}

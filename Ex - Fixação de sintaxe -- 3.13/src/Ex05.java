import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        long num;
        long fatorial = 1;
        int cont = 1;

        do{
        	num = scan.nextInt();
            
            for(int i = 1; i <= num; i++){
                fatorial = fatorial * i;
            }
            
            System.out.println(num + "!" + " = " + fatorial);
            cont++;
            
       }while(cont < 2);
    }
}
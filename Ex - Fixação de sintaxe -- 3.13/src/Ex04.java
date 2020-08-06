import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        
        int fatorial = 1;
        int cont = 1;

        do{
            
            for(int i = 1; i <= 10; i++){
                fatorial = fatorial * i;
            }
            
            System.out.println(10 + "!" + " = " + fatorial);
            cont++;
            
       }while(cont < 2);
    }
}
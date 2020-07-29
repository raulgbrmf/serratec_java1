import java.util.Scanner;
public class Exercicio_8 {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        
        for(int i = 1; i <= num; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}



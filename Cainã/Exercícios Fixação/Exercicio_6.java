import java.util.Scanner;

public class Exercicio_6
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite quantos números da sequência Fibonacci deseja exibir: ");
        int num = scan.nextInt();
    	
    	for (int a = 0, b = 1, i = 0; i < num; b += a, a = b - a, i++) 
        {
            System.out.print(a + " ");
        }
    	scan.close();
    }
}
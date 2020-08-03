/* 7. (opcional) Escreva um programa que, dada uma variável	x com algum	valor inteiro,temos um */
/* novo	x deacordo com a seguinte regra: */
/* se x	é par, x = x / 2 */
/* se x	é impar, x = 3 * x + 1 */
/* imprime x */
/* O programa deve parar quando	x tiver	o valor	final de 1.	Por	exemplo, para x	= 13, a	saída */
/* será: 40	-> 20 -> 10	-> 5 ->	16 -> 8	-> 4 ->	2 -> 1 */

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
        System.out.print("Digite um valor inteiro: ");
        int x = scan.nextInt();
        while(x != 1) {
        	if(x % 2 == 0) {
                x = x / 2;
                System.out.print(x + " ");
            }
            else if(x % 2 != 0) {
                x = 3 * x + 1;
                System.out.print(x + " ");
            }
        }
        scan.close();
    }
}	
		
		
		
		
		
		
		
		
		





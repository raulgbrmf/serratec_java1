/* 5. No código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos,*/
/* até 20, 30, 40. Em um determinado momento, além desse cálculo demorar, vai começar a	mostrar */
/* respostas completamente erradas. Por	quê? */
/* Por que acredito que ultrapassou o limite de espaços pré-definidos no sistema. */
/* Mude	de int para long para ver alguma mudança. */
/* Houve um aumento da tolerância, mas não muito. */

public class Exercicio_5 {

	public static void main(String[] args) {
				
	long num = 1;
		for (int i = 1; i <= 21; i++) {
			num = num * i;
			System.out.println ("O fatorial de " + i + " é (" + (i-1) + ")! * " + i + " = " + num);
		}
	}	
}
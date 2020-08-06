/*
	5. No código do exercício anterior, aumente a quantidade de números 
	que terão os fatoriais impressos,até 20, 30, 40.
	Em um determinado momento, além desse cálculo demorar, 
	vai começar a mostrar respostas completamente erradas. 
	Por quê? 
	
	Porque o tipo int suportava apenas 4 bytes enquanto o long suporta 8 bytes.
	Por isso foi necessário fazer a mudança.
*/
public class Ex5 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//int i;
			//int n = 20;
			//int n = 30;
			long  i;
			long  n = 40;
			//int fatorial = 1;
			long  fatorial = 1;
			
			
			for (i=1; i<=n; i++ )
			{
				fatorial = fatorial*i;
				System.out.println( " Fatorial de " + "(" + i + "!) = " + fatorial);
			}

		}

	}

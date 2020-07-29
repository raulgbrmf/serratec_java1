
public class Exercicio_6 {

	public static void main(String[] args) {	
		
		int a = 0, b = 1, i = 0;
		
        for (i = 0; i < 13;  i++){          	
            System.out.print(a + " ");
            b = b + a;
        	a = b - a;        	
        }       
    }
}


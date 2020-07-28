
public class Exercicio6Caelum {

	public static void main(String[] args) {
		int F = 0;     // atual
        int ant = 0;   // anterior

        for (int i = 0; i <= 12; i++) {

            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F = F + ant;
                ant = F - ant;
            }
            
            System.out.println(F);


	}
	}
	}

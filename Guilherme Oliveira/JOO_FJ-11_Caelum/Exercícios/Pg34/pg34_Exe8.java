package Pg34;

public class pg34_Exe8 {

	public static void main(String[] args) {
		for (int linha = 1; linha <=4; linha++) {
			
			for (int coluna = 1; coluna <= linha; coluna++) {
				System.out.print(coluna * linha + " ");
			}
			System.out.println("");
		}
	}

}

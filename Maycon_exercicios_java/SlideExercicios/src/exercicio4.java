import java.util.concurrent.TimeUnit; 

public class exercicio4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int contador = 10;
		
		while(contador > 0)
		{
			System.out.println("detonação em: " + contador );
				contador = contador - 1;
					TimeUnit.SECONDS.sleep(1);
				
				
		}
		
		System.out.println("BOOM LAAAB !!! ");
	}
}

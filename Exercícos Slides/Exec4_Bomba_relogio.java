
import java.util.concurrent.TimeUnit;

public class Exec4_Bomba_relogio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int contador = 10;
		
		while (contador >0)
		
		{ System.out.println("Detonação em : " + contador ); 
			contador = contador -1;
			TimeUnit.SECONDS.sleep(1);
		}
		
		System.out.println("Boom!! " );
		
	}

}

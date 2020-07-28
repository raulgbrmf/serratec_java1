
public class BombaRelogio {

	public static void main(String[] args) throws InterruptedException {
		int contador = 10;

		while (contador > 0) {
			System.out.println("Detonação em: " + contador);

			contador -= 1;

			// Aguarda 1000 milisegundos (1 segundo)
			Thread.sleep(1000);
		}
		System.out.println("Booom!\n");
	}

}

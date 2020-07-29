public class BalancoTrimestral {
		public static void main (String [] args) {
			
			int gastosJaneiro = 15000;
			int gastosFevereiro = 23000;
			int gastosMarco = 17000;
			int gastoTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
			int mediaMensal = gastoTrimestre/3;
			
			System.out.println("O gasto Trimestral foi de " + gastoTrimestre);
			System.out.println("O gasto Trimestral foi de " + mediaMensal);
			
		}
}

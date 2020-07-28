
public class Caelum_Exercicio_5 {
	
	public static void main(String[] args) {
		
		double mediaMensal;
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		mediaMensal = gastosTrimestre / 3;
		
		System.out.println("Os gastos trimestrais foram de: " + gastosTrimestre);
		System.out.println("A média de gastos mensais foi de: "+ mediaMensal);
		
	}

}

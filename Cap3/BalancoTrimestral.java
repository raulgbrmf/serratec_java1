
public class BalancoTrimestral {

	public static void main(String[] args) {
		
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		int gastoTrimestral;
		double mediaMensal;

		gastoTrimestral = gastoJaneiro + gastoFevereiro + gastoMarco;
		mediaMensal = (double) gastoJaneiro + (double) gastoFevereiro + (double) gastoMarco / 3;
		
		System.out.println(gastoTrimestral);
		System.out.println("Valor da média mensal = "+ mediaMensal);
	}

}

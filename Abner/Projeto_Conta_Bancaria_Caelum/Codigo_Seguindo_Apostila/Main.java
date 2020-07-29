public class Main {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 20;
		d1.mes = 10;
		d1.ano = 2019;		
		
		Conta c1 = new Conta();		
		c1.titular = "Hugo";
		c1.numero = 123;
		c1.agencia = "45678-9";
		c1.saldo = 50.0;
		c1.dataAbertura = d1;	
		c1.deposita(200);
		c1.saca(20.00);
		
		System.out.println(c1.recuperaDadosImpressao() + "\n");		
		
	}
}
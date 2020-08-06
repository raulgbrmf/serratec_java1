
public class Main {

	public static void main(String[] args) {
		
		Conta outraconta = new Conta ();
		
		outraconta.setTitular("Mariana");
		outraconta.agencia = "3655-2";
		outraconta.saldo = 500;
		outraconta.datadeabertura = "22/07/2020";
		outraconta.numero = 250;
		
		// No Exercicio 1, ocorre um erro porque os atributos estão privados e não ficam visíveis para a Main.
		
		
		//Exercício 3
		Conta conta1 = new Conta ();
		outraconta.getTitular ("Mariana");
		System.out.println(outraconta.getTitular("Mariana"));
		
		outraconta.getAgencia("35655-2");
		System.out.println(outraconta.getAgencia("35655-2"));
		
		outraconta.getNumero(250);
		System.out.println(outraconta.getNumero(250));
		
		outraconta.getDatadeAbertura("22/07/2020");
		System.out.println(outraconta.getDatadeAbertura("22/07/2020"));
		
		outraconta.setSaldo(700);
		System.out.println(outraconta.setSaldo(700));
		
		//construtor
		String mariana = "Mariana";
		Conta c2 = new Conta (mariana);
		System.out.println(c2.getTitular("Mariana"));
		
		
		
			

}

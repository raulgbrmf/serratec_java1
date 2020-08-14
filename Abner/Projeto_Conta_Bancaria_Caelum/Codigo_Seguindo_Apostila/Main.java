public class Main {

	public static void main(String[] args) {
		
		Data d1 = new Data(11,02,2020);
		System.out.println(d1.getRetornarData());	
		
		Pessoa_Fisica pf = new Pessoa_Fisica("256566548569");
		System.out.println(pf.getCpf());
		
		Conta c1 = new Conta("Joao");		
		Conta c2 = new Conta();	
		System.out.println(c1.getId());
		System.out.println(c2.getId());
		
		
		
		/*c1.deposita(100);
		  c1.saca(20.00);
		
		System.out.println(c1.recuperaDadosImpressao() + "\n");*/		
		
	}
}
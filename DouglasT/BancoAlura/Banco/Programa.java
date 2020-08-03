package Banco;

public class Programa {

		public	static	void	main(String[]	args) {
			Conta	c1	=	new	Conta();
			c1.titular	=	"Hugo";
			c1.numero	=	123;
			c1.agencia	=	"45678-9";
			c1.saldo	=	50.0;
			c1.dataAbertura	=	"04/06/2015";
			
			System.out.println(c1.titular);
			System.out.println(c1.numero);
			System.out.println(c1.agencia);
			System.out.println("valor atual da conta : "+c1.saldo);
			System.out.println(c1.dataAbertura);
			
			c1.saca(10);
			System.out.println("Valor depois do saque : "+c1.saldo);
			
			c1.deposita(30);
			System.out.println("Valor depois do deposito : "+c1.saldo);
			
			c1.calculaRendimento();
			System.out.println("Rendimento Mensal : "+c1.calculaRendimento());
	}

}

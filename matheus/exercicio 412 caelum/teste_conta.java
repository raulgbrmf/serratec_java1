package exercicio412;

public class teste_conta {

	public static void main(String[] args) {
		conta c1 = new conta();
		data Data = new data();
		c1.titular="hugo";
		c1.numero=123;
		c1.agencia="45678-9";
		c1.saldo=50.0;
		
		Data.dia=04;
		Data.mes=06;
		Data.ano=2015;
		c1.dataAbertura=Data;
		
		
		c1.deposita(100.0);
		System.out.println("saldo atual: "+c1.saldo);
		System.out.println("rendimento mensal: "+c1.calculaRendimento());
		
		System.out.println(c1.recuperaDadosParaImpressao());
		
		//questão 5: aparece como diferente
		//questão 6: quando se referenciam as contas ela se tornam totalmente iguais. quando atribui os dois objeto se tornam objetos identicos
		conta c2 = new conta();
		c2.titular = "hugo";
		c2=c1;
		c2.saldo = 100;if (c1 == c2) {System.out.println("iguais");
		} else {System.out.println("diferentes");             }

		//questão 8 conta.saldo não faz sentido porque vc nao pode modificar uma classe diretamente atraves de uma main. apenas um objeto
		//conta.calculaRendimento não faz sentido vc nao chama a função de uma classe sem um objeto
		
		
	}

}

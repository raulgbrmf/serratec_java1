//Em nossa empresa, há tabelas com o quanto foi gasto em cada mês. 
//Para fechar o balanço do primeiro trimestre, 
//precisamos somar o gasto total. Sabendo que, em Janeiro, foram gastos R$ 15000,
//em Fevereiro, R$ 23000, e em Março, R$ 17000, 
//faça um programa que calcule e imprima o gasto total no trimestre.
public class BalancoTrimestral {

	public static void main(String[] args) {
		
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		int gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
		
		System.out.println("O gasto do trimestre foi: R$" + gastoTrimestre);


	}

}

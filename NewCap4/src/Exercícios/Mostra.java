package Exercícios;

public class Mostra {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Fiodor";
		f1.salario = 100;

		Funcionario f2 = new Funcionario();
		f2.nome = "Fiodor";
		f2.salario = 100;

		if (f1 == f2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
	}
//4 -  O operador == compara os endereços 
	//5 - Ocorre um erro pois não tem como comparar os 2 endereços
}

package br.com.caelum.contas.modelo;

/*
 * fonte: https://blog.caelum.com.br/facilitando-a-manutencao-dos-testes-ao-diminuir-o-acoplamento-com-o-codigo/
 * É fácil entender por que devemos diminuir o acoplamento entre classes: a 
 * alteração em um ponto do sistema pode propagar a necessidade de mudanças em 
 * outros. Dependendo do acoplamento, uma simples alteração exige um esforço 
 * enorme. Em alguns casos as mudanças não são feitas, e a funcionalidade é 
 * simplesmente descartada, devido a esse alto custo de manutenção deixado pelo 
 * acoplamento . Uma das tentativas para diminui-lo é tentar sempre programar 
 * voltado para interfaces e não para uma implementação e TDD pode ser utilizado
 *  para atingir esse objetivo.
 */

public interface Tributavel {

	public double getValorImposto();

	public String getTitular();

	public String getTipo();

}

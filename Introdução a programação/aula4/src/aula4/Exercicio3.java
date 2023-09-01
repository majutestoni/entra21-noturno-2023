package aula4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// 3. Faça um programa que pergunte o preço de três produtos e informe qual
		// produto você deve comprar, sabendo que a decisão é sempre o mais
		// barato.

		// entrada - preço de três produtos
		System.out.println("Informe o valor 1");
		double valorUm = entrada.nextDouble();
		System.out.println("Informe o valor 2");
		double valorDois = entrada.nextDouble();
		System.out.println("Informe o valor 3");
		double valorTres = entrada.nextDouble();

		String qualProdutoComprar = "";
		
		if(valorUm == valorDois || valorDois == valorTres 
				|| valorTres == valorUm) {
			System.out.println("valores invalidos");
		} else {
			// processo
			if (valorUm < valorDois && valorUm < valorTres) {
				qualProdutoComprar = "produto 1";
			} else if (valorDois < valorTres) {
				qualProdutoComprar = "produto 2";
			} else {
				qualProdutoComprar = "produto 3";
			}
			
			// saida
			System.out.println("O produto que deve comprar é " + qualProdutoComprar);
		}
		
		


		

	}

}

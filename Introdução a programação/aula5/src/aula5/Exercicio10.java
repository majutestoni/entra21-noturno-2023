package aula5;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * 10. Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere
		 * que a idade entre homens e mulheres sempre serão diferentes). Calcule e
		 * escreva a soma das idades do homem mais velho com a mulher mais nova, e o
		 * produto das idades do homem mais novo com a mulher mais velha.
		 */
		
		// entrada
		System.out.println("Escreva a idade de dois homens");
		int homemUm = entrada.nextInt();
		int homemDois = entrada.nextInt();
		
		System.out.println("Escreva a idade de duas mulheres");
		int mulherUm = entrada.nextInt();
		int mulherDois = entrada.nextInt();
		
		// soma das idades do homem mais velho com a mulher mais nova
		// produto das idades do homem mais novo com a mulher mais velha
		int homemVelho = 0;
		int homemNovo = 0;
		int mulherVelha = 0 ;
		int mulherNova = 0;
		int soma = 0;
		int produto = 0;
		
		// processo
		if(homemDois > homemUm) {
			homemVelho = homemDois;
			homemNovo = homemUm;
		} else {
			homemVelho = homemUm;
			homemNovo = homemDois;
		}
		if(mulherDois > mulherUm) {
			mulherVelha = mulherDois;
			mulherNova = mulherUm;
		} else {
			mulherVelha = mulherUm;
			mulherNova = mulherDois;
		}
		
		produto = homemNovo * mulherVelha;
		soma = homemVelho + mulherNova;
		
		if(homemUm > homemDois && mulherUm > mulherDois) { // caminho feliz
			soma = homemUm + mulherDois;
			produto = homemDois * mulherUm;
		} else if(homemDois > homemUm && mulherUm > mulherDois) {
			soma = homemDois + mulherDois;
			produto = homemUm * mulherUm;
		} else if(homemUm > homemDois && mulherDois > mulherUm) {
			soma = homemUm + mulherUm;
			produto = homemDois * mulherDois;
		} else {
			soma = homemDois + mulherUm;
			produto = homemUm * mulherDois;
		}
		
		// saida
		System.out.println("A soma " + soma);
		System.out.println("O produto " + produto);
		
		
		
		

	}

}

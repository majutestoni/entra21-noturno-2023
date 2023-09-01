package aula6;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 7. Descreva um algoritmo que leia 5 números inteiros e escreva, para cada
		// número lido, se o mesmo é par ou ímpar.

		System.out.println("Digite 5 numeros inteiros");
		for (int i = 0; i < 5; i++) {
			int num = scan.nextInt();
			if (num % 2 == 0) {
				System.out.println("O numero é par");
			} else {
				System.out.println("O numero é impar");
			}
		}
		
		System.out.println("Fim");

	}

}

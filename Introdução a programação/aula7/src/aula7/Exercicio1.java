package aula7;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Escreva um algoritmo que leia um número do
		// teclado até que encontre um número menor ou igual a 1.

		System.out.println("Digite um numero");
		int numero = scan.nextInt();
		while (numero > 1) {
			System.out.println("Digite um numero");
			numero = scan.nextInt();
		}
		
		System.out.println("fim");
	}

}

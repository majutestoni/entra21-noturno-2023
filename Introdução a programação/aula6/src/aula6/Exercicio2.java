package aula6;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Faça um programa, utilizando for, que peça para o usuário
		// inserir um número N e mostre na tela todos os números ímpares até N.
		
		// entrada
		System.out.println("Digite um numero n");
		int n = scan.nextInt();
		
		// processo
		for(int i = 0; i <= n; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		for(int i = 1; i <= n; i += 2) {
				System.out.println(i);
		}
		
	}

}

package aula7;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Faça um programa que peça ao usuário um número entre 12 e 20. Se a
		// pessoa digitar um número diferente, mostrar a mensagem "entrada inválida"
		//se solicitar o número novamente. Se digitar correto mostrar o número digitado.
		
		System.out.println("Insira entre 12 e 20");
		int numero = scan.nextInt();
		
		while(numero < 12 || numero > 20) {
			System.out.println("Entrada inválida");
			numero = scan.nextInt();
		}
		System.out.println(numero);
		System.out.println("Fim");
		
	}

}

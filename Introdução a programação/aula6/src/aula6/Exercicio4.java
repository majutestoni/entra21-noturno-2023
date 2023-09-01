package aula6;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 4. Crie um programa para ler 3 notas e mostrar a
		// média delas.

		// entrada
		double soma = 0;
		double entrada = 0;
		for (int i = 1; i < 4; i++) {
			System.out.println("Informe a nota");
			entrada = scan.nextDouble();
			soma += entrada; // soma = soma + entrada;
		}
		// processo
		double media = soma / 3;

		// saida
		System.out.println("A média é " + media);

	}

}

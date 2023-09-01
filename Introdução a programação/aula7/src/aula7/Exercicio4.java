package aula7;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Descreva um algoritmo que vá lendo a altura de pessoas até o usuário
		// entrar com o número 0
		// Calcule a média de altura das mesmas

		// entrada
		System.out.println("Pedindo altura");
		double altura = scan.nextDouble();

		// auxiliares
		double soma = 0;
		int quantasPessoas = 0; // contador
		while (altura != 0) {
			soma = soma + altura;
			quantasPessoas++;
			
			// if
			System.out.println("Pedindo altura");
			altura = scan.nextDouble();
			// contador
		}
		// media
		double media = soma / quantasPessoas;
		
		System.out.println("A média é " + media);
	}

}

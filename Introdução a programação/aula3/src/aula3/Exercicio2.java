package aula3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Faça um programa que peça um valor e mostre se ele é par ou impar
		
		// entrada
		System.out.println("Informe um valor");
		int numero = entrada.nextInt();
		
		
		// simbolos * / + - %
		
		int verifica = numero % 2; // valor do resto
		// processo
		if( verifica != 0) {
			System.out.println("O numero é impar");
		} else {
			System.out.println("O numero é par");
			
		}
		

	}

}

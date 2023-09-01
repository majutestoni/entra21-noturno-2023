package aula3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// . Faça um programa que peça um valor e mostre na tela se o valor é 
		// positivo ou negativo 
		
		// entrada - peça um valor
		System.out.println("Informe um valor");
		int valor = entrada.nextInt();
		
		

		// processo - positivo ou negativo 
		if(valor < 0) {
			System.out.println("O valor é negativo");
		} else if(valor > 0) {
			System.out.println("O valor é positivo");
		} else {
			System.out.println("Seu valor é zero");
		}
		
		
		

	}

}

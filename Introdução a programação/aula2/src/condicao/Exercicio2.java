package condicao;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Dados dois valores inteiros, escreva um algoritmo 
		//que informe se eles são múltiplos ou não
		
		// entrada = dois valores inteiros
		System.out.println("Informe valor 1");
		int valorUm = entrada.nextInt();
		System.out.println("Informe valor 2");
		int valorDois = entrada.nextInt();
		
		
		// processo = se eles são divisivies ou não
		if (valorUm % valorDois == 0) {
			// saida
			System.out.println("Valores são multiplos"); // verdadeiro
		} else {
			// saida
			System.out.println("Valores não são multiplos");
		}
			
		
		
	}

}

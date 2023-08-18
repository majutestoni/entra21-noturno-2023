package aula1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Objetivo:
		// Leia quatro valores inteiros A, B, C e D. 
		// A seguir, calcule e mostre a 
		// diferença do produto de A e B pelo produto de C e D 

		// Entrada
		System.out.println("Informe o valor A");
		int a = entrada.nextInt();
		System.out.println("Informe o valor B");
		int b = entrada.nextInt();	
		System.out.println("Informe o valor C");
		int c = entrada.nextInt();		
		System.out.println("Informe o valor D");
		int d = entrada.nextInt();
		
		// processo
		int produtoAB = a * b;
		int produtoCD = c * d;
		int diferenca = produtoAB - produtoCD;
		
		//saida
		System.out.println("A resposta é " + diferenca);
		

	}

}

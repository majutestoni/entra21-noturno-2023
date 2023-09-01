package aula6;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1. Faça um programa, utilizando for, em que o usuário tenha a opção de 
		// inserir dois valores e ocorra a subtração deles, deve ocorrer por 3 vezes.
	
		for(int i = 0; i < 3; i++) {
			// inserir dois valores e ocorra a subtração deles
			System.out.println("Informe dois valores");
			int valorUm = scan.nextInt();
			int valorDois = scan.nextInt();
			
			int calculo = valorUm - valorDois;
			System.out.println(calculo);
			
		}
	
	}

}

package condicao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Dados dois números inteiros descreva um algoritmo
		// para informar o maior valor entre eles.

		// entrada - dois números inteiros
		System.out.println("Informe o valor 1");
		int numeroUm = entrada.nextInt();
		System.out.println("Informe o valor dois");
		int numeroDois = entrada.nextInt();

		// processo - maior valor entre eles
		if (numeroUm > numeroDois) {
			// saida
			System.out.println("Numero 1 é maior");
		} else if(numeroUm < numeroDois) { // nunca utilizado sozinho
			System.out.println("Numero 2 é maior");
		} else {
			System.out.println("são iguais");
		}
		
		if(numeroUm > numeroDois) {System.out.println("Numero 1 é maior");}
		if(numeroUm < numeroDois) {System.out.println("Numero 2 é maior");}
		if(numeroUm == numeroDois) {System.out.println("são iguais");}

	}

}

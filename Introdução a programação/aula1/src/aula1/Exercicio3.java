package aula1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Entrada
		System.out.println("Informe o valor um");
		double valorUm = entrada.nextDouble();
		System.out.println("Informer o valor dois");
		double ValorDois = entrada.nextDouble();

		// processo
		double media = (valorUm * 6.5 + ValorDois * 3.5) / 10;
		
		// saida
		System.out.println("A media é " +  media);
	}
}

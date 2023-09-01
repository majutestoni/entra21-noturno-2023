package aula6;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 3. Crie 4 variáveis fora do For onde define se é m(mulher) e h(homem) e faça
		// dois contadores que verifique quantas mulheres e homens são
		// entrada
		System.out.println("Informe 4 valores, sendo m(mulher) e h(homem)");

		int contadorMulheres = 0;
		int contadorHomens = 0;

		for (int i = 0; i < 4; i++) {
			String val = scan.next();
			if (val.equals("m")) {
				contadorMulheres++;
			} else {
				contadorHomens++;
			}
		}
		
		// saida
		System.out.println("Mulheres: " + contadorMulheres);
		System.out.println("Homens: " + contadorHomens);

	}

}

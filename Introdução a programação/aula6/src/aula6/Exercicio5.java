package aula6;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 5. Ler um valor inteiro (aceitar somente valores entre 1 e 10)
		// e escrever a tabuada de 1 a 10 do valor lido.

		// entrada
		System.out.println("Informe um valor");
		int num = scan.nextInt();
		int aux = 0;
		int op = 0;
		// para o for
		int i = 1;
		if (num < 1 || num > 10) {
			System.out.println("Valor inválido");
			i = 11;
		}
		for (; i <= 10; i++) {
			op = num * i;
			System.out.println(op);
		}

	}

}

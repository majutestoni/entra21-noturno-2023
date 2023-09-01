package aula3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// 5. Faça um programa que recebe a nota do aluno e retorna:
		// A mensagem “Aprovado”, se a média alcançada for maior ou igual a
		// sete;
		// A mensagem “Aprovado com Distinção”, se a média for igual a dez;
		// A mensagem “Reprovado” se a média for menor de do que sete;

		// entrada
		System.out.println("Informe a sua média");
		double media = entrada.nextDouble();
		System.out.println("Informe sua frequencia");
		int frequencia = entrada.nextInt();

		// processo
		if (media < 7 || frequencia < 75 || media > 10) {
			System.out.println("Reprovado");
		} else if (media == 10) {
			System.out.println("Aprovado com distincao");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		}

	}

}

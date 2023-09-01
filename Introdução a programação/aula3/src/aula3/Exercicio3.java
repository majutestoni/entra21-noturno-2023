package aula3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Faça um programa que pergunte em que turno você estuda. Peça para
		// digitar M-matutino ou V-vespertino ou N-noturno. Imprima a mensagem
		// “Bom dia!” ou “Boa Noite” ou “Valor inválido”, conforme o caso.

		// entrada - pergunte em que turno você estuda

		System.out.println("Em qual turno voce estuda?");
		System.out.println("Digite M-matutino, V-vespertino e N-noturno");
		String turno = entrada.next();

		if (turno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia");
		} else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde");
		} else if (turno.equalsIgnoreCase("n")) {
			System.out.println("Boa noite");
		} else {
			System.out.println("Valor invalido");
		}
	}
}

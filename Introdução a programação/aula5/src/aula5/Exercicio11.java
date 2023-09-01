package aula5;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * 11. Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um
		 * algoritmo para ler as idades dos filhos e exibir quem é o mais velho, o irmão
		 * do meio e o caçula da família. Suponha que não haja empates.
		 */
		// entrada
		System.out.println("Digite a idade dos tres filhos");
		int idadeMarquinhos = entrada.nextInt();
		int idadeZezinho = entrada.nextInt();
		int idadeLuluzinha = entrada.nextInt();

		String irmaoMaisVelho = "";
		String irmaoDoMeio = "";
		String irmaoMaisNovo = "";

		// entrada
		if (idadeMarquinhos > idadeZezinho && idadeMarquinhos > idadeLuluzinha) {
			if (idadeZezinho > idadeLuluzinha) {
				irmaoDoMeio = "Zezinho";
				irmaoMaisNovo = "Luluzinha";
			} else {
				irmaoDoMeio = "Luluzinha";
				irmaoMaisNovo = "Zezinho";
			}
			irmaoMaisVelho = "Marquinhos";
		} else if (idadeZezinho > idadeLuluzinha) {
			if (idadeMarquinhos > idadeLuluzinha) {
				irmaoDoMeio = "Marquinho";
				irmaoMaisNovo = "Luluzinha";
			} else {
				irmaoMaisNovo = "Marquinho";
				irmaoDoMeio = "Luluzinha";
			}
			irmaoMaisVelho = "Zezinho";
		} else {
			if (idadeMarquinhos > idadeZezinho) {
				irmaoDoMeio = "Marquinho";
				irmaoMaisNovo = "Zezinho";
			} else {
				irmaoDoMeio = "Zezinho";
				irmaoMaisNovo = "Marquinho";
			}
			irmaoMaisVelho = "Luluzinha";
		}

		// saida
		System.out.println("Irmão mais velho " + irmaoMaisVelho);
		System.out.println("Irmão do meio " + irmaoDoMeio);
		System.out.println("Irmão mais novo " + irmaoMaisNovo);

	}

}

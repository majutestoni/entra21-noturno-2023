package aula10;

public class Exercicio8 {

	public static void main(String[] args) {
		/*
		 * 8. Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor
		 * de 12 posições do tipo real.
		 * 
		 * Imprima quais valores desses informados são maiores que a média dos valores.
		 */

		float[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		float soma = 0;
		// int i = 0
		for (int indice = 0; indice < vetor.length; indice++) {
			soma = soma + vetor[indice];
		}

		float media = soma / vetor.length;

		String valoresMaiorQueAMedia = "";

		for (int indice = 0; indice < vetor.length; indice++) {

			// maiores que a média dos valores.
			if (vetor[indice] > media) {
				valoresMaiorQueAMedia += vetor[indice] + ", ";
			}
		}

		System.out.println("A média: " + media);
		System.out.println("Valores maior que a média: " + valoresMaiorQueAMedia);

	}

}

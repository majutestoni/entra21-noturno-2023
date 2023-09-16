package aula10;

public class Exercicio9 {
	public static void main(String[] args) {
		/*
		 * 9. Faça um programa para ler os valores de dois vetores de 
		 * inteiros, cada um
		 * contendo 10 elementos.
		 * 
		 * Crie um terceiro vetor em que cada elemento é a soma dos 
		 * valores contidos nas
		 * posições respectivas dos vetores originais.
		 * 
		 * Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = 
		 * [2,7,9]. Exiba, ao
		 * final, os três vetores na tela.
		 */
		
		int tamanho = 3; // alterar para 10
		int[] vetorUm = new int[tamanho];
		int[] vetorDois = new int[tamanho];
		int[] vetorTres = new int[tamanho];
		// vetor1 = [1,2,3]
		vetorUm[0] = 1;,
		
		
		
		vetorUm[1] = 2;
		vetorUm[2] = 3;
		
		// vetor2 = [1,5,6]
		vetorDois[0] = 1;
		vetorDois[1] = 5;
		vetorDois[2] = 6;
		
		for(int i = 0; i < tamanho; i++) {
			vetorTres[i] = vetorUm[i] + vetorDois[i];
		}
		
		
		for(int i = 0; i < tamanho; i++) {
			System.out.println(vetorTres[i]);
		}
	
		

		
		
		// final, os três vetores na tela.
		
		
		
		
		
	}
}

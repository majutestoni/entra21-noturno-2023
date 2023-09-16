package aula10;

public class Exercicio2 {

	public static void main(String[] args) {
		// 3. Criem uma matriz de 5 linhas e 1 coluna,
		// somem todos os valores

		// Posteriormente verifique a média e imprima
		// somente os valores que estão acima dela
		
		int[][] matriz = new int[5][1];
		
		// referente a quantidade de linhas
		System.out.println("matriz.length: " + matriz.length);
		// referente a quantidade de colunas
		System.out.println("matriz[0].length: "+ matriz[0].length);
		
		matriz[0][0] = 100;
		matriz[1][0] = 20;
		matriz[2][0] = 30;
		matriz[3][0] = 40;
		matriz[4][0] = 50;
		
		int soma = 0;
		
		for(int linha = 0; linha < 5; linha++) {
			soma = soma + matriz[linha][0];
		}
		
		int media = soma / 5; // 5 quantidade total de elementos
		
		System.out.println(soma);
		System.out.println("media: " + media);
		
		for(int linha = 0; linha < matriz.length; linha++) {
			if(matriz[linha][0] > media) {
				System.out.println(matriz[linha][0]);
			}
		}
		
	}

}

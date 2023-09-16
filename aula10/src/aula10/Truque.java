package aula10;

import java.util.Random;

public class Truque {

	public static void main(String[] args) {
		Random generator = new Random();
		
		int[][] matrizR = new int[2][2];
		
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
			 matrizR[linha][coluna] = generator.nextInt(10);
			}
		}
		
		int[][] matriz = { 
				{ 20, 50, 30 }, 
				{ 100, 60, 80 } 
				};
		
		
		
		
		for (int i = 0; i < matrizR.length; i++) {
			for (int j = 0; j < matrizR[i].length; j++) {
				System.out.print(matrizR[i][j] + ", ");
			}
			System.out.println();
		}
	}

}

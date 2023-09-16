package aula10;

public class matriz {

	public static void main(String[] args) {

		int quantDeLinhas = 2;
		int quantDeColunas = 5;
		int[][] matriz = new int[quantDeLinhas][quantDeColunas];

		matriz[0][0] = 10;
		matriz[0][1] = 20;
		matriz[0][2] = 30;
		matriz[0][3] = 40;
		matriz[0][4] = 50;
		matriz[1][0] = 60;
		matriz[1][1] = 70;
		matriz[1][2] = 80;
		matriz[1][3] = 90;
		matriz[1][4] = 100;

		for (int linha = 0; linha < quantDeLinhas; linha++) {

			for (int coluna = 0; coluna < quantDeColunas; coluna++) {
				System.out.println(matriz[linha][coluna]);
			}

		}

	}

}

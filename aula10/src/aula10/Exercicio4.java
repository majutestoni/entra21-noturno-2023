package aula10;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * . Crie uma matriz 3 linhas e 3 colunas, preencha a mesma de A até I,
		 * posteriormente imprima a matriz.
		 */
		
		
		int quantDeLinhas = 3;
		int quantDeColunas = 3;
		
		char[][] matriz = new char[3][3];
		
		matriz[0][0] = 'A';
		matriz[0][1] = 'B';
		matriz[0][2] = 'C';
		matriz[1][0] = 'D';
		matriz[1][1] = 'E';
		matriz[1][2] = 'F';
		matriz[2][0] = 'G';
		matriz[2][1] = 'H';
		matriz[2][2] = 'I';
		
		for (int linha = 0; linha < quantDeLinhas; linha++) {

			for (int coluna = 0; coluna < quantDeColunas; coluna++) {
				System.out.print(matriz[linha][coluna] + ", ");
			}
			System.out.println();

		}
	}

}

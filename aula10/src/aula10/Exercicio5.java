package aula10;

public interface Exercicio5 {
	
	public static void main(String[] args) {
		char[][] matriz = new char[4][4];
		
		matriz[0][0] = '*';
		matriz[0][1] = '*';
		matriz[0][2] = '*';
		matriz[0][3] = '*';
		matriz[1][0] = '*';
		matriz[1][1] = '*';
		matriz[1][2] = '*';
		matriz[1][3] = '*';
		matriz[2][0] = '*';
		matriz[2][1] = '*';
		matriz[2][2] = '*';
		matriz[2][3] = '*';
		matriz[3][0] = '*';
		matriz[3][1] = '*';
		matriz[3][2] = '*';
		matriz[3][3] = '*';
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}

}

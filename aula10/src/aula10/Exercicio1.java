package aula10;

public class Exercicio1 {

	public static void main(String[] args) {
		// 1. Criar uma matriz com 1 linha e 10 colunas, na mesma
		// verifique quantos
		// valores são par e quantos valores são impar e calcule a
		// média dos valores

		// 2. Agora criem uma segunda linha e novamente somem todas
		// as colunas, por fim somem os valores da linho 0 e da
		// linha 1

		int[][] matriz = new int[2][5];

		matriz[0][0] = 10;
		matriz[0][1] = 20;
		matriz[0][2] = 33;
		matriz[0][3] = 40;
		matriz[0][4] = 50;
		matriz[1][0] = 30;
		matriz[1][1] = 20;
		matriz[1][2] = 33;
		matriz[1][3] = 40;
		matriz[1][4] = 50;

		int contPar = 0;
		int contImpar = 0;
		int soma = 0;
		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			soma = soma + matriz[0][coluna];

			if (matriz[0][coluna] % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
		}
		
		int somaMelhor = 0;
		
		for(int linha = 0; linha < 2; linha++) {
			System.out.println(matriz[linha][0]);
			  
		}


		//System.out.println("Soma: " + somaMelhor);
		//System.out.println("Pares: " + contPar);
		//System.out.println("Impares: " + contImpar);
		//System.out.println("Média: " + (soma / matriz[0].length));

	}

}

package aula10;

public class Exemplo {
	public static void main(String[] args) {

		String[][] matriz = new String[3][2];

		// vetor[0] = teste
		matriz[0][0] = "Doritos";
		matriz[0][1] = "3";
		matriz[1][0] = "Chocolate";
		matriz[1][1] = "9";
		matriz[2][0] = "Sushi";
		matriz[2][1] = "7";

		int[][] tabela = new int[4][3];

		tabela[0][0] = 5;
		tabela[0][1] = 1;
		tabela[0][2] = 2;
		tabela[1][0] = 10;
		tabela[1][1] = 85;
		tabela[1][2] = 7;
		tabela[2][0] = 15;
		tabela[2][1] = 11;
		tabela[2][2] = 12;
		tabela[3][0] = 20;
		tabela[3][1] = 16;
		tabela[3][2] = 17;
		
		System.out.println(tabela[1][1]);
		
		// montar tabela com dois 
		// colunas e 3 linhas
		// altura e numero da sorte
		
		double[][] teste = new double[3][2];
		
		teste[0][0] = 1.74;
		teste[0][1] = 25;
		teste[1][0] = 1.70;
		teste[1][1] = 17;
		teste[2][0] = 1.64;
		teste[2][1] = 20;
		
		System.out.println("bruna: " + teste[2][0]);
		
		
		double soma = teste[0][0] + teste[1][0] + teste[2][0];
		
		System.out.println("média: " + (soma/3));
		

	}
}

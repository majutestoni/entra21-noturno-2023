package aula6;

public class Exercicio8 {
	
	public static void main(String[] args) {
		// 8. Descreva um algoritmo que calcule e escreva a soma dos números 
		// pares e a soma dos números ímpares entre 1 e 1000. 
		
		
		// Objetivo - soma dos números pares e a soma dos números ímpares
		
		int somarPar = 0;
		int somaImpar = 0;
		int aux = 0;

		// processo
		for(int i = 1; i <= 1000; i++) { // i = i +1
			if( i % 2 == 0) { // verifica se é par
				// realiza soma par
				somarPar =  somarPar + i ;
				// somaPar += i;
			
				
			} else {
				// realiza soma impar
				somaImpar = somaImpar + i;
			}
			
		}
		
		// saida
		System.out.println("Soma par " + somarPar);
		System.out.println("Soma impar " + somaImpar);
	}

}

package aula6;

public class Exercicio1 {
	public static void main(String[] args) {
		// 1. Escreva um algoritmo printe o número 0, 2, 4, 6 ... até o número 20 
		
		// Maria
		for(int i = 0; i < 21; i += 2) {  // i = i +2
			System.out.println(i);
		}
		
		// Guilherme
		// contador
		int i = 0;
		for(; i <= 20;) {
			System.out.println(i);
			
			i = i + 2;
		}
		
		// Eduardo
		for(int j = 0; j < 21; j ++) {
			if(j % 2 ==0) {
				System.out.println(j);
			}
		}

	}

}

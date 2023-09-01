package aula4;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//2. Para doar sangue é necessário ter entre 18 e 67 anos. Faça um 
		// aplicativo que pergunte a idade de uma pessoa e diga se ela pode doar 
		// sangue ou não. Use alguns dos operadores lógicos OU (||) e E (&&).
		
		// entrada
		System.out.println("Informe sua idade");
		int idade = entrada.nextInt();
		
		// processo
		if(idade >= 18 && idade <= 67) {
			
			// saida
			System.out.println("não pode doar");
		} else {
			// saida
			System.out.println("pode doar");

		}

		
		
	}

}

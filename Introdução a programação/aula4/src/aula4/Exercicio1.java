package aula4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// 1. Faça um programa que verifique (usando if e else) se uma letra digitada 
		// é vogal ou consoante. 
		
		// entrada
		System.out.println("Informe uma letra");
		String letra = entrada.next();
		
		// letra minuscula
		letra = letra.toLowerCase();
		
		// caixa alta
		letra.toUpperCase();
		
		// processo - se uma letra digitada é vogal ou consoante.
		if(letra.equals("a") || letra.equals("e") ||letra.equals("i") 
				|| letra.equals("o") || letra.equals("u")) {
			System.out.println("É uma vogal");
		} else {
			System.out.println("É uma consoante");
		}
		

	}

}

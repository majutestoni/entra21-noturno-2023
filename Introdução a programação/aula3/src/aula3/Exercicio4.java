package aula3;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		// Faça um programa que verifique (usando if e else) se uma letra digitada 
		// é “F” ou “M”. Conforme a letra escrever: F – Feminino, M- Masculino, 
		// Sexo inválido. 

		
		Scanner entrada = new Scanner(System.in);
		
		// entrada 
		System.out.println("Digite f para feminino e m para masculino");
		String inf = entrada.next();
		inf = inf.toUpperCase();
		
		// maria = MARIA
		
		// processo
		if(inf.equals("F")) {
			// saida
			System.out.println("feminino");
		} else if(inf.equals("M")) {
			// saida
			System.out.println("masculino");
		} else {
			// saida
			System.out.println("invalido");
		}
		
	}

}

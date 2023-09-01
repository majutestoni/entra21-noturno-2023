package condicao;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Faça um algoritmo que imprima "nome correto" caso o nome inserido 
		// seja o seu 
		
		// entrada
		System.out.println("Informe o nome");
		String primeiroNome = entrada.nextLine();
		System.out.println("Informe o segundo nome");
		String segundoNome = "maria"; // entrada.nextLine();
		
		// processo
		// equalsIgnoreCase => Ignora se é caixa alta ou caixa baixa
		if(primeiroNome.equalsIgnoreCase(segundoNome)) {
			System.out.println("Nomes iguais");
		} else {
			System.out.println("Nomes diferentes");
		}
		
		if(!primeiroNome.equalsIgnoreCase(segundoNome)) {
			System.out.println("Nomes diferentes");
		}
		
	}

}

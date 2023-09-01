package aula8;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Faça um programa que leia um nome de usuário e a sua senha e não aceite a 
		//senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a 
		//pedir as informações, caso seja certo, de os parabéns e encerre o programa. 
		
		// entrada - leia um nome de usuário e a sua senha
		System.out.println("Informe o usuario");
		String usuario = entrada.next();
		
		System.out.println("Informe a senha");
		String senha = entrada.next();
		// senha igual ao nome do usuário - NÃO PODE
		while(usuario.equals(senha)) {
			System.out.println("Entrada inválida");
			System.out.println("Informe o usuario");
			 usuario = entrada.next();
			
			System.out.println("Informe a senha");
     		 senha = entrada.next();
		}
	
		// saida
		System.out.println("Parabens, usuario criado");
		
	}

}

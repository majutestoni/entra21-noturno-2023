package aula4;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//. Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, 
		//escrever uma 
		// mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS 
		//IRMÃOS. 
		//Considere que eles são GÊMEOS se dois deles possuem a mesma 
		//idade e o outro 
		//diferente dos demais, e apenas irmãos se todas as idades forem 
		//diferentes.
		
		// entrada
		System.out.println("Digite o ano dos tres filhos");
		int anoUm = entrada.nextInt();
		int idadeDois = entrada.nextInt();
		int idadeTres = entrada.nextInt();
		
		// descobre idade
		int idadeUm = 2023 - anoUm;
		int valorDois = 2023 - idadeDois;

		// caso seja valor invalido
		if((idadeUm > -1 && idadeUm < 20) || (valorDois> -1 && valorDois < 20)) {
			
		}
		
		// processo
		if(anoUm == idadeDois && idadeDois == idadeTres) {
			System.out.println("trigemeos");
		} else if(anoUm == idadeTres || idadeDois == idadeTres || anoUm == idadeDois) {
			System.out.println("gemeos");
		} else {
			System.out.println("irmaos");
		}

	}

}

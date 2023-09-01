package aula4;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//5. Dada a idade de um nadador descreva um algoritmo que o classifique 
		// em uma das 
		// seguintes categorias: 
		// pré-mirim 5 - 7 anos 
		// mirim 8 - 10 anos 
		// infantil 11 - 13 anos 
		// infanto-juvenil 14 - 17 anos 
		// juvenil 18 - 20 anos 
		//adulto maiores de 21 anos
		
		// entrada
		System.out.println("Informe a idade");
		int idade = entrada.nextInt();
		
		// processo
		 if(idade >= 21) {
			 System.out.println("adulto");
		 } else if((idade <= 20) && (idade >= 18)) {
			 System.out.println("juvenil");
		 } else if((idade <= 17) && (idade >= 14)) {
			 System.out.println("infanto-juvenil");
		 }else if((idade <= 13) && (idade >= 11)) {
			 System.out.println("infantil");
		 }else if((idade <= 10) && (idade >= 8)) {
			 System.out.println("mirim");
		 }else if((idade <= 7) && (idade >= 5)) {
			 System.out.println("pré-mirim");
		 } else {
			 System.out.println("Não pode nadar");
		 }
		
	}
}

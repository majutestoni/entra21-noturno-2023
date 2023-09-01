package aula7;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("teste");
		char entrada = scan.next().charAt(0);
		int num = 0;
		int auxiliar = 0;
		
		
		while(entrada == 's') {
			System.out.println("Entrada usuario");
			num = scan.nextInt();
			if(auxiliar > num) {
				auxiliar = num;
			} else {
				auxiliar = num;
			}
			System.out.println("teste");
			entrada = scan.next().charAt(0);	
		}
	}

}

package condicao;

import java.util.Scanner;

public class NumeroPar {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um valor");
		int valor = entrada.nextInt();
		
		if(valor % 2 != 0) {
			System.out.println("O numero é par");
		} 
	}

}

package aula5;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * 9. Escreva um algoritmo em que o usuário entra com um número. Depois ele
		 * escolhe a operação que vai ser feita com esse número Caso ele escolha a
		 * operação 1 Modifique a variável do número entrado e some 10 ao número
		 * original Caso ele escolha a operação 2 Modifique a variável do número entrado
		 * e subtraia 10 do número original Caso ele escolha a operação 3 Modifique a
		 * variável do número entrado e multiplique 10 ao número original Caso ele
		 * escolha a operação 4 Modifique a variável do número entrado e divida 10 do
		 * número original
		 */

		// entrada
		System.out.println("Digite um valor");
		double valor = entrada.nextDouble();

		System.out.println("Escolha uma das quatro opções");
		int operacao = entrada.nextInt();

		double resposta = 0;
		boolean valida = true;

		switch (operacao) {
		case 1:
			resposta = valor + 10;
			break;
		case 2:
			resposta = valor - 10;
			break;
		case 3:
			resposta = valor * 10;
			break;
		case 4:
			resposta = valor / 10;
			break;

		default:
			valida = false;
			System.out.println("Operação invalida");
			break;
		}

		if(valida == true) {
			System.out.println("Valor chegado " + resposta);
		}


	}

}

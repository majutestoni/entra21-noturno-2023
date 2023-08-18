package aula1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// importar
		// Scanner - Entrada de dados que o usuario coloca
		Scanner entrada = new Scanner(System.in);

		DecimalFormat formatar = new DecimalFormat("0.00");

		// definir variavel constante
		final double pi = 3.14;

		// perguntar ao usuario o valor do raio
		System.out.println("Qual é o raio?");
		double raio = entrada.nextDouble();

		// processo
		double resultado = pi * (raio * raio);

		// saida
		System.out.println("O resultado é " + formatar.format(resultado));

	}

}

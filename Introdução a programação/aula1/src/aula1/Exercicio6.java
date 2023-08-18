package aula1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");

		/*
		 * Escreva um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcule o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */

		// entrada
		System.out.println("Informe o cadastro");
		int cadastro = entrada.nextInt();
		System.out.println("Informe o numero de horas");
		int numeroHoras = entrada.nextInt();
		System.out.println("Informe o valor hora");
		double valorHora = entrada.nextDouble();

		// processo
		double salario = (numeroHoras * valorHora);

		// saida
		System.out.println("O salario do funcionario " + cadastro + " é " + formatar.format(salario));
	}

}

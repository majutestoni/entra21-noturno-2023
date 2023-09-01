package aula2;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Escreva um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
		 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
		 * (pi = 3.14159). c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
		 * e B.
		 */

		// entrada
		System.out.println("Informe o valor de A");
		final double a = entrada.nextDouble();
		System.out.println("Informe o valor de B");
		final double b = entrada.nextDouble();
		System.out.println("Informe o valor de C");
		final double c = entrada.nextDouble();
		final float pi = 3.14159f;

		// processo
		double areaTriangulo = (a * c) / 2;
		double areaCirculo = pi * (c * c);
		double areaTrapezio = ((a + b) * c) / 2;
		double areaQuadrado = b * b;
		double areaRetangulo = a * b;

		// saida
		System.out.println("area do triangulo é igual a " + areaTriangulo);
		System.out.println("area do circulo é " + areaCirculo);
		System.out.println("area do trapezio " + areaTrapezio);
		System.out.println("area do quadrado " + areaQuadrado);
		System.out.println("area do retangulo " + areaRetangulo);

	}

}

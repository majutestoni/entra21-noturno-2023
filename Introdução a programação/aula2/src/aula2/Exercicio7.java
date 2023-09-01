package aula2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o 
		 * total de vendas efetuadas por ele no mês (em dinheiro). Sabendo 
		 * que este vendedor ganha 15% de comissão sobre suas vendas 
		 * efetuadas, informar o total a receber no final do mês, com duas 
		 * casas decimais.
		 */
		
		// entrada - leia o nome de um vendedor, salário fixo, total de vendas(em dinheiro)
		System.out.println("Nome do vendedor");
		String nome = entrada.nextLine();
		System.out.println("Salario fixo");
		double salarioFixo = entrada.nextDouble();
		System.out.println("Total de vendas");
		double totalVendas = entrada.nextDouble();
		
		// processo - ganha 15% de comissão sobre suas vendas efetuadas
		double comissao = 0.15 * totalVendas;
		double salarioFinal = comissao + salarioFixo;
		
		System.out.println("O funcionario " + nome + " e o salario total é "
		+ (comissao + salarioFixo));
		// Da linha 29 a 33 é a mesma coisa
		System.out.println("O funcionario " + nome + " e o salario total é "
		+ salarioFinal);
		
		
		
		
		

	}

}

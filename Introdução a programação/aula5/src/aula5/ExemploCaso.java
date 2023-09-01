package aula5;

import java.util.Scanner;

public class ExemploCaso {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Caso tenha uma escola de fundamental II e queira separar
		// os alunos por sala

		System.out.println("Sala");
		int salaAluno = entrada.nextInt();

		if (salaAluno == 6) {
			System.out.println("sexto ano");
		} else if (salaAluno == 7) {
			System.out.println("setimo ano");
		} else if (salaAluno == 8) {
			System.out.println("oitavo ano");
		} else if (salaAluno == 9) {// não tenho && nem ||
			System.out.println("nono ano");
		}

		switch (salaAluno) {
		case 7:
			System.out.println("setimo ano");
			break;
		case 6:
			System.out.println("sexto ano");
			break;
		case 8:
			System.out.println("oitavo ano");
			break;
		case 9:
			System.out.println("nono ano");
			break;
		default:
			System.out.println("Valor invalido");
			break;
		}

	}

}

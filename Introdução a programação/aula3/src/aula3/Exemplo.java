package aula3;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// se é possivel ter uma cnh
		// é preciso ter mais de 18 anos
		// ser brasileiro

		int idade = 16;
		String nacionalidade = "brasileiro";

		// errado
		if (idade >= 18) {
			if (nacionalidade.equals("brasileiro")) {
				//System.out.println("É possivel ter a cnh!");
			} else {
				System.out.println("Não é possivel ter a cnh");
			}
		} else {
			System.out.println("Não é possivel ter a cnh");
		}

		//certo
		if (idade >= 18 && nacionalidade.equals("brasileiro")) {
			//System.out.println("Não é possivel ter a cnh");
		} else {
			System.out.println("Não é possivel ter a cnh");
		}
		
		boolean permissaoJudicial = false;
		
		if(permissaoJudicial == true || idade >= 18) {
			System.out.println("É possivel ter a cnh!");
		}

	}

}

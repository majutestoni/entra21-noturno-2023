package exPessoa;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Brasil", "SC", "Blumenau", "Rua Joinville", "150");

        Aluno aluno1 = new Aluno("aluno1", "47 9 9999-9999", endereco, "aluno1@gmail.com", "Ensino medio", true);
        Aluno aluno2 = new Aluno("aluno2", "47 9 9999-9999", endereco, "aluno2@gmail.com", "Ensino medio", false);
        System.out.println(aluno1.toString());

        aluno1.pagar();

        System.out.println(aluno1.toString());

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);


        ArrayList<String> habilidades = new ArrayList<>();
        habilidades.add("Java");
        habilidades.add("POO");
        Instrutor instrutor = new Instrutor("instrutor1","47 9 9999-9999", endereco, "aluno1@gmail.com", "Programação",alunos ,habilidades);

        System.out.println(instrutor.toString());
        instrutor.adicionarAluno(aluno2);
        instrutor.adicionaEspecializacao("Banco de dados");

        System.out.println(instrutor.toString());


    }
}

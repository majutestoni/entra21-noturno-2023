package exPessoa;

import java.util.ArrayList;

public class Instrutor extends Pessoa {

    private String especializao;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    private ArrayList<String> listaEspecializacao;

    public Instrutor(String nome, String telefone, Endereco endereco, String email,
                     String especializao, ArrayList<Aluno> alunos, ArrayList<String> listaEspecializacao) {
        super(nome, telefone, endereco, email);

        setEspecializao(especializao);
        setAlunos(alunos);
        setListaEspecializacao(listaEspecializacao);

    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void adicionaEspecializacao(String especializao) {
        this.listaEspecializacao.add(especializao);
    }


    public String getEspecializao() {
        return especializao;
    }

    public void setEspecializao(String especializao) {
        this.especializao = especializao;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<String> getListaEspecializacao() {
        return listaEspecializacao;
    }

    public void setListaEspecializacao(ArrayList<String> listaEspecializacao) {
        this.listaEspecializacao = listaEspecializacao;
    }

    @Override
    public String toString() {
        return  super.toString() + ", Instrutor{" +
                "especializao='" + especializao + '\'' +
                ", alunos=" + alunos +
                ", listaEspecializacao=" + listaEspecializacao +
                '}';
    }
}

package exFuncionario;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empregado extends Funcionario {
    private String idSindicato;
    private Gerente gerente;

    public Empregado(String id, Endereco endereco, LocalDate dataNascimento, String nome, double salario, LocalDate dataIngresso, ArrayList<String> habilidades,
                     String idSindicato, Gerente gerente) {
        super(id, endereco, dataNascimento, nome, salario, dataIngresso, habilidades);

        setIdSindicato(idSindicato);
        setGerente(gerente);
    }

    public void sairDoSindicato() {
        this.idSindicato = null;
    }

    public double comissao(double valor) {

        valor = valor * 0.05;

        setSalario(getSalario() + valor);

        return getSalario();

    }


    public String getIdSindicato() {
        return idSindicato;
    }

    public void setIdSindicato(String idSindicato) {
        this.idSindicato = idSindicato;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}

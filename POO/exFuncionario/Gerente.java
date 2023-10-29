package exFuncionario;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gerente extends Funcionario {

    private String idGerente;

    public Gerente(String id, Endereco endereco, LocalDate dataNascimento, String nome, double salario, LocalDate dataIngresso, ArrayList<String> habilidades
            , String idGerente) {
        super(id, endereco, dataNascimento, nome, salario, dataIngresso, habilidades);
        setIdGerente(idGerente);
    }

    public void demitirEmpregado(Empregado empregado) {
        if(empregado.getGerente().idGerente.equals(this.idGerente)){
            empregado.setId("DEMITIDO");
        } else {
            throw new IllegalArgumentException("O gerente não é o gerente do Funcionario");
        }

    }


    public String getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(String idGerente) {
        this.idGerente = idGerente;
    }

    @Override
    public String toString() {
        return super.toString() + "Gerente{" +
                "idGerente='" + idGerente + '\'' +
                '}';
    }
}

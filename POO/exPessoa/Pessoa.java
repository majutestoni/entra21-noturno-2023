package exPessoa;

public abstract class Pessoa {
    private String nome;
    private String telefone;
    private Endereco endereco;
    private String email;

    public Pessoa(String nome, String telefone, Endereco endereco, String email) {
        setNome(nome);
        setTelefone(telefone);
        setEndereco(endereco);
        setEmail(email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco=" + endereco +
                ", email='" + email + '\'' +
                '}';
    }
}

package exPessoa;

public class Aluno extends Pessoa {
    private String tipoDeAssociacao;
    private boolean pagamentoEmAtraso;

    public Aluno(String nome, String telefone, Endereco endereco, String email,
                 String tipoDeAssociacao, boolean pagamentoEmAtraso) {
        super(nome, telefone, endereco, email);

        setTipoDeAssociacao(tipoDeAssociacao);
        setPagamentoEmAtraso(pagamentoEmAtraso);
    }

    public void pagar(){
        this.pagamentoEmAtraso = false;
    }


    public String getTipoDeAssociacao() {
        return tipoDeAssociacao;
    }

    public void setTipoDeAssociacao(String tipoDeAssociacao) {
        this.tipoDeAssociacao = tipoDeAssociacao;
    }

    public boolean isPagamentoEmAtraso() {
        return pagamentoEmAtraso;
    }

    public void setPagamentoEmAtraso(boolean pagamentoEmAtraso) {
        this.pagamentoEmAtraso = pagamentoEmAtraso;
    }

    @Override
    public String toString() {
        return  super.toString()+ ", Aluno{" +
                "tipoDeAssociacao='" + tipoDeAssociacao + '\'' +
                ", pagamentoEmAtraso=" + pagamentoEmAtraso +
                '}';
    }
}

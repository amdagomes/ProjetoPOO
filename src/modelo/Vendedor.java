package modelo;

public class Vendedor extends Funcionario {

    private float comissao;

    public Vendedor(float comissao, Servico[] servico, String nome, String email, String cpf, String rg, String curso, String escolaridade, String reservista, String telefone, String cargo, Endereco endereco) {
        super(nome, email, cpf, rg, curso, escolaridade, reservista, telefone, cargo, endereco);
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
}

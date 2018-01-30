package modelo;

import modelo.Servico;

public class Vendedor extends Funcionario {

    private float comissao;
    private Servico servico[];

    public Vendedor(float comissao, String nome, String email, String cpf, String rg, String curso, String escolaridade, String reservista, String telefone, String bairro, String cidade, String cep, String logradouro, String tipoDeLogradouro, int numero, String complemento, String pontoDeReferencia, String cargo) {
        super(nome, email, cpf, rg, curso, escolaridade, reservista, telefone, bairro, cidade, cep, logradouro, tipoDeLogradouro, numero, complemento, pontoDeReferencia, cargo);
        this.comissao = comissao;
        servico = new Servico[10];
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public Servico[] getServico() {
        return servico;
    }

    public void setServico(Servico[] servico) {
        this.servico = servico;
    }

}

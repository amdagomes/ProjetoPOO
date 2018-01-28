
package Funcionario;


public class Vendedor extends Funcionario{
    private float comissao;

    public Vendedor(float comissao, String nome, String email, String cpf, String rg, String curso, String escolaridade, String reservista, String telefone, String bairro, String cidade, String cep, String logradouro, String tipoDeLogradouro, int numero, String complemento, String pontoDeReferencia,String cargo) {
        super(nome, email, cpf, rg, curso, escolaridade, reservista, telefone, bairro, cidade, cep, logradouro, tipoDeLogradouro, numero, complemento, pontoDeReferencia,cargo);
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
}


package cliente;

import endereco.Endereco;
import pagamento.Pagamento;
import pagamento.RealizaPagamento;


public abstract  class Cliente extends Endereco{
    private String email;
    private String telefone;
    private String numeroDoCartao;
    private Pagamento[] fatura;

    public Cliente(String email, String telefone, String numeroDoCartao, String bairro, String cidade, String cep, String logradouro, String tipoDeLogradouro, int numero, String complemento, String pontoDeReferencia) {
        super(bairro, cidade, cep, logradouro, tipoDeLogradouro, numero, complemento, pontoDeReferencia);
        this.email = email;
        this.telefone = telefone;
        this.numeroDoCartao = numeroDoCartao;
        fatura = new Pagamento[12];
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }
    
    public Pagamento[] getFatura() {
        return fatura;
    }
    public void setFatura(Pagamento[] fatura) {
        this.fatura = fatura;
    }
   
    }
    
    


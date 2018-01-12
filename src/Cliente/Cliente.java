
package Pessoa;

import Endereco.Endereco;


public abstract  class Cliente extends Endereco{
    private String email;
    private String telefone;
    private String numeroDoCartao;

    public Cliente(String email, String telefone, String numeroDoCartao, String bairro, String cidade, String cep, String logradouro, String tipoDeLogradouro) {
        super(bairro, cidade, cep, logradouro, tipoDeLogradouro);
        this.email = email;
        this.telefone = telefone;
        this.numeroDoCartao = numeroDoCartao;
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

   
    }
    
    


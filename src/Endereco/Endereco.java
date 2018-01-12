
package Endereco;


public class Endereco {
    private String bairro;
    private String cidade;
    private String cep;
    private String logradouro;
    private String tipoDeLogradouro;

    public Endereco(String bairro, String cidade, String cep, String logradouro, String tipoDeLogradouro) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.logradouro = logradouro;
        this.tipoDeLogradouro = tipoDeLogradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTipoDeLogradouro() {
        return tipoDeLogradouro;
    }

    public void setTipoDeLogradouro(String tipoDeLogradouro) {
        this.tipoDeLogradouro = tipoDeLogradouro;
    }
    
    
}

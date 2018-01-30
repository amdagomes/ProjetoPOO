package modelo;

public class Endereco {
    
    private String bairro;
    private String cidade;
    private String cep;
    private String logradouro;
    private String tipoDeLogradouro;
    private int numero;
    private String complemento;
    private String pontoDeReferencia;

    public Endereco(String bairro, String cidade, String cep, String logradouro, String tipoDeLogradouro, int numero, String complemento, String pontoDeReferencia) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.logradouro = logradouro;
        this.tipoDeLogradouro = tipoDeLogradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.pontoDeReferencia = pontoDeReferencia;
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

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getPontoDeReferencia() {
        return pontoDeReferencia;
    }
    public void setPontoDeReferencia(String pontoDeReferencia) {
        this.pontoDeReferencia = pontoDeReferencia;
    }
    
}

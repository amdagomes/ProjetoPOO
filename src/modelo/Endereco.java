package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Endereco implements Serializable {

    private String bairro;
    private String cidade;
    private String cep;
    private String logradouro;
    private int numero;
    private String complemento;
    private String pontoDeReferencia;

    public Endereco(String bairro, String cidade, String cep, String logradouro, int numero, String complemento, String pontoDeReferencia) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.pontoDeReferencia = pontoDeReferencia;
    }

    public Endereco() {

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.bairro);
        hash = 67 * hash + Objects.hashCode(this.cidade);
        hash = 67 * hash + Objects.hashCode(this.cep);
        hash = 67 * hash + Objects.hashCode(this.logradouro);
        hash = 67 * hash + this.numero;
        hash = 67 * hash + Objects.hashCode(this.complemento);
        hash = 67 * hash + Objects.hashCode(this.pontoDeReferencia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        if (!Objects.equals(this.logradouro, other.logradouro)) {
            return false;
        }
        if (!Objects.equals(this.complemento, other.complemento)) {
            return false;
        }
        if (!Objects.equals(this.pontoDeReferencia, other.pontoDeReferencia)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\\ntLogradouro: " + logradouro + "\tNumero: " + numero
                + "\nComplemento: " + complemento + "\tPonto de Referencia: " + pontoDeReferencia + "\nBairro: " + bairro + "\tCidade: " + cidade + "CEP: " + cep;
    }

}

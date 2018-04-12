package modelo;

import java.io.Serializable;
import java.util.Objects;

public abstract class Cliente implements Serializable {

    private String email;
    private String telefone;
    private String numeroDoCartao;
    private Endereco endereco;
    private int codigo;

    public Cliente(int codigo, String email, String telefone, String numeroDoCartao, Endereco endereco) {
        this.codigo = codigo;
        this.email = email;
        this.telefone = telefone;
        this.numeroDoCartao = numeroDoCartao;
    }

    public Cliente() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.email);
        hash = 79 * hash + Objects.hashCode(this.telefone);
        hash = 79 * hash + Objects.hashCode(this.numeroDoCartao);
        hash = 79 * hash + Objects.hashCode(this.endereco);
        hash = 79 * hash + this.codigo;
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
        final Cliente other = (Cliente) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.numeroDoCartao, other.numeroDoCartao)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Codigo do Cliente: " + codigo + "\tEmail: " + email + "\tTelefone: " + telefone
                + "\tNumero do Cartao: " + numeroDoCartao + "\nEndereco: " + endereco;
    }

}

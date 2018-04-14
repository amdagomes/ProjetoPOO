package modelo;

import java.util.Objects;

public class ClientePessoaJuridica extends Cliente {

    private String razaoSocial;
    private String cnpj;

    public ClientePessoaJuridica(String razaoSocial, String cnpj, String email, String telefone, String numeroDoCartao, Endereco endereco) {
        super(email, telefone, numeroDoCartao, endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public ClientePessoaJuridica() {

    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.razaoSocial);
        hash = 61 * hash + Objects.hashCode(this.cnpj);
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
        final ClientePessoaJuridica other = (ClientePessoaJuridica) obj;
        if (!Objects.equals(this.razaoSocial, other.razaoSocial)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nInformações Cliente Pessoa Juridica:\n" + "Razao Social: " + razaoSocial + "\tCNPJ: " + cnpj + "\n" + super.toString();
    }
}

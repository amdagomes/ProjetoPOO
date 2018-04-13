package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ClientePessoaFisica extends Cliente {

    private String nome;
    private String rg;
    private String cpf;
    private String dataDeNascimento;

    public ClientePessoaFisica(int codigo, String nome, String rg, String cpf, String dataDeNascimento, String email, String telefone, String numeroDoCartao, Endereco endereco) {
        super(codigo, email, telefone, numeroDoCartao, endereco);
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public ClientePessoaFisica() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nome);
        hash = 71 * hash + Objects.hashCode(this.rg);
        hash = 71 * hash + Objects.hashCode(this.cpf);
        hash = 71 * hash + Objects.hashCode(this.dataDeNascimento);
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
        final ClientePessoaFisica other = (ClientePessoaFisica) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.dataDeNascimento, other.dataDeNascimento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\n Informações Cliente Pessoa Fisica:\n" + "Nome: " + nome + "\nRG: " + rg + "\tCPF: " + cpf
                + "\tNascimento: " + dataDeNascimento + "\n";
    }

}

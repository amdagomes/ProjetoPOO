package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Funcionario implements Serializable{

    private String nome;
    private String email;
    private String cpf;
    private String rg;
    private String escolaridade;
    private String reservista;
    private String telefone;
    private String cargo;
    private Endereco endereco;
    private String senha;

    public Funcionario(String nome, String email, String cpf, String rg, String escolaridade, String reservista, String telefone, String cargo, Endereco endereco, String senha) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.escolaridade = escolaridade;
        this.reservista = reservista;
        this.telefone = telefone;
        this.cargo = cargo;
        this.endereco = endereco;
        this.senha = senha;
    }

    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getReservista() {
        return reservista;
    }

    public void setReservista(String reservista) {
        this.reservista = reservista;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.email);
        hash = 89 * hash + Objects.hashCode(this.cpf);
        hash = 89 * hash + Objects.hashCode(this.rg);

        hash = 89 * hash + Objects.hashCode(this.escolaridade);
        hash = 89 * hash + Objects.hashCode(this.reservista);
        hash = 89 * hash + Objects.hashCode(this.telefone);
        hash = 89 * hash + Objects.hashCode(this.cargo);
        hash = 89 * hash + Objects.hashCode(this.endereco);
        hash = 89 * hash + Objects.hashCode(this.senha);
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.escolaridade, other.escolaridade)) {
            return false;
        }
        if (!Objects.equals(this.reservista, other.reservista)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nInformações do Funcionario:\n" + "Nome: " + nome + "\tCPF: " + cpf
                + "\tRG: " + rg + "\tReservista: " + reservista + "\nEmail: " + email + "\tEscolaridade: " + escolaridade
                + "\nTelefone: " + telefone + "\tCargo: " + cargo + "\nEndereco: " + endereco;
    }

}

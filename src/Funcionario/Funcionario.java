package Funcionario;

import Endereco.Endereco;

public class Funcionario extends Endereco {

    private String nome;
    private String email;
    private String cpf;
    private String rg;
    private String curso;
    private String escolaridade;
    private String reservista;
    private String telefone;
    private String cargo;

    public Funcionario(String nome, String email, String cpf, String rg, String curso, String escolaridade, String reservista, String telefone, String bairro, String cidade, String cep, String logradouro, String tipoDeLogradouro, int numero, String complemento, String pontoDeReferencia,String cargo) {
        super(bairro, cidade, cep, logradouro, tipoDeLogradouro, numero, complemento, pontoDeReferencia);
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.curso = curso;
        this.escolaridade = escolaridade;
        this.reservista = reservista;
        this.telefone = telefone;
        this.cargo= cargo;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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

}

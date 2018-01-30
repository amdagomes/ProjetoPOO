package modelo;

import java.time.LocalDate;

public class ClientePessoaFisica extends Cliente {
    
    private String nome;
    private String rg;
    private String cpf;
    private LocalDate dataDeNascimento;

    public ClientePessoaFisica(String nome, String rg, String cpf, LocalDate dataDeNascimento, String email, String telefone, String numeroDoCartao, Endereco endereco) {
        super(email, telefone, numeroDoCartao, endereco);
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
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

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

}

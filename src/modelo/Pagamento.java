package modelo;

/**
 *
 * @author Amanda
 */

import java.time.LocalDate;

public class Pagamento {
    private LocalDate vencimento;
    private float vAdicional;
    private String mesReferente;
    private LocalDate dataPagamento;
    private Servico servico;
    private Cliente cliente;

    public Pagamento(LocalDate vencimento, float vAdicional, String mesReferente, LocalDate dataPagamento, Servico servico, Cliente cliente) {
        this.vencimento = vencimento;
        this.vAdicional = vAdicional;
        this.mesReferente = mesReferente;
        this.dataPagamento = dataPagamento;
        this.servico = servico;
        this.cliente = cliente;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    public float getvAdicional() {
        return vAdicional;
    }

    public void setvAdicional(float vAdicional) {
        this.vAdicional = vAdicional;
    }

    public String getMesReferente() {
        return mesReferente;
    }

    public void setMesReferente(String mesReferente) {
        this.mesReferente = mesReferente;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    

}
package pagamento;

/**
 *
 * @author Amanda
 */

import java.time.LocalDate;

public class Pagamento {
    private LocalDate vencimento;
    private float vAdicional;
    private String mesReferente;
    private RealizaPagamento[] contas;

    public Pagamento(LocalDate vencimento, float vAdicional, String mesReferente) {
        this.vencimento = vencimento;
        this.vAdicional = vAdicional;
        this.mesReferente = mesReferente;
        this.contas = contas;
        contas = new RealizaPagamento[10];
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

    public RealizaPagamento[] getContas() {
        return contas;
    }
    public void setContas(RealizaPagamento[] contas) {
        this.contas = contas;
    }
     
}

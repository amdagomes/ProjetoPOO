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

    public Pagamento(LocalDate vencimento, float vAdicional, String mesReferente) {
        this.vencimento = vencimento;
        this.vAdicional = vAdicional;
        this.mesReferente = mesReferente;
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
    
    
}

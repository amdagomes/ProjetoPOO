package servico;

/**
 *
 * @author Amanda
 */
public class Telefonia extends Servico{
    private String numero;
    private float ligacaoLocal;
    private float ligacaoNacional;
    private float ligacaoOperadora;

    public Telefonia(String numero, float ligacaoLocal, float ligacaoNacional, float ligacaoOperadora, float vInstalacao, float vMesalidade, String status, int codigo) {
        super(vInstalacao, vMesalidade, status, codigo);
        this.numero = numero;
        this.ligacaoLocal = ligacaoLocal;
        this.ligacaoNacional = ligacaoNacional;
        this.ligacaoOperadora = ligacaoOperadora;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getLigacaoLocal() {
        return ligacaoLocal;
    }
    public void setLigacaoLocal(float ligacaoLocal) {
        this.ligacaoLocal = ligacaoLocal;
    }

    public float getLigacaoNacional() {
        return ligacaoNacional;
    }
    public void setLigacaoNacional(float ligacaoNacional) {
        this.ligacaoNacional = ligacaoNacional;
    }

    public float getLigacaoOperadora() {
        return ligacaoOperadora;
    }
    public void setLigacaoOperadora(float ligacaoOperadora) {
        this.ligacaoOperadora = ligacaoOperadora;
    }
    
}

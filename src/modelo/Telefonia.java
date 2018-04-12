package modelo;

import java.util.Objects;

public class Telefonia extends Servico {

    private String numero;
    private float ligacaoLocal;
    private float ligacaoNacional;
    private float ligacaoOperadora;

    public Telefonia(String numero, float ligacaoLocal, float ligacaoNacional, float ligacaoOperadora, float vInstalacao, float vMesalidade, int codigo) {
        super(vInstalacao, vMesalidade, codigo);
        this.numero = numero;
        this.ligacaoLocal = ligacaoLocal;
        this.ligacaoNacional = ligacaoNacional;
        this.ligacaoOperadora = ligacaoOperadora;
    }

    public Telefonia() {
        
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.numero);
        hash = 47 * hash + Float.floatToIntBits(this.ligacaoLocal);
        hash = 47 * hash + Float.floatToIntBits(this.ligacaoNacional);
        hash = 47 * hash + Float.floatToIntBits(this.ligacaoOperadora);
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
        final Telefonia other = (Telefonia) obj;
        if (Float.floatToIntBits(this.ligacaoLocal) != Float.floatToIntBits(other.ligacaoLocal)) {
            return false;
        }
        if (Float.floatToIntBits(this.ligacaoNacional) != Float.floatToIntBits(other.ligacaoNacional)) {
            return false;
        }
        if (Float.floatToIntBits(this.ligacaoOperadora) != Float.floatToIntBits(other.ligacaoOperadora)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nServico de Telefonia\n" + "Numero: " + numero + "\tValor da Ligacao Local: R$" + ligacaoLocal
                + "nValor da ligacao nacional: R$" + ligacaoNacional + "\tValor da ligacao para outra operadora=" + ligacaoOperadora + "\n"
                + super.toString();
    }

}

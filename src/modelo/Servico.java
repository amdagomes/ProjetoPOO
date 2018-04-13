package modelo;

import java.io.Serializable;
import java.util.Objects;

public abstract class Servico  {

    private float vInstalacao;
    private float vMesalidade;
    private int codigo;

    public Servico(float vInstalacao, float vMesalidade, int codigo) {
        this.vInstalacao = vInstalacao;
        this.vMesalidade = vMesalidade;
        this.codigo = codigo;
    }
    
    public Servico(){
        
    }

    public float getvInstalacao() {
        return vInstalacao;
    }

    public void setvInstalacao(float vInstalacao) {
        this.vInstalacao = vInstalacao;
    }

    public float getvMesalidade() {
        return vMesalidade;
    }

    public void setvMesalidade(float vMesalidade) {
        this.vMesalidade = vMesalidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Float.floatToIntBits(this.vInstalacao);
        hash = 97 * hash + Float.floatToIntBits(this.vMesalidade);
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
        final Servico other = (Servico) obj;
        if (Float.floatToIntBits(this.vInstalacao) != Float.floatToIntBits(other.vInstalacao)) {
            return false;
        }
        if (Float.floatToIntBits(this.vMesalidade) != Float.floatToIntBits(other.vMesalidade)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Valor da Instalacao: R$" + vInstalacao + "\tVaor da Mensalidade: R$" + vMesalidade;
    }

}

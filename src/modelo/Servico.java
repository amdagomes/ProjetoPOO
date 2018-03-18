package modelo;

import java.util.Objects;

public abstract class Servico {
    private float vInstalacao;
    private float vMesalidade;
    private String status;
    private static int codigo;

    public Servico(float vInstalacao, float vMesalidade, String status, int codigo) {
        this.vInstalacao = vInstalacao;
        this.vMesalidade = vMesalidade;
        this.status = status;
        this.codigo = codigo;
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
    
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Float.floatToIntBits(this.vInstalacao);
        hash = 97 * hash + Float.floatToIntBits(this.vMesalidade);
        hash = 97 * hash + Objects.hashCode(this.status);
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
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Valor da Instalacao: R$" + vInstalacao + "\tVaor da Mensalidade: R$" + vMesalidade + "\tStatus: " + status;
    }
    
}

package modelo;

public class TV extends Servico {

    private int quantCanais;

    public TV(int quantCanais, float vInstalacao, float vMesalidade, int codigo) {
        super(vInstalacao, vMesalidade, codigo);
        this.quantCanais = quantCanais;
    }

    public TV() {
        
    }

    public int getQuantCanais() {
        return quantCanais;
    }

    public void setQuantCanais(int quantCanais) {
        this.quantCanais = quantCanais;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.quantCanais;
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
        final TV other = (TV) obj;
        if (this.quantCanais != other.quantCanais) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nServiço de TV:\n" + "Quantidade de canais: " + quantCanais + "\n" + super.toString();
    }

}

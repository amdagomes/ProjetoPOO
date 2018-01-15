package modelo;

/**
 *
 * @author Amanda
 */
public class TV extends Servico {
    private int quantCanais;

    public TV(int quantCanais, float vInstalacao, float vMesalidade, int codigo) {
        super(vInstalacao, vMesalidade, codigo);
        this.quantCanais = quantCanais;
    }

    public int getQuantCanais() {
        return quantCanais;
    }
    public void setQuantCanais(int quantCanais) {
        this.quantCanais = quantCanais;
    }
    
}

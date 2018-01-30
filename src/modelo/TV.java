package modelo;

/**
 *
 * @author Amanda
 */
public class TV extends Servico {
    private int quantCanais;

    public TV(int quantCanais, float vInstalacao, float vMesalidade, String status, int codigo) {
        super(vInstalacao, vMesalidade, status, codigo);
        this.quantCanais = quantCanais;
    }

    public int getQuantCanais() {
        return quantCanais;
    }
    public void setQuantCanais(int quantCanais) {
        this.quantCanais = quantCanais;
    }
    
}

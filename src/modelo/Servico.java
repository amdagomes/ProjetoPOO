package modelo;

/**
 *
 * @author Amanda
 */
public abstract class Servico {
    private float vInstalacao;
    private float vMesalidade;
    private static int codigo;

    public Servico(float vInstalacao, float vMesalidade, int codigo) {
        this.vInstalacao = vInstalacao;
        this.vMesalidade = vMesalidade;
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
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
}

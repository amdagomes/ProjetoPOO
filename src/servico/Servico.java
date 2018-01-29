package servico;
import cliente.Cliente;
/**
 *
 * @author Amanda
 */
public abstract class Servico {
    private float vInstalacao;
    private float vMesalidade;
    private String status;
    private Cliente cliente[];
    private static int codigo;

    public Servico(float vInstalacao, float vMesalidade, String status, int codigo) {
        this.vInstalacao = vInstalacao;
        this.vMesalidade = vMesalidade;
        this.status = status;
        this.codigo = codigo;
        cliente = new Cliente[10];
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

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }
    
}

package modelo;

public class Compra {
    
    private Vendedor vendedor;
    private Cliente cliente;
    private Servico servico;

    public Compra(Vendedor vendedor, Cliente cliente, Servico servico) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.servico = servico;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }
    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
}

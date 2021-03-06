package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Compra implements Serializable {

    private Vendedor vendedor;
    private Cliente cliente;
    private Servico servico;
    private int codigo;

    public Compra(Vendedor vendedor, Cliente cliente, Servico servico) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.servico = servico;
    }

    public Compra() {

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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.vendedor);
        hash = 43 * hash + Objects.hashCode(this.cliente);
        hash = 43 * hash + Objects.hashCode(this.servico);
        hash = 43 * hash + this.codigo;
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
        final Compra other = (Compra) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.vendedor, other.vendedor)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.servico, other.servico)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Informações da compra:\n" + "Codigo da venda: " + codigo + vendedor + cliente + servico;
    }

}

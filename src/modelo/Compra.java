package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Compra implements Serializable  {

    private Funcionario vendedor;
    private Cliente cliente;
    private Servico servico;
    private int codigo;
    private static int cont;

    public Compra(Funcionario vendedor, Cliente cliente, Servico servico) {
        codigo = ++cont;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.servico = servico;
    }

    public Compra() {

    }

    public Funcionario getVendedor() {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.vendedor);
        hash = 71 * hash + Objects.hashCode(this.cliente);
        hash = 71 * hash + Objects.hashCode(this.servico);
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

package modelo;

import java.util.Arrays;
import java.util.Objects;

public class Compra {
    
    private Vendedor vendedor;
    private Cliente cliente;
    private Servico[] servico;
    private final int codigo;
    private int quant;

    public Compra(Vendedor vendedor, Cliente cliente,int quant) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        servico = new Servico[3];
        quant=0;
        codigo=quant++;
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

    public Servico[] getServico() {
        return servico;
    }
    public void setServico(Servico[] servico) {
        this.servico = servico;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.vendedor);
        hash = 71 * hash + Objects.hashCode(this.cliente);
        hash = 71 * hash + Arrays.deepHashCode(this.servico);
        hash = 71 * hash + this.codigo;
        hash = 71 * hash + this.quant;
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
        if (this.quant != other.quant) {
            return false;
        }
        if (!Objects.equals(this.vendedor, other.vendedor)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Arrays.deepEquals(this.servico, other.servico)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Compra{" + "vendedor=" + vendedor + ", cliente=" + cliente + ", servico=" + servico + ", codigo=" + codigo + ", quant=" + quant + '}';
    }
    
}

package modelo;

import java.util.List;

public class Vendedor extends Funcionario {

    private float comissao;

    public Vendedor(float comissao, String nome, String email, String cpf, String rg, String curso, String escolaridade, String reservista, String telefone, String cargo, Endereco endereco, String senha) {
        super(nome, email, cpf, rg, curso, escolaridade, reservista, telefone, cargo, endereco, senha);
        this.comissao = comissao;
    }

    public Vendedor() {

    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Float.floatToIntBits(this.comissao);
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
        final Vendedor other = (Vendedor) obj;
        if (Float.floatToIntBits(this.comissao) != Float.floatToIntBits(other.comissao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "Comissão" + comissao;
    }

}

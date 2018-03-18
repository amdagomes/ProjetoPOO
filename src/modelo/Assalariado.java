package modelo;

public class Assalariado extends Funcionario {

    private float salario;

    public Assalariado(float salario, String nome, String email, String cpf, String rg, String curso, String escolaridade, String reservista, String telefone, String cargo, Endereco endereco, String senha) {
        super(nome, email, cpf, rg, curso, escolaridade, reservista, telefone, cargo, endereco, senha);
        this.salario = salario;
    }

    public Assalariado() {

    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Float.floatToIntBits(this.salario);
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
        final Assalariado other = (Assalariado) obj;
        if (Float.floatToIntBits(this.salario) != Float.floatToIntBits(other.salario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "Salario: " + salario;
    }

}


package modelo;

public class Assalariado extends Funcionario {

    private float salario;

    public Assalariado(float salario, String nome, String email, String cpf, String rg, String curso, String escolaridade, String reservista, String telefone, String cargo, Endereco endereco) {
        super(nome, email, cpf, rg, curso, escolaridade, reservista, telefone, cargo, endereco);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}


package Funcionario;

public class Assalariado extends Funcionario {

    private float salario;

    public Assalariado(float salario, String nome, String email, String cpf, String rg, String curso, String escolaridade, String reservista, String telefone, String bairro, String cidade, String cep, String logradouro, String tipoDeLogradouro, int numero, String complemento, String pontoDeReferencia,String cargo) {
        super(nome, email, cpf, rg, curso, escolaridade, reservista, telefone, bairro, cidade, cep, logradouro, tipoDeLogradouro, numero, complemento, pontoDeReferencia,cargo);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}

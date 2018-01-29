
package funcionario;

import atendimento.Atendimento;
public class Tecnico extends Assalariado {
       
   private Atendimento atendimento[];

  
    public Tecnico( float salario, String nome, String email, String cpf, String rg, String curso, String escolaridade, String reservista, String telefone, String bairro, String cidade, String cep, String logradouro, String tipoDeLogradouro, int numero, String complemento, String pontoDeReferencia, String cargo) {
        super(salario, nome, email, cpf, rg, curso, escolaridade, reservista, telefone, bairro, cidade, cep, logradouro, tipoDeLogradouro, numero, complemento, pontoDeReferencia, cargo);
        atendimento = new Atendimento[10];
    }

    public Atendimento[] getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento[] atendimento) {
        this.atendimento = atendimento;
    }
   
}

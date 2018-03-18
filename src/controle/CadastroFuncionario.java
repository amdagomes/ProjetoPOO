package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Assalariado;
import modelo.Endereco;
import modelo.Funcionario;
import modelo.Vendedor;

/**
 * Classe de cadastro de funcionário
 *
 * @author Cliente
 */
public class CadastroFuncionario implements DaoFuncionario<Funcionario> {

    List<Funcionario> funcionarios;
    Scanner entrada;
    Endereco endereco;

    /**
     * construtor de funcionario
     *
     */
    public CadastroFuncionario() {
        funcionarios = new ArrayList<>();
        entrada = new Scanner(System.in);
        endereco = new Endereco();
    }

    @Override
    public boolean adiciona(Funcionario obj) {
        return funcionarios.add(obj);
    }

    @Override
    public boolean remove(String cpf) {
        return funcionarios.remove(busca(cpf));
    }

    @Override
    public Funcionario busca(String cpf) {
        if (funcionarios.isEmpty()) {
            return null;
        } else {
            for (Funcionario f : funcionarios) {
                if (f.getCpf().equals(cpf)) {
                    return f;
                }
            }
            return null;
        }
    }

    @Override
    public boolean autentica(String cpf, String senha) {
        if (funcionarios.isEmpty()) {
            return false;
        } else {
            for (Funcionario f : funcionarios) {
                if (f.getCpf().equals(cpf) && f.getSenha().equals(senha)) {
                    return true;
                }
            }
            return false;
        }
    }
/**Metodo de cadastro de funcionario vendedor
 * 
 * @return cadastro de vendedor
 */
    public Funcionario cadastraVendedor() {
        Vendedor f = new Vendedor();

        System.out.printf("Nome: ");
        f.setNome(entrada.next());
        System.out.printf("CPF: ");
        f.setCpf(entrada.next());
        System.out.printf("RG: ");
        f.setRg(entrada.next());
        System.out.printf("Reservista: ");
        f.setReservista(entrada.next());
        System.out.printf("Email: ");
        f.setEmail(entrada.next());
        System.out.printf("Curso: ");
        f.setCurso(entrada.next());
        System.out.printf("Escolaridade: ");
        f.setEscolaridade(entrada.next());
        System.out.printf("Telefone: ");
        f.setTelefone(entrada.next());
        System.out.printf("Cargo: ");
        f.setCargo(entrada.next());

        System.out.printf("Tipo de Logradouro: ");
        endereco.setTipoDeLogradouro(entrada.next());
        System.out.printf(endereco.getTipoDeLogradouro() + ": ");
        endereco.setLogradouro(entrada.next());
        System.out.printf("Numero: ");
        endereco.setNumero(entrada.nextInt());
        System.out.printf("Bairro: ");
        endereco.setBairro(entrada.next());
        System.out.printf("Complemento: ");
        endereco.setComplemento(entrada.next());
        System.out.printf("Cidade: ");
        endereco.setCidade(entrada.next());
        System.out.printf("CEP: ");
        endereco.setCep(entrada.next());
        System.out.printf("Ponto de Referencia: ");
        endereco.setPontoDeReferencia(entrada.next());
        f.setEndereco(endereco);

        System.out.printf("Comissao: ");
        f.setComissao(entrada.nextFloat());
        System.out.printf("Senha: ");
        f.setSenha(entrada.next());
        return f;
    }
/** Metodo de cadastro de funcionario Assalariado
 * 
 * @return cadastro de funcionario Assalariado
 */
    public Funcionario cadastraAssalariado() {
        Assalariado f = new Assalariado();

        System.out.printf("Nome: ");
        f.setNome(entrada.next());
        System.out.printf("CPF: ");
        f.setCpf(entrada.next());
        System.out.printf("RG: ");
        f.setRg(entrada.next());
        System.out.printf("Reservista: ");
        f.setReservista(entrada.next());
        System.out.printf("Email: ");
        f.setEmail(entrada.next());
        System.out.printf("Curso: ");
        f.setCurso(entrada.next());
        System.out.printf("Escolaridade: ");
        f.setEscolaridade(entrada.next());
        System.out.printf("Telefone: ");
        f.setTelefone(entrada.next());
        System.out.printf("Cargo: ");
        f.setCargo(entrada.next());

        System.out.printf("Tipo de Logradouro: ");
        endereco.setTipoDeLogradouro(entrada.next());
        System.out.printf(endereco.getTipoDeLogradouro() + ": ");
        endereco.setLogradouro(entrada.next());
        System.out.printf("Numero: ");
        endereco.setNumero(entrada.nextInt());
        System.out.printf("Bairro: ");
        endereco.setBairro(entrada.next());
        System.out.printf("Complemento: ");
        endereco.setComplemento(entrada.next());
        System.out.printf("Cidade: ");
        endereco.setCidade(entrada.next());
        System.out.printf("CEP: ");
        endereco.setCep(entrada.next());
        System.out.printf("Ponto de Referencia: ");
        endereco.setPontoDeReferencia(entrada.next());
        f.setEndereco(endereco);
        System.out.printf("Salário: ");
        f.setSalario(entrada.nextFloat());
        System.out.printf("Senha: ");
        f.setSenha(entrada.next());
        return f;
    }

}

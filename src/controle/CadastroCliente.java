package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Cliente;
import modelo.ClientePessoaFisica;
import modelo.ClientePessoaJuridica;
import modelo.Endereco;

/**
 * Classe de cadastro de Cliente
 *
 * @author Rafaela
 */
public class CadastroCliente implements Dao<Cliente> {

    Scanner entrada = new Scanner(System.in);
    Endereco e = new Endereco();
    List<Cliente> clientes;

    /**
     * Construtor de cliente
     *
     */
    public CadastroCliente() {
        clientes = new ArrayList<>();
    }

    @Override
    public boolean adiciona(Cliente obj) {
        return clientes.add(obj);
    }

    @Override
    public boolean remove(int cod) {
        return clientes.remove(busca(cod));
    }

    @Override
    public Cliente busca(int cod) {
        if (clientes.isEmpty()) {
            return null;
        } else {
            for (Cliente c : clientes) {
                if (c.getCodigo() == cod) {
                    return c;
                }
            }
            return null;
        }
    }

    /**
     * Metodo para realizar cadastro de cliente Pessoa Fisica
     *
     * @return Cadastro de Cliente Pessoa Fisica
     */
    public Cliente cadastraCF() {
        ClientePessoaFisica cf = new ClientePessoaFisica();

        System.out.printf("Codigo do cliente: ");
        cf.setCodigo(entrada.nextInt());
        System.out.printf("Nome: ");
        cf.setNome(entrada.next());
        System.out.printf("CPF: ");
        cf.setCpf(entrada.next());
        System.out.printf("RG: ");
        cf.setRg(entrada.next());
        System.out.printf("Email: ");
        cf.setEmail(entrada.next());
        System.out.printf("Telefone: ");
        cf.setTelefone(entrada.next());

        System.out.printf("Tipo de Logradouro: ");
        e.setTipoDeLogradouro(entrada.next());
        System.out.printf(e.getTipoDeLogradouro() + ": ");
        e.setLogradouro(entrada.next());
        System.out.printf("Numero: ");
        e.setNumero(entrada.nextInt());
        System.out.printf("Bairro: ");
        e.setBairro(entrada.next());
        System.out.printf("Complemento: ");
        e.setComplemento(entrada.next());
        System.out.printf("CEP: ");
        e.setCep(entrada.next());
        System.out.printf("Cidade: ");
        e.setCidade(entrada.next());
        System.out.printf("Ponto Referencia: ");
        e.setPontoDeReferencia(entrada.next());

        cf.setEndereco(e);
        System.out.printf("Numero do Cartao: ");
        cf.setNumeroDoCartao(entrada.next());

        return cf;
    }

    /**
     * Metodo para realizar cadastro de Cliente Pessoa Juridica
     *
     * @return O cadastro de Cliente pessoa juridica
     */
    public Cliente cadastraCJ() {
        ClientePessoaJuridica cj = new ClientePessoaJuridica();

        System.out.printf("Codigo do cliente: ");
        cj.setCodigo(entrada.nextInt());
        System.out.printf("CNPJ: ");
        cj.setCnpj(entrada.next());
        System.out.printf("Razão Social: ");
        cj.setRazaoSocial(entrada.next());

        System.out.printf("Tipo de Logradouro: ");
        e.setTipoDeLogradouro(entrada.next());
        System.out.printf(e.getTipoDeLogradouro() + ": ");
        e.setLogradouro(entrada.next());
        System.out.printf("Numero: ");
        e.setNumero(entrada.nextInt());
        System.out.printf("Bairro: ");
        e.setBairro(entrada.next());
        System.out.printf("Complemento: ");
        e.setComplemento(entrada.next());
        System.out.printf("CEP: ");
        e.setCep(entrada.next());
        System.out.printf("Cidade: ");
        e.setCidade(entrada.next());
        System.out.printf("Ponto Referencia: ");
        e.setPontoDeReferencia(entrada.next());

        cj.setEndereco(e);
        System.out.printf("Numero do Cartao: ");
        cj.setNumeroDoCartao(entrada.next());

        return cj;
    }

}

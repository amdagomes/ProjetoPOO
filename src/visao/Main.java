package visao;

import controle.CadastroCliente;
import controle.CadastroCompra;
import controle.CadastroFuncionario;
import controle.CadastroServico;
import java.util.Scanner;
import modelo.Endereco;
import modelo.Internet;
import modelo.Servico;
import modelo.TV;
import modelo.Vendedor;

/**
 *
 * @author Amanda
 */
public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        CadastroFuncionario cadFunc = new CadastroFuncionario();
        CadastroCompra cadCompra = new CadastroCompra();
        CadastroCliente cadCliente = new CadastroCliente();
        CadastroServico cadServico = new CadastroServico();

        cadServico.adiciona(new Internet(1, 20, 20, "Fibra Optica", 0, 83, "Ativo", 1));
        cadServico.adiciona(new Internet(1, 40, 40, "Fibra Optica", 0, 99, "Ativo", 2));
        cadServico.adiciona(new TV(29, 0, (float) 19.90, "Ativo", 3));

        System.out.println(cadServico.busca(1));
        Vendedor vendedor = new Vendedor(50, "Mario", "mario@gmail.com", "111.111.111-11", "111111", "TI",
                "Superior incompleto", "9898", "(83) 99822-3333", "Atendente",
                new Endereco("Centro", "Sousa", "58815-000", "Jardins", "Rua", 10, " ", " "), "123");

        cadFunc.adiciona(vendedor);

        System.out.printf("%s\t %s \t%s\n\n", "*---------", "Realize o Login", "---------*");
        System.out.printf("Login: ");
        String login = entrada.next();
        System.out.printf("Senha: ");
        String senha = entrada.next();

        if (cadFunc.autentica(login, senha)) {
            int opcao = -1, opcao2 = -1;

            do {

                System.out.printf("%s\t %s \t%s\n", "-", "MENU", "    -");
                System.out.printf("1- Acessar menu de venda\n2- Acessar menu de Funcionario\n3- Acessar menu de cliente\n"
                        + "0- Sair\nOpção: ");
                opcao = entrada.nextInt();

                switch (opcao) {
                    case 1:
                        while (opcao2 != 0) {

                            System.out.println("\n-- Menu de Vendas --");
                            System.out.printf("1- Cadastrar nova venda \n2- Pesquisar Venda \n3- Remover venda \n0 - Sair \nOpção: ");
                            opcao2 = entrada.nextInt();

                            switch (opcao2) {
                                case 1:
                                    System.out.printf("\n4- Cliente Fisico \n5- Cliente Juridico \nOpção: ");
                                    opcao = entrada.nextInt();

                                    if (cadCompra.adiciona(cadCompra.cadastra(opcao, login, cadCliente, cadFunc, cadServico))) {
                                        System.out.println("Venda realizada com sucesso");
                                    } else {
                                        System.out.println("Erro ao cadastrar venda");
                                    }

                                    break;

                                case 2:
                                    System.out.printf("\nInforme o codigo da venda: ");
                                    int cod = entrada.nextInt();

                                    System.out.println(cadCompra.busca(cod).toString());

                                    break;

                                case 3:
                                    System.out.printf("\nInforme o codigo da venda: ");
                                    cod = entrada.nextInt();

                                    if (cadCompra.remove(cod)) {
                                        System.out.println("Compra removida");
                                    } else {
                                        System.out.println("Erro ao remover");
                                    }

                            }

                        }
                        opcao2 = -1;
                        break;

                    case 2:
                        while (opcao2 != 0) {
                            String cpf;

                            System.out.println("\n-- Menu de Funcionário --");
                            System.out.printf("1- Cadastrar novo Funcionario \n2- Pesquisar Funcionario \n3- Remover Funcionário \nOpção: ");
                            opcao2 = entrada.nextInt();

                            switch (opcao2) {
                                case 1:
                                    System.out.printf("\n4- Funcionário Vendedor \n5- Funcionário assalariado \nOpção: ");
                                    opcao2 = entrada.nextInt();
                                    if (opcao2 == 4) {
                                        if (cadFunc.adiciona(cadFunc.cadastraVendedor())) {
                                            System.out.println("Cadastro realizado com sucesso");
                                        } else {
                                            System.out.println("Erro ao tentar cadastrar");
                                        }
                                    } else if (opcao2 == 5) {
                                        if (cadFunc.adiciona(cadFunc.cadastraAssalariado())) {
                                            System.out.println("Cadastro realizado com sucesso");
                                        } else {
                                            System.out.println("Erro ao tentar cadastrar");
                                        }
                                    } else {
                                        System.out.println("Opção inválida");
                                        continue;
                                    }

                                case 2:
                                    System.out.println("Informe o CPF: ");
                                    cpf = entrada.next();

                                    System.out.println(cadFunc.busca(cpf).toString());

                                    continue;

                                case 3:
                                    System.out.println("Informe o CPF: ");
                                    cpf = entrada.next();

                                    if (cadFunc.remove(cpf)) {
                                        System.out.println("Funcionário removido");
                                    } else {
                                        System.out.println("Funcionário não encontrado");
                                    }

                            }

                        }
                        opcao2 = -1;
                        break;

                    case 3:

                        while (opcao2 != 0) {
                            System.out.println("\n-- Menu de Cliente --");
                            System.out.printf("1- Pesquisar Cliente \n2- Remover Cliente \n0 - Sair \nOpção: ");
                            opcao2 = entrada.nextInt();

                            switch (opcao2) {

                                case 1:
                                    System.out.printf("Informe o Codigo do cliente: ");
                                    opcao = entrada.nextInt();

                                    System.out.println(cadCliente.busca(opcao).toString());

                                    break;

                                case 2:
                                    System.out.printf("Informe o Codigo do cliente: ");
                                    opcao = entrada.nextInt();

                                    if (cadCliente.remove(opcao)) {
                                        System.out.println("Cliente removido com sucesso");
                                    } else {
                                        System.out.println("Erro ao remover");
                                    }

                                    break;
                            }

                        }
                        opcao2 = -1;
                        break;
                }

            } while (opcao != 0);

        } else {
            System.out.println("Login inválido");
        }

    }

}

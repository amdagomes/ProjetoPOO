package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Compra;
import modelo.Funcionario;
import modelo.Servico;
import modelo.Vendedor;

/**
 * Classe de cadastro de compra
 *
 * @author
 */
public class CadastroCompra implements Dao<Compra> {

    List<Compra> compras;

    /**
     * Construtor de compra
     *
     */
    public CadastroCompra() {
        compras = new ArrayList<>();
    }

    @Override
    public boolean adiciona(Compra obj) {
        return compras.add(obj);
    }

    @Override
    public boolean remove(int codigo) {
        return compras.remove(busca(codigo));
    }

    @Override
    public Compra busca(int cod) {
        if (compras.isEmpty()) {
            return null;
        } else {
            for (Compra c : compras) {
                if (c.getCodigo() == cod) {
                    return c;
                }
            }
            return null;
        }
    }

    public Compra cadastra(int opcao, String cpf, CadastroCliente cadCliente, CadastroFuncionario cadFunc, CadastroServico cadServico) {
        Compra c = new Compra();
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Codigo da venda: ");
        c.setCodigo(entrada.nextInt());

        if (opcao == 4) {
            c.setCliente(cadCliente.cadastraCF());
            cadCliente.adiciona(c.getCliente());
        } else if (opcao == 5) {
            c.setCliente(cadCliente.cadastraCJ());
            cadCliente.adiciona(c.getCliente());
        }

        c.setVendedor((Vendedor) cadFunc.busca(cpf));

        System.out.printf("Codigo do serviço: ");
        int codigo = (entrada.nextInt());

        c.setServico(cadServico.cadastro(codigo));

        return c;
    }

}

package controle;

import java.util.ArrayList;
import java.util.List;
import modelo.Servico;

/**
 * Classe de cadastro de Servico
 *
 * @author
 */
public class CadastroServico implements Dao<Servico> {

    List<Servico> servicos;

    /**
     * Construtor de Servico
     *
     */
    public CadastroServico() {
        servicos = new ArrayList<>();
    }

    @Override
    public boolean adiciona(Servico obj) {
        return servicos.add(obj);
    }

    @Override
    public boolean remove(int codigo) {
        return servicos.remove(busca(codigo));
    }

    @Override
    public Servico busca(int codigo) {
        if (servicos.isEmpty()) {
            return null;
        } else {
            for (Servico serv : servicos) {
                if (serv.getCodigo() == codigo) {
                    return serv;
                }
            }
            return null;
        }
    }
/**Metodo para buscar cadastro do serviço pelo codigo
 * 
 * @param codigo código do serviço
 * @return o cadastro do servico que contém o código
 */
    public Servico cadastro(int codigo) {
        return busca(codigo);
    }

}

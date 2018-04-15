package controle;

import java.io.IOException;
import java.util.List;

/**
 * Essa classe contém metodos para realizar CRUD
 *
 * @author
 * @param <T>
 * @version 1.0
 */
public interface Dao<T> {

    /**
     * Adiciona o cadastro a uma lista
     *
     * @param obj Elemento a ser adicionado na lista
     * @return true caso o cadastro seja feito com sucesso
     */
    public boolean salvar(T obj) throws IOException, ClassNotFoundException;

    /**
     * Remove um cadastro em uma lista
     *
     * @param codigo Codigo do cadastro a ser removido
     * @return true caso o cadastro seja removido
     */
    public boolean remove(int codigo, int linha) throws IOException, ClassNotFoundException;   
    
    public boolean remove(int codigo) throws IOException, ClassNotFoundException; 
    /**
     * Faz a busca de um cadastro em uma lista a partir do seu codigo
     *
     * @param codigo Codigo do cadastro a ser retornado
     * @return o cadastro ao qual pertence o codigo
     */
    public T busca(int codigo) throws IOException, ClassNotFoundException;
    
    public List listar() throws IOException, ClassNotFoundException;
}


package controle;

/**
 * Essa classe contém metodos para realizar CRUD
 *
 * @author Rafaela
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
    public boolean adiciona(T obj);

    /**
     * Remove um cadastro em uma lista
     *
     * @param codigo Codigo do cadastro a ser removido
     * @return true caso o cadastro seja removido
     */
    public boolean remove(int codigo);

    /**
     * Faz a busca de um cadastro em uma lista a partir do seu codigo
     *
     * @param codigo Codigo do cadastro a ser retornado
     * @return o cadastro ao qual pertence o codigo
     */
    public T busca(int codigo);
}

package controle;

import java.io.IOException;
import java.util.List;

/**
 * Essa Classe que contém métodos para realizar CRUD
 *
 * @author Amanda e Rafaela
 * @param <T>
 */
public interface Dao<T> {

    /**
     * Adiciona o cadastro a uma lista
     *
     * @param obj Elemento a ser adicionado na lista
     * @return true caso o cadastro seja realizado com sucesso
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean salvar(T obj) throws IOException, ClassNotFoundException;

    /**
     * Metodo para remover compra
     *
     * @param codigo-codigo da compra
     * @param linha referente a linha da tabela
     * @return true se for removido com sucesso
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean remove(int codigo, int linha) throws IOException, ClassNotFoundException;

    /**
     *
     * @param codigo- codigo do Objeto a ser removido
     * @return true se for removido com sucesso
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean remove(int codigo) throws IOException, ClassNotFoundException;

    /**
     * Metodo para fazer busca
     *
     * @param codigo- codigo do cadastro a ser buscado
     * @return obj
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public T busca(int codigo) throws IOException, ClassNotFoundException;

    /**
     * Metodo para listar
     *
     * @return retorna a lista
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public List listar() throws IOException, ClassNotFoundException;
}

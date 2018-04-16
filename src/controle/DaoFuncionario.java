package controle;

import java.io.IOException;
import java.util.List;
import modelo.Funcionario;

/**
 * Essa classe contém metodos para o CRUD de funcionario
 *
 * @author Amanda e Rafaela
 * @param <T>
 */
public interface DaoFuncionario<T> {

    /**
     * Método para salvar um obj
     *
     * @param obj obj a ser salvo
     * @return true caso o cadastro seja realizado com sucesso
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean salvar(T obj) throws IOException, ClassNotFoundException;

    /**
     * Metodo para remover obj
     *
     * @param obj obj a ser removido
     * @return true caso a remoção ocorra com sucesso
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean remove(T obj) throws IOException, ClassNotFoundException;

    /**
     * Método para fazer busca
     *
     * @param cpf Cpf do funcionario que deseja buscar
     * @return obj T
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public T busca(String cpf) throws IOException, ClassNotFoundException;

    /**
     * Método para listar
     *
     * @return obj T
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public List listar() throws IOException, ClassNotFoundException;

    /**
     * Metodo para atualizar
     *
     * @param obj T
     * @return true caso a atualização seja realizada com sucesso
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean atualizar(T obj) throws IOException, ClassNotFoundException;

    /**
     * Método para Autenticar Login
     *
     * @param cpf Cpf do usuario que irá fazer login
     * @param senha senha do usuario que irá fazer o login
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean autentica(String cpf, String senha) throws IOException, ClassNotFoundException;
}

package controle;

import java.io.IOException;
import java.util.List;
import modelo.Funcionario;

/**
 * Essa classe contém metódos para realizar CRUD de funcionario
 *
 * @author Amanda e Rafaela
 * @param <T> -
 * @version 1.0
 *
 */
public interface DaoFuncionario<T> {

    /**
     * Adiciona um funcionario a lista
     *
     * @param obj Elemento a ser adicionado a lista
     * @return true caso seja adicionado o funcionario com sucesso
     */
    public boolean salvar(T obj) throws IOException, ClassNotFoundException ;

     /**
     * Remove um funcionário da lista 
     *
     * @param obj Elemento a ser removido na lista
     * @return true caso seja encontrado o funcionario e ele seja removido
     */
    public boolean remove(T obj) throws IOException, ClassNotFoundException ;

    /**
     * Busca um cadastro na lista atraves do CPF
     *
     * @param cpf Cpf do funcionario a ser removido
     * @return o cadastro do funcionario a que o cpf pertence
     */
    public T busca(String cpf) throws IOException, ClassNotFoundException ;
    
    public List listar() throws IOException, ClassNotFoundException ;
    /**
     * 
     * @param cpf cpf do funcionario que deseja atualizar o cadastro
     * @param obj funcionario
     * @return true caso o funcionario seja atualizado
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public boolean atualizar(T obj) throws IOException, ClassNotFoundException;

    /**
     * Autentica o login de funcionário
     *
     * @param cpf Cpf do funcionario que realiza o login
     * @param senha senha do funcionario que realiza o login
     * @return true caso o cpf e a senha sejam compativeis com o do funcionário
     */
    public boolean autentica(String cpf, String senha) throws IOException, ClassNotFoundException ;
}

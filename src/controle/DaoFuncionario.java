package controle;

import modelo.Funcionario;

/**
 * Essa classe contém metódos para realizar CRUD de funcionario
 *
 * @author
 * @param <T> -
 * @version 1.0
 *
 */
public interface DaoFuncionario<T extends Funcionario> {

    /**
     * Adiciona um funcionario a lista
     *
     * @param obj Elemento a ser adicionado a lista
     * @return true caso seja adicionado o funcionario com sucesso
     */
    public boolean adiciona(T obj);

    /**
     * Remove um funcionário da lista através da busca pelo seu CPF
     *
     * @param cpf Cpf do funcionario a ser adicionado
     * @return true caso seja encontrado o funcionario e ele seja removido
     */
    public boolean remove(String cpf);

    /**
     * Busca um cadastro na lista atraves do CPF
     *
     * @param cpf Cpf do funcionario a ser removido
     * @return o cadastro do funcionario a que o cpf pertence
     */
    public T busca(String cpf);

    /**
     * Autentica o login de funcionário
     *
     * @param cpf Cpf do funcionario que realiza o login
     * @param senha senha do funcionario que realiza o login
     * @return true caso o cpf e a senha sejam compativeis com o do funcionário
     */
    public boolean autentica(String cpf, String senha);
}

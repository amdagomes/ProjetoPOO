package Dao;

public interface Dao<T> {
/**Metodo para salvar um objeto*/
    public boolean salvar(T obj);
/** Metodo para excluir um objeto*/
    public boolean remover(T obj);
/**Metodo para fazer a busca de um objeto pelo codigo*/
    public T buscar(int codigo);
}

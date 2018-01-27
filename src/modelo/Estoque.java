package modelo;

/**
 *
 * @author Amanda
 */
public class Estoque {
    private static int codigo;
    private String tipo;
    private String nome;
    private int quantidade;

    public Estoque(int codigo, String tipo, String nome, int quantidade) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public static int getCodigo() {
        return codigo;
    }
    public static void setCodigo(int codigo) {
        Estoque.codigo = codigo;
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}

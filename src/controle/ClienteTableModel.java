package controle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import modelo.Cliente;

/**
 * Essa classe contém métodos para controle de tabela
 *
 * @author Amanda e Rafaela
 */
public class ClienteTableModel extends AbstractTableModel {

    private File file;
    private CadastroCliente cadCliente;
    private String[] colunas = {"Código", "Nome", "RG", "CPF", "Nascimento", "Email", "Telefone", "NºCartao"};

    /**
     * Construtor da classe ClienteTableModel
     *
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public ClienteTableModel() throws IOException, ClassNotFoundException {
        file = new File("Arquivos/clientes.bin");

        if (!file.exists()) {
            file.createNewFile();
        }
    }

    /**
     * Metodo retornar quantidade de linhas da tabela
     *
     * @return int quantidade de linhas
     */
    @Override
    public int getRowCount() { // quantidade de linhas da tabela
        List<Cliente> dados = null;
        try {
            dados = listar();
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro no numero de linhas da tabela cliente");
        }
        return dados.size();
    }

    /**
     * Método para setar o numero de linhas da tabela
     *
     * @param n numero de linhas
     * @return int numero de linhas
     */
    public int setRowCount(int n) {
        return n;
    }

    /**
     * Método que retorna a quantidade de colunas
     *
     * @return int referente a quantidade de colunas
     */
    @Override
    public int getColumnCount() { // quantidade de colunas da tabela
        return colunas.length;
    }

    /**
     * Método para retorna o valor de uma linha da tabela
     *
     * @param linha linha da tabela
     * @param coluna coluna da tabela
     * @return objeto
     */
    @Override
    public Object getValueAt(int linha, int coluna) { //pega os valores da tabela
        List<Cliente> dados = null;
        try {
            dados = listar();
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar os clientes");
        }

        switch (coluna) {
            case 0:
                return dados.get(linha).getCodigo();
            case 1:
                return dados.get(linha).getNome();
            case 2:
                return dados.get(linha).getRg();
            case 3:
                return dados.get(linha).getCpf();
            case 4:
                return dados.get(linha).getDataDeNascimento();
            case 5:
                return dados.get(linha).getEmail();
            case 6:
                return dados.get(linha).getTelefone();
            case 7:
                return dados.get(linha).getNumeroDoCartao();
        }
        return null;
    }

    /**
     * Método para atualizar a linha de uma tabela
     *
     * @param valor Objeto a ser atualizado
     * @param linha int Linha da tabela
     * @param coluna int Coluna da tabela
     */
    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        List<Cliente> dados = null;
        try {
            dados = listar();
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar os clientes");
        }

        switch (coluna) {
            case 1:
                dados.get(linha).setNome((String) valor);
                break;
            case 2:
                dados.get(linha).setRg((String) valor);
                break;
            case 3:
                dados.get(linha).setCpf((String) valor);
                break;
            case 4:
                dados.get(linha).setDataDeNascimento((String) valor);
                break;
            case 5:
                dados.get(linha).setEmail((String) valor);
                break;
            case 6:
                dados.get(linha).setTelefone((String) valor);
                break;
            case 7:
                dados.get(linha).setNumeroDoCartao((String) valor);
                break;
        }

        this.fireTableRowsUpdated(linha, linha);
    }

    /**
     * Método que retorna o nome da coluna
     *
     * @param column int coluna
     * @return String com o nome da coluna
     */
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    /**
     * Para inserir dados na tabela
     */
    public void insere() {
        List<Cliente> dados = null;

        try {
            dados = listar();
            this.fireTableDataChanged();
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar os clientes");
        }

    }

    /**
     * Método para atualizar a tabela
     *
     * @param linha int referente a linha da tabela
     * @param obj obj a ser atualizado
     * @return true se for atualizado com sucesso
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean atualizaTabela(int linha, Cliente obj) throws IOException, ClassNotFoundException {
        List<Cliente> clientes = listar();

        setValueAt(obj.getNome(), linha, 1);
        setValueAt(obj.getRg(), linha, 2);
        setValueAt(obj.getCpf(), linha, 3);
        setValueAt(obj.getDataDeNascimento(), linha, 4);
        setValueAt(obj.getEmail(), linha, 5);
        setValueAt(obj.getTelefone(), linha, 6);
        setValueAt(obj.getNumeroDoCartao(), linha, 7);

        fireTableRowsUpdated(linha, linha);
        return true;
    }

    /**
     * Método para remover dados da linha
     *
     * @param linha int referente a linha da tabela
     * @return true se for removido com sucesso
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean remove(int linha) throws IOException, ClassNotFoundException {
        List<Cliente> clientes = listar();

        fireTableDataChanged();
        return true;
    }

    /**
     * Metodo para listar
     *
     * @return List
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public List listar() throws IOException, ClassNotFoundException {

        if (file.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            return (List<Cliente>) in.readObject();
        } else {
            return new ArrayList<>();
        }

    }

    /**
     * Método para atualizar o arquivo
     *
     * @param dados List
     */
    private void atualizaArquivo(List<Cliente> dados) {

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(dados);
            out.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro na atualização do arquivo");
        }

    }

}

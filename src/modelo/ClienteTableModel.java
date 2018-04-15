package modelo;

import controle.CadastroCliente;
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

public class ClienteTableModel extends AbstractTableModel {
    
    private File file;
    private CadastroCliente cadCliente;
    private String[] colunas = {"Código" , "Nome", "RG", "CPF", "Nascimento",  "Email", "Telefone", "NºCartao"};
    
    public ClienteTableModel() throws IOException, ClassNotFoundException{
        file = new File("Arquivos/clientes.bin");
        
        if(!file.exists()){
            file.createNewFile();
        }
    }

    @Override
    public int getRowCount(){ // quantidade de linhas da tabela
        List<Cliente> dados = null;
        try {
            dados = listar();
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar os clientes");
        } 
        return dados.size();
    }

    @Override
    public int getColumnCount() { // quantidade de colunas da tabela
        return colunas.length;
    }

    @Override
    public Object getValueAt( int linha, int coluna) { //pega os valores da tabela
        List<Cliente> dados = null;
        try {
            dados = listar();
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar os clientes");
        } 
        
        switch(coluna){
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
    
    @Override
    public void setValueAt(Object valor, int linha, int coluna){
        List<Cliente> dados = null;
        try {
            dados = listar();
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar os clientes");
        } 
        
        switch(coluna){
            case 1:
                dados.get(linha).setNome((String) valor);
            case 2:
                dados.get(linha).setRg((String) valor);
            case 3:
                dados.get(linha).setCpf((String) valor);
            case 4:
                dados.get(linha).setDataDeNascimento((String) valor);
            case 5:
                dados.get(linha).setEmail((String) valor);
            case 6:
                dados.get(linha).setTelefone((String) valor);
            case 7:
                dados.get(linha).setNumeroDoCartao((String) valor);
        }
        
        this.fireTableDataChanged();
    }
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    
    
    public void insere(){
        List<Cliente> dados = null;
        
        try {
           dados = listar(); 
           this.fireTableDataChanged(); 
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar os clientes");
        } 
        
    }
    
    public boolean atualizaTabela(Cliente obj) throws IOException, ClassNotFoundException{
        CadastroCliente cadCliente = new CadastroCliente();
        List<Cliente> clientes = listar();
        
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getCodigo() == obj.getCodigo()){
                this.setValueAt(obj.getNome(), i, 1);
                this.setValueAt(obj.getRg(), i, 2);
                this.setValueAt(obj.getCpf(), i, 3);
                this.setValueAt(obj.getDataDeNascimento(), i, 4);
                this.setValueAt(obj.getEmail(), i, 5);
                this.setValueAt(obj.getTelefone(), i, 6);
                this.setValueAt(obj.getNumeroDoCartao(), i, 7);
                
                this.fireTableDataChanged();
                return true;
            }
        }
        return false;
    }
    
    public List listar() throws IOException, ClassNotFoundException {
        
        if(file.length() > 0){
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            return (List<Cliente>) in.readObject();
        } else{
            return new ArrayList<>();
        }
        
    }
    
    private void atualizaArquivo(List<Cliente> dados) throws IOException {
        
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(dados);
            out.close();
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Erro na atualização do arquivo");
        }
   
    }
    
}

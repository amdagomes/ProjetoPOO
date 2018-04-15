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
import modelo.Cliente;

/**
 * Classe de cadastro de Cliente
 *
 * @author
 */
public class CadastroCliente implements Dao<Cliente> {

    private File file;

    /**
     * Construtor de cliente
     *
     */
    public CadastroCliente() throws IOException {
        file = new File("Arquivos/clientes.bin");
        
        if(!file.exists()){
            file.createNewFile();
        }
    }

    @Override
    public boolean salvar(Cliente obj) throws IOException, ClassNotFoundException  {
        
        List<Cliente> clientes = listar();
        obj.setCodigo(clientes.size() + 1);
        if(clientes.add(obj)){
            atualizaArquivo(clientes);
            return true;
        } else {
            return false;
        }
         
    }
    
    public boolean atualizar(Cliente obj) throws IOException, ClassNotFoundException{
        List<Cliente> clientes = listar();
        
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getCodigo() == obj.getCodigo()){
                clientes.set(i, obj);
                atualizaArquivo(clientes);
                return true;
            }
        }
       
        return false;
        
    }

    @Override
    public boolean remove(int cod) throws IOException, ClassNotFoundException{
        
        List<Cliente> clientes = listar();
        Cliente cliente = busca(cod);
        
        return clientes.remove(cliente);
        
    }

    @Override
    public Cliente busca(int cod) throws IOException, ClassNotFoundException{
        
        List<Cliente> clientes = listar();
        
        for(Cliente c : clientes){
            if(c.getCodigo() == cod){
                return c;
            }
        }
        
        return null;
        
    }

    @Override
    public List listar() throws IOException, ClassNotFoundException {
        
        if(file.length() > 0){
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            return (List<Cliente>) in.readObject();
        } else{
            return new ArrayList<>();
        }
        
    }
    
    private void atualizaArquivo(List<Cliente> clientes) throws IOException {
        
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(clientes);
            out.close();
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Erro na atualização do arquivo");
        }
   
    }

}

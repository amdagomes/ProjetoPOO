package controle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
        //verifica se existe numero de cartão repetido e cria outro aleatorio
        obj.setNumeroDoCartao(geraNumero(clientes));
    
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
    public boolean remove(int cod, int linha) throws IOException, ClassNotFoundException{
        
        List<Cliente> clientes = listar();
        Cliente cliente = busca(cod);
        
        if(clientes.remove(cliente)){
            atualizaArquivo(clientes);
            return true;
        }
        
        return false;
        
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

    @Override
    public boolean remove(int cod) throws IOException, ClassNotFoundException {
        List<Cliente> clientes = listar();
        Cliente cliente = busca(cod);
        CadastroCliente cadCliente = new CadastroCliente();
        
        if(clientes.remove(cliente)){
            atualizaArquivo(clientes);
            return true;
        }
        
        return false;
    }

    private String geraNumero(List<Cliente> clientes) {
        Random num = new Random();
        String nCartao = Integer.toString(num.nextInt(1000) + 1000) + "-" + Integer.toString(num.nextInt(80) + 10);
        int cont = 0;
        
        if(clientes.size() > 0){
            while(true){
                for(Cliente c : clientes){
                    if(c.getNumeroDoCartao().equals(nCartao)){
                        cont++;
                    }
                }
                if(cont == 0){
                    break;
                } else{
                    nCartao = Integer.toString(num.nextInt(1000) + 1000) + "-" + Integer.toString(num.nextInt(80) + 10);
                }
            }
        } 
        return nCartao;
    }

}

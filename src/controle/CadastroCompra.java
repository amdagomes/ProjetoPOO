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
import modelo.Compra;
import modelo.Vendedor;

/**
 * Classe de cadastro de compra
 *
 * @author Amanda e Rafaela
 */

public class CadastroCompra implements Dao<Compra> {

    
    private File file;

    
    public CadastroCompra() throws IOException {
        file = new File("Arquivos/vendas.bin");
        
        if(!file.exists()){
            file.createNewFile();
        }
    }

   @Override
    public boolean salvar(Compra obj) throws IOException, ClassNotFoundException  {
        
        List<Compra> compras = listar();
        obj.setCodigo(compras.size() + 1);
        if(compras.add(obj)){
            CadastroCliente cadCliente = new CadastroCliente();
            cadCliente.salvar(obj.getCliente());
            atualizaArquivo(compras);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean atualizar(Compra obj) throws IOException, ClassNotFoundException{
        //obj se refere-se a um objeto de compra com os novos valores
        List<Compra> compras = listar();
        
        CadastroCliente cadCliente = new CadastroCliente();
       
        for(int i = 0; i < compras.size(); i++){
            if(compras.get(i).getCodigo() == obj.getCodigo()){
                cadCliente.atualizar(obj.getCliente());
                Compra compra = compras.get(i);
                compra.setCliente(obj.getCliente());
                compra.setServico(obj.getServico());
                compra.setVendedor((Vendedor) obj.getVendedor());
                compras.set(i, compra);
                
                atualizaArquivo(compras);
                return true;
            }
        }
        return false;

    }
    
    @Override
    public boolean remove(int cod, int linha) throws IOException, ClassNotFoundException{
        
        List<Compra> compras = listar();
        Compra compra = busca(cod);
        CadastroCliente cadCliente = new CadastroCliente();
        
        if(cadCliente.remove(compra.getCliente().getCodigo(), linha)){
            compras.remove(compra);
            atualizaArquivo(compras);
            return true;
        }
        
        return false;
    }

    @Override
    public Compra busca(int cod) throws IOException, ClassNotFoundException{
        
        List<Compra> compras = listar();
        
        for(Compra c : compras){
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
            return (List<Compra>) in.readObject();
        } else{
            return new ArrayList<>();
        }
        
    }
    
    private void atualizaArquivo(List<Compra> compras){
        
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(compras);
            out.close();
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Erro na atualização do arquivo");
        }
   
    }

    @Override
    public boolean remove(int cod) throws IOException, ClassNotFoundException {
        List<Compra> compras = listar();
        Compra compra = busca(cod);
        CadastroCliente cadCliente = new CadastroCliente();
        
        if(cadCliente.remove(compra.getCliente().getCodigo())){
            compras.remove(compra);
            atualizaArquivo(compras);
            return true;
        }
        
        return false;
    }

}


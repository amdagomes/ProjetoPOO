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

/**
 * Classe de cadastro de compra
 *
 * @author
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
         
        if(compras.add(obj)){
            atualizaArquivo(compras);
            return true;
        } else {
            return false;
        }
         
    }

    @Override
    public boolean remove(int cod) throws IOException, ClassNotFoundException{
        
        List<Compra> compras = listar();
        Compra compra = busca(cod);
        
        return compras.remove(compra);
        
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
    
    private void atualizaArquivo(List<Compra> compras) throws IOException {
        
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(compras);
            out.close();
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Erro na atualização do arquivo");
        }
   
    }

}


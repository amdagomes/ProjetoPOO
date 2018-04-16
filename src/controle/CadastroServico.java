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
import modelo.Servico;

/**
 * Classe de cadastro de Servico
 *
 * @author Amanda e Rafaela
 */
public class CadastroServico implements Dao<Servico> {

    private File file;

    /**
     * Construtor de Servico
     *
     */
    public CadastroServico() throws IOException {
        file = new File("Arquivos/servicos.bin");
        
        if(!file.exists()){
            file.createNewFile();
        }
    }

   @Override
    public boolean salvar(Servico obj) throws IOException, ClassNotFoundException  {
        
        List<Servico> servicos = listar();
         
        if(servicos.add(obj)){
            atualizaArquivo(servicos);
            return true;
        } else {
            return false;
        }
         
    }

    @Override
    public boolean remove(int cod) throws IOException, ClassNotFoundException{
        
        List<Servico> servicos = listar();
        Servico servico = busca(cod);
        
        return servicos.remove(servico);
        
    }

    @Override
    public Servico busca(int cod) throws IOException, ClassNotFoundException{
        
        List<Servico> servicos = listar();
        
        for(Servico s : servicos){
            if(s.getCodigo()== cod){
                return s;
            }
        }
        
        return null;
        
    }

    @Override
    public List listar() throws IOException, ClassNotFoundException {
        
        if(file.length() > 0){
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            return (List<Servico>) in.readObject();
        } else{
            return new ArrayList<>();
        }
        
    }
    
    private void atualizaArquivo(List<Servico> servicos) throws IOException {
        
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(servicos);
            out.close();
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Erro na atualização do arquivo");
        }
   
    }

    @Override
    public boolean remove(int cod, int linha) throws IOException, ClassNotFoundException{
        
        List<Servico> servicos = listar();
        Servico servico = busca(cod);
        
        if(servicos.remove(servico)){
            atualizaArquivo(servicos);
            return true;
        }
        
        return false;
        
    }
    
}

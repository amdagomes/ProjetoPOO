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
import modelo.Vendedor;

/**
 * Classe de cadastro de funcionário
 *
 * @author
 */
public class CadastroFuncionario implements DaoFuncionario<Vendedor>{

    private File file; 

    /**
     * construtor de funcionario
     *
     */
    public CadastroFuncionario() throws IOException {
        file = new File("Arquivos/funcionarios.bin");
        
        if(!file.exists()){
            file.createNewFile();
        }
    }

    @Override
    public boolean salvar(Vendedor obj) throws IOException, ClassNotFoundException  {
        
        if (busca(obj.getCpf()) == null) {

            List<Vendedor> funcionarios = listar();

            if (funcionarios.add(obj)) {
                atualizaArquivo(funcionarios);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    } 
 

    @Override
    public boolean remove(Vendedor funcionario) throws IOException, ClassNotFoundException {
        
        List<Vendedor> funcionarios = listar();
        
        if(funcionarios.remove(funcionario)){
            atualizaArquivo(funcionarios);
            return true;
        }
        else{
            return false;
        }
        
    }

    @Override
    public Vendedor busca(String cpf) throws IOException, ClassNotFoundException {
        
        List<Vendedor> funcionarios = listar();
        
        for(Vendedor f : funcionarios){
            if(f.getCpf().equals(cpf)){
                return f;
            }
        }
        
        return null;
        
    }

    @Override
    public List listar() throws IOException, ClassNotFoundException {
        
        if(file.length() > 0){
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            return (List<Vendedor>) in.readObject();
        } else{
            return new ArrayList<>();
        }
        
    }

    @Override
    public boolean autentica(String cpf, String senha) throws IOException, ClassNotFoundException  {
        List<Vendedor> funcionarios = listar();
        
        for(Vendedor f : funcionarios){
            if(f.getCpf().equals(cpf) && f.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }

    private void atualizaArquivo(List<Vendedor> funcionarios) throws IOException {
        
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(funcionarios);
            out.close();
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Erro na atualização do arquivo");
        }
        
    }
    
    @Override
     public boolean atualizar(Vendedor obj) throws IOException, ClassNotFoundException{
       List <Vendedor> funcionarios = listar();
       for(int i=0;i<funcionarios.size();i++){
           if(funcionarios.get(i).getCpf().equals(obj.getCpf())){
               funcionarios.set(i,obj);
               atualizaArquivo(funcionarios);
               return true;
           }
       }
       return false;
    }

}
  


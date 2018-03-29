package controle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import modelo.Funcionario;

/**
 * Classe de cadastro de funcionário
 *
 * @author
 */
public class CadastroFuncionario implements DaoFuncionario<Funcionario> {

    private File file; 

    /**
     * construtor de funcionario
     *
     */
    public CadastroFuncionario() throws IOException {
        file = new File("funcionarios.bin");
        
        if(!file.exists()){
            file.createNewFile();
        }
    }

    @Override
    public boolean salva(Funcionario obj) throws IOException, ClassNotFoundException  {
        
         List<Funcionario> funcionarios = listar();
         
         if(funcionarios.add(obj)){
             atualizaArquivo(funcionarios);
             return true;
         } else {
             return false;
         }
         
    }

    @Override
    public boolean remove(String cpf) throws IOException, ClassNotFoundException {
        
        List<Funcionario> funcionarios = listar();
        Funcionario funcionario = busca(cpf);
        
        for(Funcionario f : funcionarios){
            if(f.equals(funcionario)){
                funcionarios.remove(f);
                atualizaArquivo(funcionarios);
                return true;
            }
        }
        
        return false;
        
    }

    @Override
    public Funcionario busca(String cpf) throws IOException, ClassNotFoundException {
        
        List<Funcionario> funcionarios = listar();
        
        for(Funcionario f : funcionarios){
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
            return (List<Funcionario>) in.readObject();
        } else{
            return new ArrayList<>();
        }
        
    }

    @Override
    public boolean autentica(String cpf, String senha) throws IOException, ClassNotFoundException  {
        List<Funcionario> funcionarios = listar();
        
        for(Funcionario f : funcionarios){
            if(f.getCpf().equals(cpf) && f.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }

    private void atualizaArquivo(List<Funcionario> funcionario) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        
        out.writeObject(funcionario);
        out.close();
    }
  
}

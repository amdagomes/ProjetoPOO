package modelo;

public abstract  class Cliente{
    
    private String email;
    private String telefone;
    private String numeroDoCartao; 
    private Endereco endereco;

    public Cliente(String email, String telefone, String numeroDoCartao, Endereco endereco) {
        this.email = email;
        this.telefone = telefone;
        this.numeroDoCartao = numeroDoCartao;
        
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }
    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
   
}
    
    


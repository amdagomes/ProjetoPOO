package modelo;

public class ClientePessoaJuridica extends Cliente {

    private String razaoSocial;
    private String cnpj;

    public ClientePessoaJuridica(String razaoSocial, String cnpj, String email, String telefone, String numeroDoCartao, Endereco endereco) {
        super(email, telefone, numeroDoCartao, endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

   

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
        }
}
        
        
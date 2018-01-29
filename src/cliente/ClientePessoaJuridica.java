package cliente;

public class ClientePessoaJuridica extends Cliente {

    private String razaoSocial;
    private String cnpj;

    public ClientePessoaJuridica(String razaoSocial, String cnpj, String email, String telefone, String numeroDoCartao, String bairro, String cidade, String cep, String logradouro, String tipoDeLogradouro, int numero, String complemento, String pontoDeReferencia) {
        super(email, telefone, numeroDoCartao, bairro, cidade, cep, logradouro, tipoDeLogradouro, numero, complemento, pontoDeReferencia);
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
        
        
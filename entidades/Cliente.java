package entidades;
public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String numeroDeTelefone;
    
    public Cliente (String nome, String cpf, String endereco, String email, String numeroDeTelefone){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.numeroDeTelefone = numeroDeTelefone;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getEmail(){
        return email;
    }
    public String getNumeroDeTelefone(){
        return numeroDeTelefone;
    }
    public void SetNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setNumeroDeTelefone(String numeroDeTelefone){
        this.numeroDeTelefone = numeroDeTelefone;
    }


}

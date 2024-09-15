package entidades;
public class Transportadora {
   private String nomeDaTransportadora;
   private String cnpj;
   
   public Transportadora (String nomeDaTransportadora, String cnpj){
    this.nomeDaTransportadora = nomeDaTransportadora;
    this.cnpj = cnpj;
   }
   public String GetNomeDaTransportadora(){
    return nomeDaTransportadora;
   }
   public String getCnpj(){
    return cnpj;
   }
   public void setNomeDaTransportadora (String nomeDaTransportadora){
    this.nomeDaTransportadora = nomeDaTransportadora;
   }
   public void setCnpj (String cnpj){
    this.cnpj = cnpj;
   }
}

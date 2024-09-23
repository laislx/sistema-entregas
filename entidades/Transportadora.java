package entidades;
public class Transportadora {
   private static String nomeDaTransportadora;
   private static String cnpj;
   
   
   public Transportadora (String nomeDaTransportadora, String cnpj){
    Transportadora.nomeDaTransportadora = nomeDaTransportadora;
    this.cnpj = cnpj;
   }
   public static String GetNomeDaTransportadora(){
    return nomeDaTransportadora;
   }
   public static String getCnpj(){
    return cnpj;
   }
   
   public void setNomeDaTransportadora (String nomeDaTransportadora){
    this.nomeDaTransportadora = nomeDaTransportadora;
   }
   public void setCnpj (String cnpj){
    this.cnpj = cnpj;
   }
}

package entidades;

public class EntregaRapida extends Entrega{
    private float preco; 
    public EntregaRapida (String situacao, String dataPrevista, Transportadora transportadoraResponsavel, int codigoDeRastreio, float preco){
        super(situacao, dataPrevista, transportadoraResponsavel, codigoDeRastreio);
        this.preco = preco;
    }
    public float getPreco(){
        return preco;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }   
}

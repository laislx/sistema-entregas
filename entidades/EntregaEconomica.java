package entidades;

public class EntregaEconomica extends Entrega{
    private float preco; 
    public EntregaEconomica (String situacao, String dataPrevista, Transportadora transportadoraResponsavel, int codigoDeRastreio, float preco){
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

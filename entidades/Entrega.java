package entidades;
public class Entrega{
    protected String situacao;
    protected String dataPrevista;
    protected Transportadora transportadoraResponsavel;
    protected int codigoDeRastreio;

    public Entrega(String situacao, String dataPrevista, Transportadora transportadoraResponsavel, int codigoDeRastreio){
        this.situacao = situacao;
        this.dataPrevista = dataPrevista;
        this.transportadoraResponsavel = transportadoraResponsavel;
        this.codigoDeRastreio = codigoDeRastreio;
    }
    public String getSituacao(){
        return situacao;
    }
    public String getDataPrevista(){
        return dataPrevista;
    }
    public Transportadora getTransportadoraResponsavel(){
        return transportadoraResponsavel;
    }
    public int getCodigoDeRastreio(){
        return codigoDeRastreio;
    }
    public void setSituacao(String situacao){
        this.situacao = situacao; 
    }
    public void setDataPrevista(String dataPrevista){
        this.dataPrevista = dataPrevista;
    }
    public void setTransportadoraResponsavel(Transportadora transportadoraResponsavel){
        this.transportadoraResponsavel = transportadoraResponsavel; 
    }
    public void setCodigoDeRastreio(int codigoDeRastreio){
        this.codigoDeRastreio = codigoDeRastreio;
    }
}
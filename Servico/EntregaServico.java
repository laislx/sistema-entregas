package Servico;

import java.util.ArrayList;
import entidades.Entrega;

public class EntregaServico {

 public void addEntrega(Entrega entrega, ArrayList<Entrega>arrayEntrega){
    if (entrega.getSituacao().equals("") || entrega.getCodigoDeRastreio() == 0 || entrega.getDataPrevista().equals("") || entrega.getTransportadoraResponsavel().equals("") ){
        System.out.println("preencha todos os campos corretamente");
    } else {
        arrayEntrega.add(entrega);
    }
 }
       
    public void removerEntrega(Entrega entrega, ArrayList<Entrega> arrayEntrega){
        for (Entrega e : arrayEntrega){
            if (e.getCodigoDeRastreio() == entrega.getCodigoDeRastreio()){
                arrayEntrega.remove(e);
            }
        }
    }

    
    public void atualizarEntrega(Entrega entrega, ArrayList<Entrega> arrayEntrega){
         for(Entrega e : arrayEntrega){
            if(e.getCodigoDeRastreio() == entrega.getCodigoDeRastreio()){
                e.setCodigoDeRastreio(0);
                        }
        }
    }
    public Entrega buscaEntrega(Entrega entrega, ArrayList<Entrega> arrayEntrega) {
        for(Entrega e : arrayEntrega){
            if(e.getCodigoDeRastreio() == entrega.getCodigoDeRastreio()){
                return e;
            }
        }
        return null;
    }    
    }



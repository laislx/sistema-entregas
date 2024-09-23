package Servico;

import java.util.ArrayList;

import entidades.Transportadora;

public class TransportadoraServico {
  public void addTransportadora(Transportadora transportadora, ArrayList<Transportadora>ArrayTransportadora){
   if(Transportadora.GetNomeDaTransportadora().equals("") || Transportadora.getCnpj().equals("")){
            System.out.println("Preencha todos os campos");
        } else {
            ArrayTransportadora.add(transportadora);
        } 
    }

    
    
    public void removerTransportadora(Transportadora transportadora, ArrayList<Transportadora>ArrayTransportadora){
        for (Transportadora t : ArrayTransportadora){
            if  (t.getCnpj().equals(transportadora.getCnpj())) {
                ArrayTransportadora.remove(t);
            
                  }  else{} 
            }
            }
     


    public void atualizarTransportadora(Transportadora transportadora, ArrayList<Transportadora>ArrayTransportadora){
        for(Transportadora t : ArrayTransportadora){
              if(t.getCnpj().equals(transportadora.getCnpj())){
                t.setCnpj("");
                        
    } else {}
}
}
    public Transportadora buscarTransportadora(String cnpjTransportadora, ArrayList<Transportadora>ArrayTransportadora){
        for(Transportadora t : ArrayTransportadora){
            if(t.getCnpj().equals(cnpjTransportadora)){
                return t;
            }
        }
        return null;
    }
    

}

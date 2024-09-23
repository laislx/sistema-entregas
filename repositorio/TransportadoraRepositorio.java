package repositorio;

import java.util.List;

import entidades.Transportadora;
import interfaces.ITransportadora;

public class TransportadoraRepositorio implements ITransportadora {
    @Override
    public void addTransportadora(Transportadora transportadora){}
    
    @Override
    public void removerTransportadora(Transportadora transportadora){}

    @Override
    public void atualizarTransportadora(Transportadora transportadora){}

    @Override
    public Transportadora buscarTransportadora(String cnpjTransportadora){
        return null;
    }

    @Override
    public List<Transportadora> todosTransportadora(){
        return null;
    }

    @Override
    public Transportadora buscaTransportadora(String cnpjTransportadora) {
        
        throw new UnsupportedOperationException("Unimplemented method 'buscaTransportadora'");
    }
}
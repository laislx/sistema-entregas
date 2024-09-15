

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
    public Transportadora buscarTransportadora(Transportadora cnpjTransportadora){
        return null;
    }

    @Override
    public List<Transportadora> todosTransportadora(){
        return null;
    }
}
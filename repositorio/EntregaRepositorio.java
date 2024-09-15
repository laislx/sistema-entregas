package repositorio;

import java.util.List;

import entidades.Entrega;
import interfaces.IEntrega;

public class EntregaRepositorio implements IEntrega {
    @Override
    public void addEntrega(Entrega entrega){}
    
    @Override
    public void removerEntrega(Entrega entrega){}

    @Override
    public void atualizarEntrega(Entrega entrega){}

    @Override
    public List<Entrega> todosEntrega(){
        return null;
    }

    @Override
    public Entrega buscaEntrega(Entrega codigoDeRastreioEntrega) {
        throw new UnsupportedOperationException("Unimplemented method 'buscaEntrega'");
    }
}
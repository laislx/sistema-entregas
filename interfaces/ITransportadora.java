package interfaces;

import java.util.List;

import entidades.Transportadora;


public interface ITransportadora {
    void addTransportadora(Transportadora transportadora);
    void removerTransportadora(Transportadora transportadora);
    void atualizarTransportadora(Transportadora transportadora);
    Transportadora buscaTransportadora(String cnpjTransportadora);
    List<Transportadora> todosTransportadora();
}
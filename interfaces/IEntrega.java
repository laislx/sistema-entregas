package interfaces;

import java.util.List;

import entidades.Entrega;

public interface IEntrega {
    void addEntrega(Entrega entrega);
    void removerEntrega(Entrega entrega);
    void atualizarEntrega(Entrega entrega);
    Entrega buscaEntrega(Entrega codigoDeRastreioEntrega);
    List<Entrega> todosEntrega();
}
package interfaces;

import java.util.List;

import entidades.Cliente;

public interface ICliente {
    void addCliente(Cliente cliente);
    void removerCliente(Cliente cliente);
    void atualizarCliente(Cliente cliente);
    Cliente buscarCliente(Cliente cpfCliente);
    List<Cliente> todosClientes();
}

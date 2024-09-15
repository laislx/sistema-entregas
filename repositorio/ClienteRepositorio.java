package repositorio;

import java.util.List;

import entidades.Cliente;
import interfaces.ICliente;

public class ClienteRepositorio implements ICliente {
    @Override
    public void addCliente(Cliente cliente){}
    
    @Override
    public void removerCliente(Cliente cliente){}

    @Override
    public void atualizarCliente(Cliente cliente){}

    @Override
    public Cliente buscarCliente(Cliente cpfCliente){
        return null;
    }

    @Override
    public List<Cliente> todosClientes(){
        return null;
    }
}

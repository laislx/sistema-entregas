package repositorio;

import java.util.ArrayList;
import java.util.List;

import Servico.ClienteServico;
import entidades.Cliente;
import interfaces.ICliente;

public class ClienteRepositorio implements ICliente {
    private ArrayList<Cliente> arrayClientes = new ArrayList<>();
    ClienteServico clienteServico = new ClienteServico();
    @Override
    public void addCliente(Cliente cliente){
        clienteServico.addCliente(cliente, arrayClientes);
    }
    
    @Override
    public void removerCliente(Cliente cliente){
        clienteServico.removerCliente(cliente, arrayClientes);
    }

    @Override
    public void atualizarCliente(Cliente cliente){
        clienteServico.atualizarCliente(cliente, arrayClientes);
    }

    @Override
    public Cliente buscarCliente(String cpfCliente){
        return clienteServico.buscarCliente(cpfCliente, arrayClientes);
    }

    @Override
    public List<Cliente> todosClientes(){
        return arrayClientes;
    }
}

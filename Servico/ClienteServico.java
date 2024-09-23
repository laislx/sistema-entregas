 package Servico;

import java.util.ArrayList;

import entidades.Cliente;

public class ClienteServico {

    public void addCliente(Cliente cliente, ArrayList<Cliente> arrayClientes){
        if(cliente.getNome().equals("") || cliente.getCpf().equals("") || cliente.getEndereco().equals("") || cliente.getEmail().equals("") || cliente.getNumeroDeTelefone().equals("")){
            System.out.println("Preencha todos os campos");
        } else {
            arrayClientes.add(cliente);
        }
    }
    
    public void removerCliente(Cliente cliente,ArrayList<Cliente> arrayClientes ){
        for(Cliente c : arrayClientes){
                if(c.getCpf().equals(cliente.getCpf())){
                    arrayClientes.remove(c);
                }
        }

    }

    public void atualizarCliente(Cliente cliente, ArrayList<Cliente> arrayClientes){
        for(Cliente c : arrayClientes){
            if(c.getCpf().equals(cliente.getCpf())){
                c.setCpf(null);
            }
        }

    }

    public Cliente buscarCliente(String cpfCliente, ArrayList<Cliente> arrayClientes){
        for(Cliente c : arrayClientes){
            if(c.getCpf().equals(cpfCliente)){
                return c;
            }
        }
        return null;
    }
}
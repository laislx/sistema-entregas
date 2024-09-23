
import entidades.Cliente;
import repositorio.ClienteRepositorio;

public class Main {
    public static void main(String[] args) {
        ClienteRepositorio clienteRepositorio = new ClienteRepositorio();
        Cliente cliente01 = new Cliente(null, null, null, null, null);
        clienteRepositorio.addCliente(cliente01);
    }
    
}

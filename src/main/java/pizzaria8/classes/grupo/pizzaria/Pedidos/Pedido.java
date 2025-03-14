package pizzaria8.classes.grupo.pizzaria.Pedidos;

import pizzaria8.classes.grupo.pizzaria.Clientes.Cliente;

public class Pedido {
    private int id;
    private Cliente cliente;

    // Construtor vazio (necessário para serialização JSON)
    public Pedido() {
    }

    // Construtor com parâmetros
    public Pedido(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

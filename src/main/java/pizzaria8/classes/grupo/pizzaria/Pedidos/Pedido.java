package pizzaria8.classes.grupo.pizzaria.Pedidos;

import jakarta.persistence.*;
import pizzaria8.classes.grupo.pizzaria.Clientes.Cliente;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne // Muitos pedidos para um cliente
    private Cliente cliente;

    public Pedido() {}

    public Pedido(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}
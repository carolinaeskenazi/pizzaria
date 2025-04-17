package pizzaria8.classes.grupo.pizzaria.Entregas;

import jakarta.persistence.*;
import pizzaria8.classes.grupo.pizzaria.Pedidos.Pedido;

@Entity
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedido pedido;

    @Column(nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "entregador_id", nullable = false)
    private Entregador entregador;

    public Entrega() {}

    public Entrega(Pedido pedido, String status, Entregador entregador) {
        this.pedido = pedido;
        this.status = status;
        this.entregador = entregador;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public int tempoEstimado() {
        return 30;
    }

    public void entregarPedido() {
        System.out.println("Pedido entregue por " + entregador.getNome());
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }
}

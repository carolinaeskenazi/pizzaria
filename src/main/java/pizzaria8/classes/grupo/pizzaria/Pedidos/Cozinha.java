package pizzaria8.classes.grupo.pizzaria.Pedidos;

import java.util.ArrayList;
import java.util.List;

public class Cozinha {
    private List<Pedido> pedidosEmPreparo;
    private List<Pedido> pedidosFinalizados;

    public Cozinha() {
        this.pedidosEmPreparo = new ArrayList<>();
        this.pedidosFinalizados = new ArrayList<>();
    }

    // Adiciona um pedido à fila de preparo
    public void adicionarPedido(Pedido pedido) {
        pedidosEmPreparo.add(pedido);
        System.out.println("Pedido #" + pedido.getId() + " adicionado à cozinha.");
    }

    // Finaliza um pedido e remove da lista de preparo
    public void finalizarPedido(int idPedido) {
        Pedido pedidoFinalizado = null;
        for (Pedido p : pedidosEmPreparo) {
            if (p.getId() == idPedido) {
                pedidoFinalizado = p;
                break;
            }
        }
        if (pedidoFinalizado != null) {
            pedidosEmPreparo.remove(pedidoFinalizado);
            pedidosFinalizados.add(pedidoFinalizado);
            System.out.println("Pedido #" + idPedido + " finalizado e pronto para entrega.");
        } else {
            System.out.println("Pedido #" + idPedido + " não encontrado na cozinha.");
        }
    }

    // Exibe a lista de pedidos em preparo
    public void exibirPedidosEmPreparo() {
        if (pedidosEmPreparo.isEmpty()) {
            System.out.println("Nenhum pedido em preparo.");
        } else {
            System.out.println("Pedidos em preparo:");
            for (Pedido p : pedidosEmPreparo) {
                System.out.println("Pedido #" + p.getId() + " - Cliente: " + p.getCliente().getNome());
            }
        }
    }

    // Exibe os pedidos já finalizados
    public void exibirPedidosFinalizados() {
        if (pedidosFinalizados.isEmpty()) {
            System.out.println("Nenhum pedido finalizado.");
        } else {
            System.out.println("Pedidos finalizados:");
            for (Pedido p : pedidosFinalizados) {
                System.out.println("Pedido #" + p.getId() + " - Cliente: " + p.getCliente().getNome());
            }
        }
    }
}




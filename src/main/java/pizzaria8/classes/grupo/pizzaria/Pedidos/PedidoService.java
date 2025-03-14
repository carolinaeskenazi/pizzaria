package pizzaria8.classes.grupo.pizzaria.Pedidos;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PedidoService {

    // HashMap para simular um "banco de dados" em memória
    private HashMap<Integer, Pedido> pedidos = new HashMap<>();

    // Retorna todos os pedidos
    public HashMap<Integer, Pedido> getPedidos() {
        return pedidos;
    }

    // Salva (ou atualiza) um pedido no HashMap
    public void salvarPedido(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
    }

    // Busca um pedido específico pelo ID
    public Pedido getPedido(int id) {
        return pedidos.get(id);
    }

    // Remove um pedido do HashMap
    public Pedido removerPedido(int id) {
        return pedidos.remove(id);
    }

    // Edita um pedido existente
    public Pedido editarPedido(int id, Pedido pedido) {
        Pedido pedidoEditar = getPedido(id);
        if (pedidoEditar != null) {
            // Se foi enviado um novo ID, atualiza
            if (pedido.getId() != 0 && pedido.getId() != pedidoEditar.getId()) {
                pedidoEditar.setId(pedido.getId());
            }
            // Se foi enviado um novo cliente, atualiza
            if (pedido.getCliente() != null) {
                pedidoEditar.setCliente(pedido.getCliente());
            }
        }
        return pedidoEditar;
    }
}

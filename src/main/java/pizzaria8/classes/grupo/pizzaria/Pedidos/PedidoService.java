package pizzaria8.classes.grupo.pizzaria.Pedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> getPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido salvarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido getPedido(int id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public void removerPedido(int id) {
        pedidoRepository.deleteById(id);
    }

    public Pedido editarPedido(int id, Pedido pedido) {
        Pedido existente = getPedido(id);
        if (existente != null) {
            existente.setCliente(pedido.getCliente());
            return pedidoRepository.save(existente);
        }
        return null;
    }
}
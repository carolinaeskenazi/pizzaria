package pizzaria8.classes.grupo.pizzaria.Pedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/pedidos")
    public List<Pedido> getPedidos() {
        return pedidoService.getPedidos();
    }

    @PostMapping("/pedido")
    @ResponseStatus(HttpStatus.CREATED)
    public String salvarPedido(@RequestBody Pedido pedido) {
        if (pedido.getCliente() == null) {
            return "Cliente não pode ser nulo";
        }
        pedidoService.salvarPedido(pedido);
        return "Pedido salvo com sucesso";
    }

    @GetMapping("/pedido/{id}")
    public Pedido getPedido(@PathVariable int id) {
        return pedidoService.getPedido(id);
    }

    @DeleteMapping("/pedido/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluirPedido(@PathVariable int id) {
        pedidoService.removerPedido(id);
    }

    @PutMapping("/pedido/{id}")
    public String editarPedido(@PathVariable int id, @RequestBody Pedido pedido) {
        Pedido atualizado = pedidoService.editarPedido(id, pedido);
        return atualizado != null ? "Alterado com sucesso" : "Não encontrado";
    }
}
package pizzaria8.classes.grupo.pizzaria.Pedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    // Retorna todos os pedidos
    @GetMapping("/pedidos")
    public HashMap<Integer, Pedido> getPedidos() {
        return pedidoService.getPedidos();
    }

    // Cria um novo pedido
    @PostMapping("/pedido")
    @ResponseStatus(HttpStatus.CREATED)
    public String salvarPedido(@RequestBody Pedido pedido) {
        // Validações simples de exemplo
        if (pedido.getId() == 0) {
            return "ID não pode ser 0";
        }
        if (pedido.getCliente() == null) {
            return "Cliente não pode ser nulo";
        }

        pedidoService.salvarPedido(pedido);
        return "Pedido salvo com sucesso";
    }

    // Busca pedido por ID
    @GetMapping("/pedido/{id}")
    public Pedido getPedido(@PathVariable int id) {
        return pedidoService.getPedido(id);
    }

    // Deleta pedido por ID
    @DeleteMapping("/pedido/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String excluirPedido(@PathVariable int id) {
        Pedido pedido = pedidoService.removerPedido(id);
        if (pedido != null) {
            return "Pedido removido com sucesso";
        }
        return "Pedido não encontrado";
    }

    // Edita pedido
    @PutMapping("/pedido/{id}")
    public String editarPedido(@PathVariable int id, @RequestBody Pedido pedido) {
        Pedido pedidoRetorno = pedidoService.editarPedido(id, pedido);
        if (pedidoRetorno != null) {
            return "Pedido alterado com sucesso";
        }
        return "Pedido não encontrado";
    }
}

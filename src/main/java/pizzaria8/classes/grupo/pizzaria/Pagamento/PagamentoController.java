package pizzaria8.classes.grupo.pizzaria.Pagamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoService service;

    /** Cria um novo pagamento */
    @PostMapping
    public Pagamento salvar(@RequestBody Pagamento pagamento) {
        return service.salvar(pagamento);
    }

    /** Lista todos os pagamentos (paginação) */
    @GetMapping
    public Page<Pagamento> listar(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size
    ) {
        return service.listarTodos(PageRequest.of(page, size));
    }

    /** Filtra pagamentos por status “pago” */
    @GetMapping("/filtro")
    public Page<Pagamento> filtrar(
            @RequestParam boolean pago,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size
    ) {
        return service.filtrarPorPago(pago, PageRequest.of(page, size));
    }
}

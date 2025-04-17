package pizzaria8.classes.grupo.pizzaria.Clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    @GetMapping
    public Page<Cliente> listar(@RequestParam(defaultValue = "0") int page,
                                @RequestParam(defaultValue = "5") int size) {
        return service.listarTodos(PageRequest.of(page, size));
    }

    @GetMapping("/filtro")
    public Page<Cliente> filtrar(@RequestParam String nome,
                                 @RequestParam(defaultValue = "0") int page,
                                 @RequestParam(defaultValue = "5") int size) {
        return service.filtrarPorNome(nome, PageRequest.of(page, size));
    }
}
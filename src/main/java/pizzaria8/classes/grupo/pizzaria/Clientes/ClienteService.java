package pizzaria8.classes.grupo.pizzaria.Clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente salvar(Cliente c) {
        return repo.save(c);
    }

    public Page<Cliente> listarTodos(Pageable p) {
        return repo.findAll(p);
    }

    public Page<Cliente> filtrarPorNome(String nome, Pageable p) {
        return repo.findByNomeContainingIgnoreCase(nome, p);
    }
}
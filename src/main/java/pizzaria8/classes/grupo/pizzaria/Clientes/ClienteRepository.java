package pizzaria8.classes.grupo.pizzaria.Clientes;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
    Page<Cliente> findByNomeContainingIgnoreCase(String nome, Pageable pageable);
}
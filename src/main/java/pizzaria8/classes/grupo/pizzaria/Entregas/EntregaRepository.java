package pizzaria8.classes.grupo.pizzaria.Entregas;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EntregaRepository extends JpaRepository<Entrega, Integer> {

    List<Entrega> findByStatus(String status);

    List<Entrega> findByEntregadorId(int entregadorId);
}

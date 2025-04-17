package pizzaria8.classes.grupo.pizzaria.Entregas;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EntregadorRepository extends JpaRepository<Entregador, Integer> {

    List<Entregador> findByVeiculo(String veiculo);
}


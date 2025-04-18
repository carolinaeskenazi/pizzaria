// src/main/java/pizzaria8/classes/grupo/pizzaria/Pagamento/PagamentoRepository.java
package pizzaria8.classes.grupo.pizzaria.Pagamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, String> {
    Page<Pagamento> findByPago(boolean pago, Pageable pageable);
}

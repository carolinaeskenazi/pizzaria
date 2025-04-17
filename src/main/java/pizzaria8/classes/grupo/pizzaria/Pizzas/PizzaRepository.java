package pizzaria8.classes.grupo.pizzaria.Pizzas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    Pizza findBySabor(String sabor);
}
package pizzaria8.classes.grupo.pizzaria.Pizzas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public Page<Pizza> getPizzas(Pageable pageable) {
        return pizzaRepository.findAll(pageable);
    }

    public Pizza salvarPizza(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    public Pizza getPizza(Long id) {
        return pizzaRepository.findById(id).orElse(null);
    }

    public Pizza getPizzaPorSabor(String sabor) {
        return pizzaRepository.findBySabor(sabor);
    }

    public boolean excluirPizza(Long id) {
        if (pizzaRepository.existsById(id)) {
            pizzaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Pizza editarPizza(Long id, Pizza pizzaAtualizada) {
        Optional<Pizza> existente = pizzaRepository.findById(id);
        if (existente.isPresent()) {
            Pizza pizza = existente.get();
            pizza.setSabor(pizzaAtualizada.getSabor());
            pizza.setPreco(pizzaAtualizada.getPreco());
            pizza.setIngredientes(pizzaAtualizada.getIngredientes());
            return pizzaRepository.save(pizza);
        }
        return null;
    }
}
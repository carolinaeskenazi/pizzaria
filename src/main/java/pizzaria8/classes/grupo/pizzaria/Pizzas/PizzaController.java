package pizzaria8.classes.grupo.pizzaria.Pizzas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pizza")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;


    @GetMapping
    public Page<Pizza> listarPizzas(Pageable pageable) {
        return pizzaService.getPizzas(pageable);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pizza criarPizza(@RequestBody Pizza pizza) {
        return pizzaService.salvarPizza(pizza);
    }

    @GetMapping("/{id}")
    public Pizza buscarPizza(@PathVariable Long id) {
        return pizzaService.getPizza(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluirPizza(@PathVariable Long id) {
        if (!pizzaService.excluirPizza(id)) {
            throw new RuntimeException("Pizza não encontrada");
        }
    }

    @PutMapping("/{id}")
    public Pizza editarPizza(@PathVariable Long id, @RequestBody Pizza pizza) {
        Pizza atualizada = pizzaService.editarPizza(id, pizza);
        if (atualizada == null) {
            throw new RuntimeException("Pizza não encontrada");
        }
        return atualizada;
    }

    @GetMapping("/sabor/{sabor}")
    public Pizza buscarPorSabor(@PathVariable String sabor) {
        return pizzaService.getPizzaPorSabor(sabor);
    }
}
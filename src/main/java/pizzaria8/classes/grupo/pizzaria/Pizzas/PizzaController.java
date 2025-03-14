package pizzaria8.classes.grupo.pizzaria.Pizzas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/pizzas")
    public HashMap<String, Pizza> getPizzas() {

        return pizzaService.getPizzas();
    }

    @PostMapping("/pizza")
    @ResponseStatus(HttpStatus.CREATED)
    public String salvarPizza(@RequestBody Pizza pizza) {
        if (pizza.getSabor() == null) {
            return "Nome não pode ser nulo";
        }

        if (pizza.getPreco() == 0) {
            return "Preco não pode ser nulo";
        }

        pizzaService.salvarPizza(pizza);
        return "Pizza salva com sucesso";
    }

    @GetMapping("/pizza/{sabor}")
    public Pizza getPizza(@PathVariable String sabor) {

        return pizzaService.getPizza(sabor);
    }


    @DeleteMapping("/pizza/{sabor}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String excluirCliente(@PathVariable String sabor) {
        Pizza pizza = pizzaService.removerPizza(sabor);
        if (pizza != null) {
            return "Pizza removida com sucesso";
        }
        return "Pizza não encontrado";
    }

    @PutMapping("/pizza/{sabor}")
    public String editarPizza(@PathVariable String sabor, @RequestBody Pizza pizza) {

        Pizza pizzaRetorno = pizzaService.editarPizza(sabor, pizza);
        if (pizzaRetorno != null) {
            return "Pizza alterada com sucesso";
        }
        return "Pizza não encontrado";
    }
}

package pizzaria8.classes.grupo.pizzaria.Menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizzaria8.classes.grupo.pizzaria.Pizzas.Pizza;

import java.util.List;

@RestController
@RequestMapping("/cardapio")
public class CardapioController {

    @Autowired
    private CardapioService cardapio;

    @GetMapping("/pizzas")
    public List<Pizza> getPizzas() {
        return cardapio.getPizzas();
    }

    @GetMapping("/bebidas")
    public List<Bebida> getBebidas() {
        return cardapio.getBebidas();
    }

    @GetMapping("/acompanhamentos")
    public List<Acompanhamento> getAcompanhamentos() {
        return cardapio.getAcompanhamentos();
    }

    @PostMapping("/pizza")
    public String adicionarPizza(@RequestBody Pizza pizza) {
        cardapio.salvarPizza(pizza);
        return "Pizza adicionada com sucesso";
    }

    @PostMapping("/bebida")
    public String adicionarBebida(@RequestBody Bebida bebida) {
        cardapio.salvarBebida(bebida);
        return "Bebida adicionada com sucesso";
    }

    @PostMapping("/acompanhamento")
    public String adicionarAcompanhamento(@RequestBody Acompanhamento acompanhamento) {
        cardapio.salvarAcompanhamento(acompanhamento);
        return "Acompanhamento adicionado com sucesso";
    }

    @DeleteMapping("/pizza/{id}")
    public String removerPizza(@PathVariable Long id) {
        cardapio.removerPizza(id);
        return "Pizza removida com sucesso";
    }

    @DeleteMapping("/bebida/{id}")
    public String removerBebida(@PathVariable Long id) {
        cardapio.removerBebida(id);
        return "Bebida removida com sucesso";
    }

    @DeleteMapping("/acompanhamento/{id}")
    public String removerAcompanhamento(@PathVariable Long id) {
        cardapio.removerAcompanhamento(id);
        return "Acompanhamento removido com sucesso";
    }
}

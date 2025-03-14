package pizzaria8.classes.grupo.pizzaria.Menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pizzaria8.classes.grupo.pizzaria.Pizzas.Pizza;

import java.util.HashMap;

@RestController
public class CardapioController {

    @Autowired
    private CardapioService cardapioService;

    @GetMapping("/cardapio/pizzas")
    public HashMap<String, Pizza> getPizzas() {

        return cardapioService.getPizzas();
    }

    @GetMapping("/cardapio/bebidas")
    public HashMap<String, Bebida> getBebidas() {

        return cardapioService.getBebidas();
    }

    @GetMapping("/cardapio/acompanhamentos")
    public HashMap<String, Acompanhamento> getAcompanhamentos() {

        return cardapioService.getAcompanhamentos();
    }

    @PostMapping("/cardapio/pizza")
    @ResponseStatus(HttpStatus.CREATED)
    public String salvarPizza(@RequestBody Pizza pizza) {
        if (pizza.getSabor() == null) {
            return "Nome não pode ser nulo";
        }

        if (pizza.getPreco() == 0) {
            return "Preco não pode ser nulo";
        }

        cardapioService.salvarPizza(pizza);
        return "Pizza salva com sucesso";
    }

    @PostMapping("/cardapio/bebida")
    @ResponseStatus(HttpStatus.CREATED)
    public String salvarBebida(@RequestBody Bebida bebida) {
        if (bebida.getNome() == null) {
            return "Nome não pode ser nulo";
        }

        if (bebida.getPreco() == 0) {
            return "Preco não pode ser nulo";
        }

        cardapioService.salvarBebida(bebida);
        return "Bebida salva com sucesso";
    }

    @PostMapping("/cardapio/acompanhamento")
    @ResponseStatus(HttpStatus.CREATED)
    public String salvarAcompanhamento(@RequestBody Acompanhamento acompanhamento) {
        if (acompanhamento.getNome() == null) {
            return "Nome não pode ser nulo";
        }

        if (acompanhamento.getPreco() == 0) {
            return "Preco não pode ser nulo";
        }

        cardapioService.salvarAcompanhamento(acompanhamento);
        return "Acompanhamento salvo com sucesso";
    }



    @DeleteMapping("/cardapio/pizza/{sabor}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String removerPizza(@PathVariable String sabor) {
        Pizza pizza = cardapioService.removerPizza(sabor);
        if (pizza != null) {
            return "Pizza removida com sucesso";
        }
        return "Pizza não encontrada";
    }

    @DeleteMapping("/cardapio/bebida/{nome}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String removerBebida(@PathVariable String nome) {
        Bebida bebida = cardapioService.removerBebida(nome);
        if (bebida != null) {
            return "Bebida removida com sucesso";
        }
        return "Bebida não encontrada";
    }

    @DeleteMapping("/cardapio/acompanhamento/{nome}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String removerAcompanhamento(@PathVariable String nome) {
        Acompanhamento acompanhamento = cardapioService.removerAcompanhamento(nome);
        if (acompanhamento != null) {
            return "Acompanhamento removido com sucesso";
        }
        return "ACompanhamento não encontrado";
    }

}

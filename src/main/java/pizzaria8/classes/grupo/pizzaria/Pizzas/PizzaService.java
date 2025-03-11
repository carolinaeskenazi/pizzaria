package pizzaria8.classes.grupo.pizzaria.Pizzas;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PizzaService {

    private HashMap<String, Pizza> pizzas = new HashMap<>();

    public HashMap<String, Pizza> getPizzas() {

        return pizzas;
    }

    public void salvarPizza(Pizza pizza) {

        pizzas.put(pizza.getSabor(), pizza);
    }

    public Pizza getPizza(String sabor) {

        return pizzas.get(sabor);
    }

    public Pizza removerPizza(String sabor) {

        return pizzas.remove(sabor);
    }

    public Pizza editarPizza(String sabor, Pizza pizza) {
        Pizza pizzaEditar = getPizza(sabor);

        if (pizzaEditar != null) {

            if (pizza.getSabor() != null) {
                pizzaEditar.setSabor(pizza.getSabor());
            }

            if (pizza.getPreco() != pizzaEditar.getPreco()) {
                pizzaEditar.setPreco(pizza.getPreco());
            }
        }
        return pizzaEditar;
    }
}

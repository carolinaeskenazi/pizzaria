package pizzaria8.classes.grupo.pizzaria.Menu;

import org.springframework.stereotype.Service;
import pizzaria8.classes.grupo.pizzaria.Pizzas.Pizza;

import java.util.HashMap;

@Service
public class CardapioService {

    private HashMap<String, Pizza> pizzas = new HashMap<>();
    private HashMap<String, Bebida> bebidas = new HashMap<>();
    private HashMap<String, Acompanhamento> acompanhamentos = new HashMap<>();



    public void salvarPizza(Pizza pizza) {

        pizzas.put(pizza.getSabor(), pizza);
    }

    public void salvarBebida(Bebida bebida) {

        bebidas.put(bebida.getNome(), bebida);
    }

    public void salvarAcompanhamento(Acompanhamento acompanhamento) {

        acompanhamentos.put(acompanhamento.getNome(), acompanhamento);
    }

    public HashMap<String, Pizza> getPizzas() {

        return pizzas;
    }

    public HashMap<String, Bebida> getBebidas() {

        return bebidas;
    }

    public HashMap<String, Acompanhamento> getAcompanhamentos() {

        return acompanhamentos;
    }

    public Pizza removerPizza(String sabor) {

        return pizzas.remove(sabor);
    }

    public Bebida removerBebida(String nome) {

        return bebidas.remove(nome);
    }

    public Acompanhamento removerAcompanhamento(String nome) {

        return acompanhamentos.remove(nome);
    }

}

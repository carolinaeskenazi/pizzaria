package pizzaria8.classes.grupo.pizzaria.Menu;

import pizzaria8.classes.grupo.pizzaria.Pizzas.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Pizza> pizzas;
    private List<Bebida> bebidas;
    private List<Acompanhamento> acompanhamentos;

    public Cardapio() {
        pizzas = new ArrayList<>();
        bebidas = new ArrayList<>();
        acompanhamentos = new ArrayList<>();
    }


    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public List<Acompanhamento> getAcompanhamentos() {
        return acompanhamentos;
    }

    public void setAcompanhamentos(List<Acompanhamento> acompanhamentos) {
        this.acompanhamentos = acompanhamentos;
    }
}

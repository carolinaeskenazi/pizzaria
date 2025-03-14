package pizzaria8.classes.grupo.pizzaria;

import java.util.ArrayList;
import java.util.List;
import pizzaria8.classes.grupo.pizzaria.Pizzas.Pizza;


public class Cardapio {
    private List<Pizza> pizzas;
    private List<Bebida> bebidas;
    private List<Acompanhamento> acompanhamentos;

    public Cardapio() {
        pizzas = new ArrayList<>();
        bebidas = new ArrayList<>();
        acompanhamentos = new ArrayList<>();
    }

    // Adiciona itens no cardápio
    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        System.out.println("Pizza adicionada ao cardápio: " + pizza.getSabor());
    }

    public void adicionarBebida(Bebida bebida) {
        bebidas.add(bebida);
        System.out.println("Bebida adicionada ao cardápio: " + bebida.getNome());
    }

    public void adicionarAcompanhamento(Acompanhamento acompanhamento) {
        acompanhamentos.add(acompanhamento);
        System.out.println("Acompanhamento adicionado ao cardápio: " + acompanhamento.getNome());
    }

    // mostra os itens do cardápio
    public void listarPizzas() {
        if (pizzas.isEmpty()) {
            System.out.println("Não tem pizzas no cardapio.");
        } else {
            System.out.println("Pizzas disponíveis:");
            for (Pizza p : pizzas) {
                System.out.println("- " + p.getSabor() + " | Preço: R$" + p.getPreco());
            }
        }
    }

    public void listarBebidas() {
        if (bebidas.isEmpty()) {
            System.out.println("Não tem bebidas no cardapio.");
        } else {
            System.out.println("Bebidas disponíveis:");
            for (Bebida b : bebidas) {
                System.out.println("- " + b.getNome() + " | Preço: R$" + b.getPreco());
            }
        }
    }

    public void listarAcompanhamentos() {
        if (acompanhamentos.isEmpty()) {
            System.out.println("Não tem acompanhamentos no cardapio.");
        } else {
            System.out.println("Acompanhamentos disponíveis:");
            for (Acompanhamento a : acompanhamentos) {
                System.out.println("- " + a.getNome() + " | Preço: R$" + a.getPreco());
            }
        }
    }
}

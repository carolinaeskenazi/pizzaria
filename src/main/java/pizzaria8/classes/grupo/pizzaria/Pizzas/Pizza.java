package pizzaria8.classes.grupo.pizzaria.Pizzas;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sabor;
    private double preco;

    @ElementCollection
    private List<String> ingredientes;

    public Pizza() {
    }

    public Pizza(String sabor, double preco) {
        this.sabor = sabor;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
package pizzaria8.classes.grupo.pizzaria.Menu;

import jakarta.persistence.*;

@Entity
public class Acompanhamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double preco;

    public Acompanhamento() {}

    public Acompanhamento(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

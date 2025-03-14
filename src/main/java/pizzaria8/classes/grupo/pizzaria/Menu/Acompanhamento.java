package pizzaria8.classes.grupo.pizzaria.Menu;

public class Acompanhamento {
    private String nome;
    private double preco;

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

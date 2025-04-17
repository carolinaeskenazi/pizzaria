package pizzaria8.classes.grupo.pizzaria.Entregas;

import jakarta.persistence.*;

@Entity
public class Entregador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String veiculo;

    public Entregador() {}

    public Entregador(String nome, String telefone, String veiculo) {
        this.nome = nome;
        this.telefone = telefone;
        this.veiculo = veiculo;
    }

    public void atribuirEntrega(Entrega entrega) {
        System.out.println("Entrega atribuída a " + nome);
    }

    public void atualizarLocalizacao() {
        System.out.println("Localização do entregador " + nome + " atualizada.");
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
}

package pizzaria8.classes.grupo.pizzaria.Clientes;

import jakarta.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String endereco;

    public Cliente() {}

    public Cliente(String cpf, String nome, String telefone, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

//    public void listarPedidos() {
//        if (pedidos.isEmpty()) {
//            System.out.println("Cliente " + nome + " não tem pedidos.");
//        } else {
//            System.out.println("Pedidos do cliente " + nome + ":");
//            for (Pedido p : pedidos) {
//                System.out.println("Pedido #" + p.getId());
//            }
//        }
//    }
}
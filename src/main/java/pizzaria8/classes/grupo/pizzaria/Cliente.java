package pizzaria8.classes.grupo.pizzaria;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String telefone;
    private String endereco;
    private String cpf;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nome, String telefone, String endereco,String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
        this.pedidos = new ArrayList<>();
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

    public void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Cliente " + nome + " não tem pedidos.");
        } else {
            System.out.println("Pedidos do cliente " + nome + ":");
            for (Pedido p : pedidos) {
                System.out.println("Pedido #" + p.getId());
            }
        }
    }
}

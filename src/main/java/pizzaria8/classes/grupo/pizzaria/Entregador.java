package pizzaria8.classes.grupo.pizzaria;

class Entregador {
    private String nome;
    private String telefone;
    private String veiculo;

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
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getVeiculo() {
        return veiculo;
    }
}
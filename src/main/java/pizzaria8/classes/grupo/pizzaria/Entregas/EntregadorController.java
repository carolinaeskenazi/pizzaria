package pizzaria8.classes.grupo.pizzaria.Entregas;

import java.util.List;

public class EntregadorController {
    private EntregadorService entregadorService = new EntregadorService();

    public void cadastrarEntregador(String nome, String telefone, String veiculo) {
        Entregador entregador = new Entregador(nome, telefone, veiculo);
        entregadorService.adicionarEntregador(entregador);
        System.out.println("Entregador cadastrado: " + nome);
    }

    public void atribuirEntrega(String nomeEntregador, Entrega entrega) {
        entregadorService.atribuirEntrega(nomeEntregador, entrega);
    }

    public void atualizarLocalizacao(String nomeEntregador) {
        entregadorService.atualizarLocalizacao(nomeEntregador);
    }



    public void listarEntregadores() {
        List<Entregador> lista = entregadorService.getEntregadores();
        for (Entregador entregador : lista) {
            System.out.println("Entregador: " + entregador.getNome() + ", Veículo: " + entregador.getVeiculo());
        }
    }
}

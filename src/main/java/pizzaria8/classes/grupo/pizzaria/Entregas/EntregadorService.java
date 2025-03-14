package pizzaria8.classes.grupo.pizzaria.Entregas;

import java.util.ArrayList;
import java.util.List;

public class EntregadorService {
    private List<Entregador> entregadores = new ArrayList<>();

    public void adicionarEntregador(Entregador entregador) {
        entregadores.add(entregador);
    }

    public Entregador buscarEntregadorPorNome(String nome) {
        return entregadores.stream()
                .filter(e -> e.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

    public void atribuirEntrega(String nomeEntregador, Entrega entrega) {
        Entregador entregador = buscarEntregadorPorNome(nomeEntregador);
        if (entregador != null) {
            entregador.atribuirEntrega(entrega);
            entrega.atualizarStatus("Em entrega");
            System.out.println("Entrega atribuída ao entregador: " + entregador.getNome());
        } else {
            System.out.println("Entregador não encontrado!");
        }
    }

    public void atualizarLocalizacao(String nomeEntregador) {
        Entregador entregador = buscarEntregadorPorNome(nomeEntregador);
        if (entregador != null) {
            entregador.atualizarLocalizacao();
        } else {
            System.out.println("Entregador não encontrado!");
        }
    }

   
    public List<Entregador> getEntregadores() {
        return entregadores;
    }
}

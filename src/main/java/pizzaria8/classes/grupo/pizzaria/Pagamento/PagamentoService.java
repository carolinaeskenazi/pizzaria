package pizzaria8.classes.grupo.pizzaria.Pagamento;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PagamentoService {

    // HashMap para simular um "banco de dados" em memória
    private HashMap<String, Pagamento> pagamentos = new HashMap<>();

    // Retorna todos os pagamentos
    public HashMap<String, Pagamento> getPagamentos() {
        return pagamentos;
    }

    // Salva (ou atualiza) um pagamento no HashMap
    public void salvarPagamento(Pagamento pagamento) {
        pagamentos.put(pagamento.getId(), pagamento);
    }

    // Busca um pagamento específico pelo ID
    public Pagamento getPagamento(String id) {
        return pagamentos.get(id);
    }

    // Remove um pagamento do HashMap
    public Pagamento removerPagamento(String id) {
        return pagamentos.remove(id);
    }

    // Edita um pagamento existente
    public Pagamento editarPagamento(String id, Pagamento pagamento) {
        Pagamento pagamentoEditar = getPagamento(id);
        if (pagamentoEditar != null) {
            // Se foi enviado um novo ID, atualiza
            if (pagamento.getId() != null) {
                pagamentoEditar.setId(pagamento.getId());
            }
            // Atualiza valor, se diferente de 0
            if (pagamento.getValor() != 0) {
                pagamentoEditar.setValor(pagamento.getValor());
            }
            // Atualiza status de pago
            pagamentoEditar.setPago(pagamento.isPago());
        }
        return pagamentoEditar;
    }
}

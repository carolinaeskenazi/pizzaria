package pizzaria8.classes.grupo.pizzaria.Pagamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository repo;

    /** Salva (ou atualiza) um pagamento */
    public Pagamento salvar(Pagamento p) {
        return repo.save(p);
    }

    /** Retorna todos os pagamentos, paginados */
    public Page<Pagamento> listarTodos(Pageable pageable) {
        return repo.findAll(pageable);
    }

    /** Retorna só os pagamentos com pago == parâmetro, paginados */
    public Page<Pagamento> filtrarPorPago(boolean pago, Pageable pageable) {
        return repo.findByPago(pago, pageable);
    }
}

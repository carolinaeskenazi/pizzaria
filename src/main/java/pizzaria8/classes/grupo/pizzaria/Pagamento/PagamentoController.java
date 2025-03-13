package pizzaria8.classes.grupo.pizzaria.Pagamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    // Retorna todos os pagamentos
    @GetMapping("/pagamentos")
    public HashMap<String, Pagamento> getPagamentos() {
        return pagamentoService.getPagamentos();
    }

    // Cria um novo pagamento
    @PostMapping("/pagamento")
    @ResponseStatus(HttpStatus.CREATED)
    public String salvarPagamento(@RequestBody Pagamento pagamento) {
        // Validações simples de exemplo
        if (pagamento.getId() == null || pagamento.getId().isEmpty()) {
            return "ID não pode ser nulo ou vazio";
        }
        if (pagamento.getValor() == 0) {
            return "Valor não pode ser 0";
        }

        pagamentoService.salvarPagamento(pagamento);
        return "Pagamento salvo com sucesso";
    }

    // Busca pagamento por ID
    @GetMapping("/pagamento/{id}")
    public Pagamento getPagamento(@PathVariable String id) {
        return pagamentoService.getPagamento(id);
    }

    // Deleta pagamento por ID
    @DeleteMapping("/pagamento/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String excluirPagamento(@PathVariable String id) {
        Pagamento pagamento = pagamentoService.removerPagamento(id);
        if (pagamento != null) {
            return "Pagamento removido com sucesso";
        }
        return "Pagamento não encontrado";
    }

    // Edita pagamento
    @PutMapping("/pagamento/{id}")
    public String editarPagamento(@PathVariable String id, @RequestBody Pagamento pagamento) {
        Pagamento pagamentoRetorno = pagamentoService.editarPagamento(id, pagamento);
        if (pagamentoRetorno != null) {
            return "Pagamento alterado com sucesso";
        }
        return "Pagamento não encontrado";
    }

    // Endpoint para realizar de fato o pagamento (chama método da classe)
    @PostMapping("/pagamento/{id}/realizar")
    public String realizarPagamento(@PathVariable String id,
                                    @RequestParam double valorPizza,
                                    @RequestParam double dinheiro) {
        Pagamento pagamento = pagamentoService.getPagamento(id);
        if (pagamento == null) {
            return "Pagamento não encontrado";
        }
        // Chama o método que está na classe Pagamento
        return pagamento.realizarPagamento(valorPizza, dinheiro);
    }
}

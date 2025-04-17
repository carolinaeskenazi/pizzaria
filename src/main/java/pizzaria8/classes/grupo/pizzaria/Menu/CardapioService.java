package pizzaria8.classes.grupo.pizzaria.Menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pizzaria8.classes.grupo.pizzaria.Pizzas.Pizza;
import pizzaria8.classes.grupo.pizzaria.Pizzas.PizzaRepository;

import java.util.List;

@Service
public class CardapioService {

    @Autowired
    private PizzaRepository pizzaRepo;

    @Autowired
    private BebidaRepository bebidaRepo;

    @Autowired
    private AcompanhamentoRepository acompanhamentoRepo;

    public void salvarPizza(Pizza pizza) {
        pizzaRepo.save(pizza);
    }

    public void salvarBebida(Bebida bebida) {
        bebidaRepo.save(bebida);
    }

    public void salvarAcompanhamento(Acompanhamento acompanhamento) {
        acompanhamentoRepo.save(acompanhamento);
    }

    public List<Pizza> getPizzas() {
        return pizzaRepo.findAll();
    }

    public List<Bebida> getBebidas() {
        return bebidaRepo.findAll();
    }

    public List<Acompanhamento> getAcompanhamentos() {
        return acompanhamentoRepo.findAll();
    }

    public void removerPizza(Long id) {
        pizzaRepo.deleteById(id);
    }

    public void removerBebida(Long id) {
        bebidaRepo.deleteById(id);
    }

    public void removerAcompanhamento(Long id) {
        acompanhamentoRepo.deleteById(id);
    }
}

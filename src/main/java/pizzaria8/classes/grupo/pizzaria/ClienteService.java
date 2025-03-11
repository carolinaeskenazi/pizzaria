package pizzaria8.classes.grupo.pizzaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class ClienteService {

    private HashMap<Integer, Cliente> clientes = new HashMap<>();

    @Autowired
    private ClienteService clienteService;

    public HashMap<Integer, Cliente> getClientes() {
        return clientes;
    }

    }


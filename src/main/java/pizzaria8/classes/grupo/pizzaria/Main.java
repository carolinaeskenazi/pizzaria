package pizzaria8.classes.grupo.pizzaria;


import pizzaria8.classes.grupo.pizzaria.Menu.Cardapio;

public class Main {
    public static void main(String[] args) {

        Cardapio cardapio = new Cardapio();

//        cardapio.adicionarPizza(new Pizza("Calabresa", 35.00));
//        cardapio.adicionarPizza(new Pizza("Marguerita", 38.00));
//
//        cardapio.adicionarBebida(new Bebida("Coca-Cola 1L", 8.00));
//        cardapio.adicionarBebida(new Bebida("Suco Natural", 10.00));
//
//        cardapio.adicionarAcompanhamento(new Acompanhamento("Batata Frita", 15.00));
//
//        cardapio.listarPizzas();
//        cardapio.listarBebidas();
//        cardapio.listarAcompanhamentos();

//-----------------------------------------------------------------------------------------------------------------
        Cozinha cozinha = new Cozinha();

        Cliente cliente1 = new Cliente("João", "99999-9999", "Rua A, 123");
        Pedido pedido1 = new Pedido(1, cliente1);

        Cliente cliente2 = new Cliente("Maria", "88888-8888", "Rua B, 456");
        Pedido pedido2 = new Pedido(2, cliente2);

        cliente2.listarPedidos();

        cozinha.adicionarPedido(pedido1);
        cozinha.adicionarPedido(pedido2);

        cozinha.exibirPedidosEmPreparo();

        cozinha.finalizarPedido(1);

        cozinha.exibirPedidosFinalizados();


//---------------------------------------------------------------------------------------------------------------------
        Entregador entregador1 = new Entregador("Joao Augusto", "9999-9999", "RPY9G19");

        Entrega entrega1 = new Entrega();

        entregador1.atribuirEntrega(entrega1);
        entregador1.atualizarLocalizacao();

        entrega1.atualizarStatus("entregue");
        entrega1.tempoEstimado();
        entrega1.entregarPedido();

    }
}





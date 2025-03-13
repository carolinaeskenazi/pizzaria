package pizzaria8.classes.grupo.pizzaria.Pagamento;

public class Pagamento {

    // ID para identificar cada pagamento no HashMap
    private String id;
    private double valor;
    private boolean pago;

    public Pagamento() {
    }

    public Pagamento(String id, double valor, boolean pago) {
        this.id = id;
        this.valor = valor;
        this.pago = pago;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public String realizarPagamento(double valorPizza, double dinheiro) {
        if (dinheiro >= valorPizza) {
            double troco = dinheiro - valorPizza;
            this.setPago(true); // Marca como pago
            return "O seu troco foi de " + troco;
        } else {
            this.setPago(false);
            return "Não foi possível concluir o pagamento!";
        }
    }
}

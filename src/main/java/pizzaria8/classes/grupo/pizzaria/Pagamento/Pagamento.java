package pizzaria8.classes.grupo.pizzaria.Pagamento;

import jakarta.persistence.*;

@Entity
@Table(name = "pagamento")
public class Pagamento {

    @Id
    private String id;

    @Column(nullable = false)
    private double valor;

    @Column(nullable = false)
    private boolean pago;

    public Pagamento() {}

    public Pagamento(String id, double valor, boolean pago) {
        this.id = id;
        this.valor = valor;
        this.pago = pago;
    }

    // Getters e Setters
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
            this.setPago(true);
            return "O seu troco foi de " + troco;
        } else {
            this.setPago(false);
            return "Não foi possível concluir o pagamento!";
        }
    }
}
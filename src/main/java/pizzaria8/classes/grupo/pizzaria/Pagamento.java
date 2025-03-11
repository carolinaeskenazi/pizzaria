package pizzaria8.classes.grupo.pizzaria;

public class Pagamento {

    private double valor;
    private boolean pago;

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

    public String realizarPagamento(double valor_pizza,double dinheiro){

        if (dinheiro >= valor_pizza){
            double troco = dinheiro - valor_pizza;
            return "O seu troco foi de" + troco;
        }
        else{
            return  "Não foi possível concluir o pagamento!";

        }


    }








}

package padroescriacionais.factorymethod.model;

public class Dinheiro implements Pagamento {

    @Override
    public void efetuaPagamento() {
        System.out.println("Pagamento em Dinheiro");
    }
}

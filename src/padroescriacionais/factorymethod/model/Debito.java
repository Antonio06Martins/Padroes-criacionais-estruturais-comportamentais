package padroescriacionais.factorymethod.model;

public class Debito implements Pagamento {

    @Override
    public void efetuaPagamento() {
        System.out.println("Pagamento no Debito");
    }
}

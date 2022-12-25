package padroescriacionais.factorymethod.model;

public class Boleto implements Pagamento {

    @Override
    public void efetuaPagamento() {
        System.out.println("Pagamento no Boleto");
    }
}

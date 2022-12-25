package padroescriacionais.factorymethod.model;

public class Credito implements Pagamento {

    @Override
    public void efetuaPagamento() {
        System.out.println("Pagamento no Credito");
    }
}

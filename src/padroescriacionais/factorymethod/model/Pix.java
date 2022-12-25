package padroescriacionais.factorymethod.model;

public class Pix implements Pagamento {

    @Override
    public void efetuaPagamento() {
        System.out.println("Pagamento no Pix");
    }
}

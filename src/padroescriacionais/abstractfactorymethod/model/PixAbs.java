package padroescriacionais.abstractfactorymethod.model;

public class PixAbs implements PagamentoAbs {

    @Override
    public String realizaPagamento() {
        return "Pagamento realizado com PIX";
    }
}

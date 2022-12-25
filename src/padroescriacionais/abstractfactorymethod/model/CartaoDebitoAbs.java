package padroescriacionais.abstractfactorymethod.model;

public class CartaoDebitoAbs implements PagamentoAbs {

    @Override
    public String realizaPagamento() {
        return "Pagamento com Cartão de Debito";
    }
}

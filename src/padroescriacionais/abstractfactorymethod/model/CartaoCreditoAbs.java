package padroescriacionais.abstractfactorymethod.model;

public class CartaoCreditoAbs implements PagamentoAbs {

    @Override
    public String realizaPagamento() {
        return "Pagamento com Cartão de Credito";
    }
}
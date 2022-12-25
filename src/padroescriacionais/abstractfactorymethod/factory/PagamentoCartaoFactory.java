package padroescriacionais.abstractfactorymethod.factory;

import padroescriacionais.abstractfactorymethod.abstractfactory.PagamentoAbstractFactory;
import padroescriacionais.abstractfactorymethod.model.*;

public class PagamentoCartaoFactory extends PagamentoAbstractFactory {

    @Override
    public PagamentoAbs getPagamento(FormaPagamentoAbs formaPagamentoAbs) {
        return switch (formaPagamentoAbs) {
            case CARTAO_CREDITO -> new CartaoCreditoAbs();
            case CARTAO_DEBITO -> new CartaoDebitoAbs();
            default -> new PagamentoPendente();
        };
    }
}

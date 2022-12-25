package padroescriacionais.abstractfactorymethod.abstractfactory;

import padroescriacionais.abstractfactorymethod.factory.PagamentoCartaoFactory;
import padroescriacionais.abstractfactorymethod.factory.PagamentoImediatoFactory;

public class FactoryProducer {

    public static PagamentoAbstractFactory getFactoryPagamento(TipoPagamento tipoPagamento) {
        return switch (tipoPagamento) {
            case CARTAO -> new PagamentoCartaoFactory();
            case PIX_DINHEIRO -> new PagamentoImediatoFactory();
            default -> null;
        };
    }
}

package padroescriacionais.abstractfactorymethod.factory;

import padroescriacionais.abstractfactorymethod.abstractfactory.PagamentoAbstractFactory;
import padroescriacionais.abstractfactorymethod.model.*;

public class PagamentoImediatoFactory extends PagamentoAbstractFactory {

    @Override
    public PagamentoAbs getPagamento(FormaPagamentoAbs formaPagamentoAbs) {
        return switch (formaPagamentoAbs) {
            case PIX -> new PixAbs();
            case DINHEIRO -> new DinheiroAbs();
            default -> new PagamentoPendente();
        };
    }
}

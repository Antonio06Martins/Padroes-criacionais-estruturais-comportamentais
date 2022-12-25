package padroescriacionais.abstractfactorymethod.abstractfactory;

import padroescriacionais.abstractfactorymethod.model.FormaPagamentoAbs;
import padroescriacionais.abstractfactorymethod.model.PagamentoAbs;

public abstract class PagamentoAbstractFactory {
    public abstract PagamentoAbs getPagamento(FormaPagamentoAbs formaPagamentoAbs);
}

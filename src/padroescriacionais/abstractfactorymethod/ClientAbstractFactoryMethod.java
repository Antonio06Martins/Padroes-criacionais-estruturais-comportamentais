package padroescriacionais.abstractfactorymethod;

import padroescriacionais.abstractfactorymethod.abstractfactory.FactoryProducer;
import padroescriacionais.abstractfactorymethod.abstractfactory.PagamentoAbstractFactory;
import padroescriacionais.abstractfactorymethod.abstractfactory.TipoPagamento;
import padroescriacionais.abstractfactorymethod.model.FormaPagamentoAbs;
import padroescriacionais.abstractfactorymethod.model.PagamentoAbs;

public class ClientAbstractFactoryMethod {

    public static void main(String[] args) {

        PagamentoAbstractFactory abstractFactory = FactoryProducer.getFactoryPagamento(TipoPagamento.CARTAO);
        PagamentoAbs pagamentoAbs = abstractFactory.getPagamento(FormaPagamentoAbs.CARTAO_CREDITO);
        var pagamentoEfetuado = pagamentoAbs.realizaPagamento();
        System.out.println(pagamentoEfetuado);

        System.out.println("-------------------------------------------------------------------------------------------------");

        PagamentoAbstractFactory abstractFactory2 = FactoryProducer.getFactoryPagamento(TipoPagamento.PIX_DINHEIRO);
        PagamentoAbs pagamentoAbs2 = abstractFactory2.getPagamento(FormaPagamentoAbs.PIX);
        var pagamentoEfetuado2 = pagamentoAbs2.realizaPagamento();
        System.out.println(pagamentoEfetuado2);
    }
}

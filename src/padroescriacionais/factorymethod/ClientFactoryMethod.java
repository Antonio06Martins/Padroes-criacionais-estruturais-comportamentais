package padroescriacionais.factorymethod;

import padroescriacionais.factorymethod.factory.PagamentoFactory;
import padroescriacionais.factorymethod.model.FormaPagamento;
import padroescriacionais.factorymethod.model.Pagamento;

public class ClientFactoryMethod {

    public static void main(String[] args) {

//        Pagamento pagamento = PagamentoFactory.getPagamento(FormaPagamento.BOLETO);
//        Pagamento pagamento = PagamentoFactory.getPagamento(FormaPagamento.CREDITO);
//        Pagamento pagamento = PagamentoFactory.getPagamento(FormaPagamento.DEBITO);
        Pagamento pagamento = PagamentoFactory.getPagamento(FormaPagamento.PIX);
        //Pagamento pagamento = PagamentoFactory.getPagamento(FormaPagamento.DINHEIRO);
        pagamento.efetuaPagamento();
    }
}

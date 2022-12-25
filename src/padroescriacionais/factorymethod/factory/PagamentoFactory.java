package padroescriacionais.factorymethod.factory;

import padroescriacionais.factorymethod.model.*;

public class PagamentoFactory {

    public static Pagamento getPagamento(FormaPagamento formaPagamento) {

        return switch (formaPagamento) {
            case DEBITO -> new Debito();
            case CREDITO -> new Credito();
            case BOLETO -> new Boleto();
            case PIX -> new Pix();
            default -> new Dinheiro();
        };
    }
}

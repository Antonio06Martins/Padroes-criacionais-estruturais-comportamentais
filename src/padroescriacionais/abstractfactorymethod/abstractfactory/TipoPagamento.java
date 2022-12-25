package padroescriacionais.abstractfactorymethod.abstractfactory;

public enum TipoPagamento {
    CARTAO,
    PIX_DINHEIRO,

    FORMA_PAGAMENTO_NAO_ENCONTRADA {
        final String forma = "Forma Pagamento não encontrada";
    }
}

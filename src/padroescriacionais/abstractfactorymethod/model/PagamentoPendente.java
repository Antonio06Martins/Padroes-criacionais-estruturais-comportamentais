package padroescriacionais.abstractfactorymethod.model;

public class PagamentoPendente implements PagamentoAbs {

    @Override
    public String realizaPagamento() {
        return "Pagamento pendente";
    }
}
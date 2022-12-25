package padroescriacionais.abstractfactorymethod.model;

public class DinheiroAbs implements PagamentoAbs {

    @Override
    public String realizaPagamento() {
        return "Pagamento realizado com Dinheiro";
    }
}

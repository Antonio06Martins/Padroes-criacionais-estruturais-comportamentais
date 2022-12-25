package padroescriacionais.singleton;

import padroescriacionais.singleton.model.MensagemUnica;

public class ClietnSingleton {

    public static void main(String[] args) {

        MensagemUnica mensagemUnica = MensagemUnica.getInstance();
        mensagemUnica.mensagem();
    }
}

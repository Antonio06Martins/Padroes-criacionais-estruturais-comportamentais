package padroescriacionais.singleton.model;

public class MensagemUnica {

    //cria um objeto de MensagemUnica
    private static MensagemUnica instance = new MensagemUnica();

    //torna o construtor privado para que esta classe não possa ser instanciado
    private MensagemUnica() {}


    //Pega o único objeto disponível
    public static MensagemUnica getInstance() {
        return instance;
    }

    public void mensagem() {
        System.out.println("Padrão Singleton sendo usado");
    }
}

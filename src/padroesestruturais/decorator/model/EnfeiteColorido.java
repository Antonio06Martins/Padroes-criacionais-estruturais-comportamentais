package padroesestruturais.decorator.model;

import padroesestruturais.decorator.decorate.ArvoreDecorator;
import padroesestruturais.decorator.decorate.ArvoreNatal;

public class EnfeiteColorido extends ArvoreDecorator {

    public EnfeiteColorido(ArvoreNatal arvoreNatal) {
        super(arvoreNatal);
    }
    public String decorete() {
        return super.decorando() + decorandoComEnfeiteColorido();
    }

    private String decorandoComEnfeiteColorido() {
        return "Com Enfeite Colorido";
    }
}

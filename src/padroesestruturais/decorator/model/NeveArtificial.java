package padroesestruturais.decorator.model;

import padroesestruturais.decorator.decorate.ArvoreDecorator;
import padroesestruturais.decorator.decorate.ArvoreNatal;

public class NeveArtificial extends ArvoreDecorator {

    public NeveArtificial(ArvoreNatal arvoreNatal) {
        super(arvoreNatal);

    }

    public String decorete() {
        return super.decorando() + decorandoComNeveArtificial();
    }

    public String decorandoComNeveArtificial() {
        return "Com Neve Artificial";
    }
}

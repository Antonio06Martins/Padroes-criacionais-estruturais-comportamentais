package padroesestruturais.decorator.model;

import padroesestruturais.decorator.decorate.ArvoreDecorator;
import padroesestruturais.decorator.decorate.ArvoreNatal;

public class LuzDeBolha extends ArvoreDecorator {

    public LuzDeBolha(ArvoreNatal arvoreNatal) {
        super(arvoreNatal);
    }
    public String decorete() {
        return super.decorando() + decorandoComLuzDeBolha();
    }

    private String decorandoComLuzDeBolha() {
        return "Com Luz de Bolha";
    }
}

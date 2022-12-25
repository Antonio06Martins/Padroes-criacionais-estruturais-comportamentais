package padroesestruturais.decorator;

import padroesestruturais.decorator.decorate.impl.ArvoreNatalImpl;
import padroesestruturais.decorator.model.NeveArtificial;

public class ClientDecorator {

    public static void main(String[] args) {

        NeveArtificial arvoreNatal = new NeveArtificial(new ArvoreNatalImpl());
        System.out.println(arvoreNatal.decorete());
    }
}

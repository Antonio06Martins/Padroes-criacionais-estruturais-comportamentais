package padroesestruturais.decorator.decorate.impl;

import padroesestruturais.decorator.decorate.ArvoreNatal;

public class ArvoreNatalImpl implements ArvoreNatal {

    @Override
    public String decorando() {
        return "Arvore Natal ";
    }
}

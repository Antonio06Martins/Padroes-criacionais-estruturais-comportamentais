package padroesestruturais.decorator.decorate;

public abstract class ArvoreDecorator implements ArvoreNatal{

    private ArvoreNatal arvoreNatal;


    public ArvoreDecorator(ArvoreNatal arvoreNatal) {
        this.arvoreNatal = arvoreNatal;
    }

    @Override
    public String decorando() {
        return arvoreNatal.decorando();
    }
}

package padroescriacionais.builder.model.builder;

import padroescriacionais.builder.model.CompraMercado;

public class MercadoBuilder {

    private String refrigerante;
    private String arroz;
    private String feijao;
    private String carne;
    private String azeite;
    private String leite;
    private String sabao;
    private String cotonete;
    private String pacu;

    public MercadoBuilder(String feijao) {
        this.feijao = feijao;
    }

    public MercadoBuilder pegaArroz(String arroz) {
        this.arroz = arroz;
        return this;
    }

    public MercadoBuilder pegaRefrigerante(String refrigerante) {
        this.refrigerante = refrigerante;
        return this;
    }

    public MercadoBuilder pegaCarne(String carne) {
        this.carne = carne;
        return this;
    }

    public MercadoBuilder pegaAzeite(String azeite) {
        this.azeite = azeite;
        return this;
    }

    public MercadoBuilder pegaLeite(String leite) {
        this.leite = leite;
        return this;
    }

    public MercadoBuilder pegaSabao(String sabao) {
        this.sabao = sabao;
        return this;
    }

    public MercadoBuilder pegaCotonete(String cotonete) {
        this.cotonete = cotonete;
        return this;
    }

    public MercadoBuilder pegaPacu(String pacu) {
        this.pacu = pacu;
        return this;
    }

    public CompraMercado fechaPedido() {
        return new CompraMercado(refrigerante, arroz, feijao, carne, azeite, leite, sabao, cotonete, pacu);
    }
}

package padroescriacionais.builder.model;

public class CompraMercado {

    private String refrigerante;
    private String arroz;
    private String feijao;
    private String carne;
    private String azeite;
    private String leite;
    private String sabao;
    private String cotonete;
    private String pacu;

    public CompraMercado(String refrigerante, String arroz, String feijao, String carne, String azeite,
                         String leite, String sabao, String cotonete, String pacu) {
        this.refrigerante = refrigerante;
        this.arroz = arroz;
        this.feijao = feijao;
        this.carne = carne;
        this.azeite = azeite;
        this.leite = leite;
        this.sabao = sabao;
        this.cotonete = cotonete;
        this.pacu = pacu;
    }

    public void setRefrigerante(String refrigerante) {
        this.refrigerante = refrigerante;
    }

    public void setArroz(String arroz) {
        this.arroz = arroz;
    }

    public void setFeijao(String feijao) {
        this.feijao = feijao;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setAzeite(String azeite) {
        this.azeite = azeite;
    }

    public void setLeite(String leite) {
        this.leite = leite;
    }

    public void setSabao(String sabao) {
        this.sabao = sabao;
    }

    public void setCotonete(String cotonete) {
        this.cotonete = cotonete;
    }

    public void setPacu(String pacu) {
        this.pacu = pacu;
    }

    @Override
    public String toString() {
        return "CompraMercado{" +
                "refrigerante='" + refrigerante + '\'' +
                ", arroz='" + arroz + '\'' +
                ", feijao='" + feijao + '\'' +
                ", carne='" + carne + '\'' +
                ", azeite='" + azeite + '\'' +
                ", leite='" + leite + '\'' +
                ", sabao='" + sabao + '\'' +
                ", cotonete='" + cotonete + '\'' +
                ", pacu='" + pacu + '\'' +
                '}';
    }
}

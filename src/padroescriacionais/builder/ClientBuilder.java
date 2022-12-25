package padroescriacionais.builder;

import padroescriacionais.builder.model.CompraMercado;
import padroescriacionais.builder.model.builder.MercadoBuilder;

public class ClientBuilder {

    public static void main(String[] args) {

        CompraMercado compraMercado = new MercadoBuilder("Feijão Vermelho")
                .pegaArroz("Arroz Branco")
                .pegaCarne("Paleta Sete")
                .pegaAzeite("Dom Luiz")
                .pegaRefrigerante("Tubaina")
                .fechaPedido();

        System.out.println(compraMercado);
    }
}

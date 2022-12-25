package padroesestruturais.composite.model;

import padroesestruturais.composite.departamento.Departamento;

public class DepartamentoFinanceiro implements Departamento {

    private Integer id;
    private String nome;

    @Override
    public void retornaDepartamento() {
        System.out.println("Departamento Financeiro");
    }

    public DepartamentoFinanceiro(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

package padroesestruturais.composite.model;

import padroesestruturais.composite.departamento.Departamento;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoCentral implements Departamento {

    private Integer id;
    private String nome;

    private List<Departamento> novosDepartamentos;

    public DepartamentoCentral(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
        this.novosDepartamentos = new ArrayList<>();
    }

    public void retornaDepartamento() {
        novosDepartamentos.forEach(Departamento::retornaDepartamento);
    }

    public void addDepartment(Departamento departamento) {
        novosDepartamentos.add(departamento);
    }

    public void removeDepartment(Departamento departamento) {
        novosDepartamentos.remove(departamento);
    }
}

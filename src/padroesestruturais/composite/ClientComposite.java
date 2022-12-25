package padroesestruturais.composite;

import padroesestruturais.composite.departamento.Departamento;
import padroesestruturais.composite.model.DepartamentoCentral;
import padroesestruturais.composite.model.DepartamentoFinanceiro;
import padroesestruturais.composite.model.DepartamentoPromocao;

public class ClientComposite {

    public static void main(String[] args) {

        Departamento departamentoPromocao = new DepartamentoPromocao(1, "Alimentos");
        Departamento departamentoFinanceiro = new DepartamentoFinanceiro(2, "Sala B");
        DepartamentoCentral departamentoCentral = new DepartamentoCentral(3, "Loja M");

        departamentoCentral.addDepartment(departamentoFinanceiro);
        //departamentoCentral.removeDepartment(departamentoFinanceiro);
        departamentoCentral.addDepartment(departamentoPromocao);


        departamentoCentral.retornaDepartamento();


    }
}

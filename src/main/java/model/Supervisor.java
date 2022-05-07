package model;

public class Supervisor extends Funcionario {

    public Supervisor(float salario) {
        super(salario);
    }

    @Override
    public String descreverAbrangencia() {
        return "Olá supervisor! " + this.planoDeSaude.abrangencia();
    }

    @Override
    public float calculaDesconto() {
        return this.salario - this.planoDeSaude.desconto();
    }
}

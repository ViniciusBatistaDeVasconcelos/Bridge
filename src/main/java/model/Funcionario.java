package model;

public abstract class Funcionario {

    protected PlanoDeSaude planoDeSaude;
    protected float salario;

    public Funcionario(float salario) {
        this.salario = salario;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public abstract String descreverAbrangencia();

    public abstract float calculaDesconto();
}

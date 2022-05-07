package model;

public class Gerente extends Funcionario {

    public Gerente(float salario) {
        super(salario);
    }

    @Override
    public String descreverAbrangencia() {
        return "Olá gerente! " + this.planoDeSaude.abrangencia();
    }

    @Override
    public float calculaDesconto() {
        return this.salario - this.planoDeSaude.desconto();
    }
}

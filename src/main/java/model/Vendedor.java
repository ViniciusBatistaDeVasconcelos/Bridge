package model;

public class Vendedor extends Funcionario {

    public Vendedor(float salario) {
        super(salario);
    }

    @Override
    public String descreverAbrangencia() {
        return "Olá vendedor! " + this.planoDeSaude.abrangencia();
    }

    @Override
    public float calculaDesconto() {
        return this.salario - this.planoDeSaude.desconto();
    }
}

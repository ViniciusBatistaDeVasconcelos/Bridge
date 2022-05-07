package model;

public class Ambulatorial implements PlanoDeSaude {

    public String abrangencia() {
        return "Este plano cobre consultas, exames e tratamentos, desde que não exijam internação.";
    }

    public float desconto() {
        return 80.98f;
    }
}


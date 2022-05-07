package model;

public class Hospitalar implements PlanoDeSaude {

    public String abrangencia() {
        return "Este plano cobre a internação por prazo indeterminado, incluindo UTI e obstetrícia.";
    }

    public float desconto() {
        return 110.99f;
    }
}

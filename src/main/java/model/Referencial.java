package model;

public class Referencial implements PlanoDeSaude {

    public String abrangencia() {
        return "Este plano inclui assistência ambulatorial, hospitalar com obstetrícia, odontológica e até internação na enfermaria.";
    }

    public float desconto() {
        return 180.90f;
    }
}

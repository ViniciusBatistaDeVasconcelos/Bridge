package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    /* ------------------------- < Ambulatorial > ------------------------- */

    @Test
    void deveRetornarSalarioComDescontoAmbulatorial() {
        PlanoDeSaude planoDeSaude = new Ambulatorial();
        Gerente gerente = new Gerente(3200.0f);
        gerente.setPlanoDeSaude(planoDeSaude);
        assertEquals(3119.02, gerente.calculaDesconto(), 0.01f);
    }

    @Test
    void deveRetornarAbrangenciaDoPlanoAmbulatorial() {
        PlanoDeSaude planoDeSaude = new Ambulatorial();
        Gerente gerente = new Gerente(3200.0f);
        gerente.setPlanoDeSaude(planoDeSaude);
        assertEquals(
                "Olá gerente! Este plano cobre consultas, exames e tratamentos, desde que não exijam internação.",
                gerente.descreverAbrangencia()
        );
    }

    /* ------------------------- < Hospitalar > ------------------------- */

    @Test
    void deveRetornarSalarioComDescontoHospitalar() {
        PlanoDeSaude planoDeSaude = new Hospitalar();
        Gerente gerente = new Gerente(3200.0f);
        gerente.setPlanoDeSaude(planoDeSaude);
        assertEquals(3089.01, gerente.calculaDesconto(), 0.01f);
    }

    @Test
    void deveRetornarAbrangenciaDoPlanoHospitalar() {
        PlanoDeSaude planoDeSaude = new Hospitalar();
        Gerente gerente = new Gerente(3200.0f);
        gerente.setPlanoDeSaude(planoDeSaude);
        assertEquals(
                "Olá gerente! Este plano cobre a internação por prazo indeterminado, incluindo UTI e obstetrícia.",
                gerente.descreverAbrangencia()
        );
    }

    /* ------------------------- < Referencial > ------------------------- */

    @Test
    void deveRetornarSalarioComDescontoReferencial() {
        PlanoDeSaude planoDeSaude = new Referencial();
        Gerente gerente = new Gerente(3200.0f);
        gerente.setPlanoDeSaude(planoDeSaude);
        assertEquals(3019.10, gerente.calculaDesconto(), 0.01f);
    }

    @Test
    void deveRetornarAbrangenciaDoPlanoReferencial() {
        PlanoDeSaude planoDeSaude = new Referencial();
        Gerente gerente = new Gerente(3200.0f);
        gerente.setPlanoDeSaude(planoDeSaude);
        assertEquals(
                "Olá gerente! Este plano inclui assistência ambulatorial, hospitalar com obstetrícia, odontológica e até internação na enfermaria.",
                gerente.descreverAbrangencia()
        );
    }
}
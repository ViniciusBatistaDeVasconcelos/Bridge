package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupervisorTest {

    /* ------------------------- < Ambulatorial > ------------------------- */

    @Test
    void deveRetornarSalarioComDescontoAmbulatorial() {
        PlanoDeSaude planoDeSaude = new Ambulatorial();
        Supervisor supervisor = new Supervisor(2300.0f);
        supervisor.setPlanoDeSaude(planoDeSaude);
        assertEquals(2219.02, supervisor.calculaDesconto(), 0.01f);
    }

    @Test
    void deveRetornarAbrangenciaDoPlanoAmbulatorial() {
        PlanoDeSaude planoDeSaude = new Ambulatorial();
        Supervisor supervisor = new Supervisor(2300.0f);
        supervisor.setPlanoDeSaude(planoDeSaude);
        assertEquals(
                "Olá supervisor! Este plano cobre consultas, exames e tratamentos, desde que não exijam internação.",
                supervisor.descreverAbrangencia()
        );
    }

    /* ------------------------- < Hospitalar > ------------------------- */

    @Test
    void deveRetornarSalarioComDescontoHospitalar() {
        PlanoDeSaude planoDeSaude = new Hospitalar();
        Supervisor supervisor = new Supervisor(2300.0f);
        supervisor.setPlanoDeSaude(planoDeSaude);
        assertEquals(2189.01, supervisor.calculaDesconto(), 0.01f);
    }

    @Test
    void deveRetornarAbrangenciaDoPlanoHospitalar() {
        PlanoDeSaude planoDeSaude = new Hospitalar();
        Supervisor supervisor = new Supervisor(2300.0f);
        supervisor.setPlanoDeSaude(planoDeSaude);
        assertEquals(
                "Olá supervisor! Este plano cobre a internação por prazo indeterminado, incluindo UTI e obstetrícia.",
                supervisor.descreverAbrangencia()
        );
    }

    /* ------------------------- < Referencial > ------------------------- */

    @Test
    void deveRetornarSalarioComDescontoReferencial() {
        PlanoDeSaude planoDeSaude = new Referencial();
        Supervisor supervisor = new Supervisor(2300.0f);
        supervisor.setPlanoDeSaude(planoDeSaude);
        assertEquals(2119.10, supervisor.calculaDesconto(), 0.01f);
    }

    @Test
    void deveRetornarAbrangenciaDoPlanoReferencial() {
        PlanoDeSaude planoDeSaude = new Referencial();
        Supervisor supervisor = new Supervisor(2300.0f);
        supervisor.setPlanoDeSaude(planoDeSaude);
        assertEquals(
                "Olá supervisor! Este plano inclui assistência ambulatorial, hospitalar com obstetrícia, odontológica e até internação na enfermaria.",
                supervisor.descreverAbrangencia()
        );
    }
}
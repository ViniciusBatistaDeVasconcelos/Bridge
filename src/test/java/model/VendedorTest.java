package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorTest {

    /* ------------------------- < Ambulatorial > ------------------------- */

    @Test
    void deveRetornarSalarioComDescontoAmbulatorial() {
        PlanoDeSaude planoDeSaude = new Ambulatorial();
        Vendedor vendedor = new Vendedor(1500.0f);
        vendedor.setPlanoDeSaude(planoDeSaude);
        assertEquals(1419.02, vendedor.calculaDesconto(), 0.01f);
    }

    @Test
    void deveRetornarAbrangenciaDoPlanoAmbulatorial() {
        PlanoDeSaude planoDeSaude = new Ambulatorial();
        Vendedor vendedor = new Vendedor(1500.0f);
        vendedor.setPlanoDeSaude(planoDeSaude);
        assertEquals(
                "Olá vendedor! Este plano cobre consultas, exames e tratamentos, desde que não exijam internação.",
                vendedor.descreverAbrangencia()
        );
    }

    /* ------------------------- < Hospitalar > ------------------------- */

    @Test
    void deveRetornarSalarioComDescontoHospitalar() {
        PlanoDeSaude planoDeSaude = new Hospitalar();
        Vendedor vendedor = new Vendedor(1500.0f);
        vendedor.setPlanoDeSaude(planoDeSaude);
        assertEquals(1389.01, vendedor.calculaDesconto(), 0.01f);
    }

    @Test
    void deveRetornarAbrangenciaDoPlanoHospitalar() {
        PlanoDeSaude planoDeSaude = new Hospitalar();
        Vendedor vendedor = new Vendedor(1500.0f);
        vendedor.setPlanoDeSaude(planoDeSaude);
        assertEquals(
                "Olá vendedor! Este plano cobre a internação por prazo indeterminado, incluindo UTI e obstetrícia.",
                vendedor.descreverAbrangencia()
        );
    }

    /* ------------------------- < Referencial > ------------------------- */

    @Test
    void deveRetornarSalarioComDescontoReferencial() {
        PlanoDeSaude planoDeSaude = new Referencial();
        Vendedor vendedor = new Vendedor(1500.0f);
        vendedor.setPlanoDeSaude(planoDeSaude);
        assertEquals(1319.09, vendedor.calculaDesconto(), 0.01f);
    }

    @Test
    void deveRetornarAbrangenciaDoPlanoReferencial() {
        PlanoDeSaude planoDeSaude = new Referencial();
        Vendedor vendedor = new Vendedor(1500.0f);
        vendedor.setPlanoDeSaude(planoDeSaude);
        assertEquals(
                "Olá vendedor! Este plano inclui assistência ambulatorial, hospitalar com obstetrícia, odontológica e até internação na enfermaria.",
                vendedor.descreverAbrangencia()
        );
    }
}
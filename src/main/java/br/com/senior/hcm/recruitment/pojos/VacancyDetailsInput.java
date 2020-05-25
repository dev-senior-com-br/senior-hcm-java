package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

@Data
public class VacancyDetailsInput {

    /**
     * Identificador único da vaga.
     */
    String id;

    /**
     * Id do contrato ativo no analytics
     */
    String activeEmployeeId;

    /**
     * Indica que a primitiva foi chamada pelo recrutamento legado base HCM), default é true.
     */
    boolean fromRecruitment;
}

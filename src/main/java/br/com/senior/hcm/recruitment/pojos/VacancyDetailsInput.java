package br.com.senior.hcm.recruitment.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class VacancyDetailsInput {

    /**
     * Identificador único da vaga.
     */
    @NonNull
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

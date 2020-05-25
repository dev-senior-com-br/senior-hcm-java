package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

@Data
public class DimensionVacancyCandidate {
    /**
     * Percentual da vaga
     */
    double vacancy;
    /**
     * Percentual do candidato
     */
    double candidate;
}

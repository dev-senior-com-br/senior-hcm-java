package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

/**
 * Aderência dos candidatos para a vaga
 */
@Data
public class PersonalityAdherence {
    /**
     * Aderência do candidato
     */
    double adherence;
    /**
     * Comparação entre vaga e candidato para abertura
     */
    DimensionVacancyCandidate openness;
    /**
     * Comparação entre vaga e candidato para escrupulosidade
     */
    DimensionVacancyCandidate conscientiousness;
    /**
     * Comparação entre vaga e candidato para extroversão
     */
    DimensionVacancyCandidate extraversion;
    /**
     * Comparação entre vaga e candidato para amabilidade
     */
    DimensionVacancyCandidate agreeableness;
    /**
     * Comparação entre vaga e candidato para alcance emocional
     */
    DimensionVacancyCandidate neuroticism;
}
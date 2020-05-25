package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

import java.util.Date;

@Data
public class VacancyDetailsSummaryOutput {
    /**
     * Id da vaga
     */
    String vacancyId;

    /**
     * Título da vaga
     */
    String title;

    /**
     * Usuário corrente está inscrito na vaga
     */
    boolean alreadySubscribed;

    /**
     * Identificador do questionário
     */
    String questionnaireId;

    /**
     * Data final da publicação externa
     */
    Date endDate;

    /**
     * Situação da vaga
     */
    VacancySituationDto situation;
}

package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

import java.util.Date;

/**
 * Card com informações de uma vaga
 */
@Data
public class VacancyCard {
    /**
     * Identificador único da vaga
     */
    String id;

    /**
     * Título da vaga
     */
    String title;

    /**
     * Local da vaga
     */
    String location;

    /**
     * Indica se a vaga deve estar em destaque
     */
    boolean highlight;

    /**
     * Situação atual da vaga
     */
    VacancySituationDto situation;

    /**
     * Solicitante da vaga
     */
    EmployeeSummary requester;

    /**
     * Motivo de abertura da vaga
     */
    ProcessTypeDto reason;

    /**
     * Data inicial da publicação da vaga para candidatos externos
     */
    Date externalStartDate;

    /**
     * Data final da publicação da vaga para candidatos externos
     */
    Date externalEndDate;

    /**
     * Data inicial da publicação da vaga para candidatos internos
     */
    Date internalStartDate;

    /**
     * Data final da publicação da vaga para candidatos internos
     */
    Date internalEndDate;

    /**
     * Quantidade de candidatos inscritos na vaga
     */
    int quantityOfSubscribedCandidates;

    /**
     * Quantidade de candidatos selecionados para a vaga
     */
    int quantityOfSelectedCandidates;

    /**
     * Data e hora da criação da vaga
     */
    Date creationDate;

    /**
     * Data prevista de admissão
     */
    Date admissionDate;

    /**
     * Data e hora da conclusão da vaga
     */
    Date finalizedAt;

    /**
     * Nome do responsável pela vaga
     */
    String responsibleName;

    /**
     * Progresso da vaga
     */
    double progress;

    /**
     * Personalidade da vaga em relação ao candidato
     */
    PersonalityAdherence personalityAdherence;

    /**
     * Indica se a vaga é nova
     */
    boolean isNew;

    /**
     * Nome do cargo da vaga
     */
    JobPosition jobPosition;

    /**
     * Departamento da vaga
     */
    Department department;

    /**
     * Indica se o usuário atual pode editar a vaga
     */
    boolean canEditVacancy;

    /**
     * Código da requisição de pessoal/vaga
     */
    int sequenceStaffrequisitionVacancy;
}
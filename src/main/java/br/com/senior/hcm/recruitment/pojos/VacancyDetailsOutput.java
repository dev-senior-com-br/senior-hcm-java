package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class VacancyDetailsOutput {
    /**
     * Identificador único da vaga
     */
    String id;

    /**
     * Título da vaga
     */
    String title;

    /**
     * Cargo da vaga
     */
    String jobPosition;

    /**
     * Local da vaga
     */
    String location;

    /**
     * Situação atual da vaga
     */
    VacancySituationDto situation;

    /**
     * Pessoa que finalizou (fechou/cancelou) a vaga
     */
    Person finalizer;

    /**
     * Solicitante da vaga
     */
    EmployeeSummary requester;

    /**
     * Pessoa que é a responsável pela vaga
     */
    Person responsible;

    /**
     * Progresso da vaga
     */
    double percentage;

    /**
     * Quantidade de candidatos inscritos na vaga
     */
    int quantityOfSubscribedCandidates;

    /**
     * Quantidade de candidatos selecionados para a vaga
     */
    int quantityOfSelectedCandidates;

    /**
     * Identificador do questionário
     */
    String questionnaireId;

    /**
     * ID do chat referente a essa vaga
     */
    String chatId;

    /**
     * Representa se existe uma pendência referente a vaga com o solicitante da mesma
     */
    boolean pendingWithRequester;

    /**
     * Faixa salarial inicial
     */
    BigDecimal startSalaryRange;

    /**
     * Faixa salarial final
     */
    BigDecimal endSalaryRange;

    /**
     * Salário do candidato
     */
    BigDecimal salary;

    /**
     * Código da requisição de pessoal/vaga
     */
    int sequenceStaffrequisitionVacancy;
}

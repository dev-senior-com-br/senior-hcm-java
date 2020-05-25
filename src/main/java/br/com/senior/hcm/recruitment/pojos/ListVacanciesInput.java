package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ListVacanciesInput {
    /**
     * Motivo da abertura da vaga
     */
    ProcessTypeDto reason;

    /**
     * Lista de palavras-chave a serem filtradas
     */
    String q;

    /**
     * Situação a ser filtrada
     */
    List<VacancySituationDto> situation;

    /**
     * Locais da vaga a serem considerados
     */
    List<String> locations;

    /**
     * Responsaveis de vaga a serem considerados
     */
    List<String> responsibles;

    /**
     * Data mínima para a criação da vaga
     */
    Date minCreateDate;

    /**
     * Data máxima para a criação da vaga
     */
    Date maxCreateDate;

    /**
     * Data mínima para a conclusão da vaga
     */
    Date minConclusionDate;

    /**
     * Data máxima para a conclusão da vaga
     */
    Date maxConclusionDate;

    /**
     * Solicitantes das vagas a serem considerados
     */
    List<String> requesters;

    /**
     * Cargos das vagas a serem considerados
     */
    List<String> positions;

    /**
     * Progresso mínimo das vagas
     */
    int minProgress;

    /**
     * Progresso máximo das vagas
     */
    int maxProgress;

    /**
     * Data de referência
     */
    Date referenceDate;

    /**
     * Índice da página a ser retornada. Padrão 0
     */
    int page;

    /**
     * Quantidade de modelos que devem ser retornados por página. Padrão 20
     */
    int size;

    /**
     * Flag indicando que será filtrado por solicitante, considerando hierarquia (liderados diretos e indiretos). Nesse caso, mesmo se o usuário for gestor (possuir permissão para visualizar todas as vagas), será considerada a hierarquia
     */
    boolean considerHierarchy;

    /**
     * Ticket dos filtros do Analytics (ID dos filtros aplicados no Analytics)
     */
    String ticket;

    /**
     * Id do contrato ativo no analytics
     */
    String activeEmployeeId;

    /**
     * Flag que identifica que se a chamada vem do Analytics
     */
    boolean fromAnalytics;
}

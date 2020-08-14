package br.com.senior.hcm.dependent.pojos;

import lombok.Data;

import java.util.Date;

/**
 * Controles do dependente no imposto de renda
 */
@Data
public class DependentIncomeTaxData {
    /**
     * Id da entidade
     */
    String id;
    /**
     * Idade limite imposto de renda
     */
    int ageLimitIncomeTax;
    /**
     * Inicio da competência
     */
    Date beginCompetence;
    /**
     * Fim da competência
     */
    Date endCompetence;
}

package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

@Data
public class Company {
    /**
     * Identificador único da empresa
     */
    String id;
    /**
     * Código da empresa
     */
    int code;
    /**
     * Nome da Empresa
     */
    String companyName;
    /**
     * Identificador da Empresa Matriz
     */
    String headQuarterId;
    /**
     * Código da empresa matriz
     */
    int headQuarterCode;
    /**
     * Nome da Empresa Matriz
     */
    String headQuarterName;
    /**
     * Centro de custo
     */
    CostCenter costCenter;
}

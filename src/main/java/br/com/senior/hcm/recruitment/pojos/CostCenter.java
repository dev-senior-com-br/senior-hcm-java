package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

/**
 * Centro de custo
 */
@Data
public class CostCenter {
    /**
     * Identificador do centro de custo
     */
    String id;
    /**
     * Identificador da Empresa
     */
    String companyId;
    /**
     * Empresa
     */
    Company company;
    /**
     * Nome do centro de custo
     */
    String name;
    /**
     * Código do centro de custo
     */
    String code;
}

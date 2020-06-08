package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

import java.util.List;

/**
 * Entidade que representa o posto de trabalho
 */
@Data
public class WorkstationGroup {
    /**
     * Identificador único que representa o posto de trabalho
     */
    String id;
    /**
     * Nome do grupo de postos de trabalho
     */
    String name;
    /**
     * Identificador da matriz do posto de trabalho
     */
    String headOfficeId;
    /**
     * Identificador da filial do posto de trabalho
     */
    String branchOfficeId;
    /**
     * Centro de custo que compõe o grupo de posto de trabalho
     */
    String costCenterId;
    /**
     * Identificador do departamento a qual o grupo de postos de trabalho está associado
     */
    String departamentId;
    /**
     * Objeto que representa o departamento
     */
    Department department;
    /**
     * Objeto que representa a filial
     */
    Company branchOffice;
    /**
     * Objeto que representa o centro de custo
     */
    CostCenter costCenter;
    /**
     * Lista de postos de trabalho
     */
    List<JobPosition> jobPositions;
    /**
     * Código do posto
     */
    String code;
}

package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

/**
 * Informações compostas do colaborador
 */
@Data
public class EmployeeSummary {
    /**
     * Informações básicas do colaborador
     */
    Employee employee;
    /**
     * Nome do grupo de posto de trabalho do colaborador
     */
    String workstationGroupName;
    /**
     * Nome do cargo do colaborador
     */
    String jobPositionName;
    /**
     * Nome da empresa em que o colaborador trabalha
     */
    String companyName;
    /**
     * Representa se o colaborador já está sendo referenciado em outra RP como o colaborador a ser substituído
     */
    boolean existsReferenceOfThisReplacedEmployeeOnStaffRequisition;
    /**
     * Representa se o colaborador já está sendo referenciado em outra vaga como o colaborador a ser substituído
     */
    boolean existsReferenceOfThisReplacedEmployeeOnVacancy;
    /**
     * Identifica se o colaborador foi demitido ou não
     */
    boolean dismissed;
    /**
     * Verifica se o colaborador possui uma posição na hierarquia atual
     */
    boolean hasPositionInTheHierarchy;
    /**
     * Última movimentação do colaborador, obtém a filial e a matriz
     */
    Company newCompany;
    /**
     * Última movimentação do colaborador, obtém o departamento
     */
    Department newDepartment;
    /**
     * Última movimentação do colaborador, obtém o centro de custo
     */
    CostCenter newCostCenter;
    /**
     * Última movimentação do colaborador, obtém o posto de trabalho
     */
    WorkstationGroup newWorkstation;
    /**
     * Última movimentação do colaborador, obtém o cargo
     */
    JobPosition newJobPosition;
    /**
     * Última movimentação do colaborador, obtém a escala de trabalho
     */
    WorkShift newWorkshift;
    /**
     * Local onde o colaborador substituído trabalha
     */
    String location;

}

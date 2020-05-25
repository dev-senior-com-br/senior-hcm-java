package br.com.senior.hcm.payroll.pojos;

import lombok.Data;

@Data
public class EmployeeListQueryInput {
    /**
     * Id da empresa
     */
    AutoCompleteData companyId;

    /**
     * Id da filial
     */
    AutoCompleteData branchId;

    /**
     * Id do local
     */
    AutoCompleteData departmentId;

    /**
     * Id do centro de custo
     */
    AutoCompleteData costCenterId;

    /**
     * Tipo do colaborador
     */
    AutoCompleteEnumData employeeType;

    /**
     * Tipo da situação do colaborador
     */
    AutoCompleteEnumData employeeSituationType;

    /**
     * Paginação
     */
    Pagination page;

    /**
     * Id do colaborador
     */
    AutoCompleteData employeeId;

    /**
     * Número da matrícula do colaborador no eSocial
     */
    String employeeEsocialRegisterNumber;
}
package br.com.senior.hcm.payroll.pojos;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class EmployeeListQueryData {

    /**
     * Id do Colaborador
     */
    String employeeId;

    /**
     * Número de matrícula (NumCad)
     */
    int registerNumber;

    /**
     * Nome da Pessoa
     */
    String personName;

    /**
     * Data de admissão
     */
    Date hireDate;

    /**
     * Status
     */
    String timeTrackingSituationName;

    /**
     * Código da Empresa
     */
    int companyNumber;

    /**
     * Nome da Empresa
     */
    String companyName;

    /**
     * Nome da Filial
     */
    String branchName;

    /**
     * Nome do local de trabalho
     */
    String departmentName;

    /**
     * Mostrar opção relatórios
     */
    boolean showReports;

    /**
     * Tipos de inconcistências do colaborador
     */
    List<EmployeeInconsistencyType> employeeInconsistencyType;


}

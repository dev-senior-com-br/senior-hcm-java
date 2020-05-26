package br.com.senior.hcm.payroll.pojos;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeQueryInput {

    /**
     * Id do colaborador
     */
    String employeeId;

    /**
     * Data de referência
     */
    String referenceDate;
}

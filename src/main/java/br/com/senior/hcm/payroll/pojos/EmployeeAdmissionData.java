package br.com.senior.hcm.payroll.pojos;

import lombok.Data;

@Data
public class EmployeeAdmissionData {

    /**
     * Dados iniciais do cadastro
     */
    InitialData sheetInitial;

    /**
     * Dados das guias pessoais
     */
    PersonaData sheetPersona;
}

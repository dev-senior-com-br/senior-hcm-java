package br.com.senior.hcm.dependent.pojos;

import lombok.Data;

/**
 * Colaborador
 */
@Data
public class Employee {

    /**
     * Id do colaborador
     */
    String id;

    /**
     * Empresa do colaborador
     */
    int companynumber;

    /**
     * Tipo do colaborador
     */
    EmployeeType employeeType;

    /**
     * Código do colaborador
     */
    int registernumber;

    /**
     * Relacionamento com a pessoa
     */
    Person person;

}

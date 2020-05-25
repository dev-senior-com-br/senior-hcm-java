package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

import java.util.Date;

/**
 * Colaborador
 */
@Data
public class Employee {
    /**
     * Identificador único da entidade
     */
    String id;
    /**
     * Pessoa a qual o contrato de colaborador referência
     */
    Person person;
    /**
     * Data de demissão do colaborador (Se for o caso)
     */
    Date dimissalDate;
    /**
     * Escala
     */
    WorkShift workShift;
    /**
     * Estação de trabalho
     */
    String workstationId;
    /**
     * Código do colaborador
     */
    int code;
}

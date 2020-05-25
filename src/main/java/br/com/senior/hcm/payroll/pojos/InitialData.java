package br.com.senior.hcm.payroll.pojos;

import lombok.Data;

@Data
public class InitialData {
    /**
     * Empresa do cadastro
     */
    AutoCompleteData company;

    /**
     * Nacionalidade do contrato
     */
    AutoCompleteEnumData contractNationality;

    /**
     * Tipo de contrato
     */
    AutoCompleteEnumData contractType;

    /**
     * Pessoa
     */
    AutoCompleteData person;

    /**
     * Colaborador
     */
    AutoCompleteData employee;

    /**
     * Id do rascunho da admissão
     */
    String admissionDraftId;
}

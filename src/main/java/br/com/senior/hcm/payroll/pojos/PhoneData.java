package br.com.senior.hcm.payroll.pojos;

import lombok.Data;

@Data
public class PhoneData {
    /**
     * Id do telefone
     */
    String id;

    /**
     * Código internacional
     */
    String countryCode;

    /**
     * Código regional
     */
    String localCode;

    /**
     * Número do telefone
     */
    String number;

    /**
     * Ramal do telefone
     */
    String extention;

    /**
     * Tipo do telefone
     */
    AutoCompleteEnumData phoneType;

}

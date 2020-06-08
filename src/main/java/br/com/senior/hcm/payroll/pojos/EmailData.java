package br.com.senior.hcm.payroll.pojos;

import lombok.Data;

@Data
public class EmailData {
    /**
     * Id do email
     */
    String id;

    /**
     * Email da pessoa
     */
    String email;

    /**
     * Tipo do email
     */
    AutoCompleteEnumData emailType;
}

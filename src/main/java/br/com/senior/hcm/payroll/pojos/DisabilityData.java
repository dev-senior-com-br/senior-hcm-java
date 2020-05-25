package br.com.senior.hcm.payroll.pojos;

import lombok.Data;

import java.util.Date;

@Data
public class DisabilityData {

    /**
     * Id da deficiência
     */
    String id;

    /**
     * Deficiência da pessoa
     */
    AutoCompleteData disability;

    /**
     * Data de inicio da deficiência
     */
    Date startDate;

    /**
     * É reabilitado nesta deficiência?
     */
    boolean isRehabilitated;

    /**
     * É a deficiência principal
     */
    boolean isMainDisability;
}

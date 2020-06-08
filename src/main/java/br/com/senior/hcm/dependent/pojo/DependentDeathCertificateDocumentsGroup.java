package br.com.senior.hcm.dependent.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Certidão de óbito
 */
@Data
public class DependentDeathCertificateDocumentsGroup {
    /**
     * Data do óbito
     */
    Date deathDate;
    /**
     * Número da certidão de óbito
     */
    String deathCertificateRegistry;
    /**
     * Termo da certidão de óbito
     */
    String deathCertificateTerm;
}

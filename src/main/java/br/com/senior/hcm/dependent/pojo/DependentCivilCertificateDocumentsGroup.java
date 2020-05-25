package br.com.senior.hcm.dependent.pojo;

import br.com.senior.hcm.payroll.pojos.AutoCompleteEnumData;
import lombok.Data;

/**
 * Dados referentes ao documento de certificado civil
 */
@Data
public class DependentCivilCertificateDocumentsGroup {
    /**
     * Certidão civil
     */
    AutoCompleteEnumData civilCertificate;
    /**
     * Matrícula do certidão civil
     */
    String civilCertificateRegistry;
    /**
     * Termo da certidão civil
     */
    String civilCertificateTerm;
    /**
     * Declaração de nascido vivo
     */
    String declarationOfLiveBirth;
    /**
     * Cartório da certidão civil
     */
    String civilCertificateNotaryOffice;
    /**
     * Folha da certidão civil
     */
    String civilCertificatePage;
    /**
     * Livro do certidão civil
     */
    String civilCertificateBook;
}

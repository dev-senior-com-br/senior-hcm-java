package br.com.senior.hcm.dependent.pojo;

import lombok.Data;

/**
 * Cartão com os dados da guia documentos do dependente
 */
@Data
public class DependentDocumentData {
    /**
     * Campos do cpf
     */
    DependentCpfDocumentsGroup dependentCpfDocumentsGroup;

    /**
     * Registro identidade civil
     */
    DependentIdentityRegistryDocumentsGroup dependentIdentityRegistryDocumentsGroup;

    /**
     * Cartão nacional de saúde
     */
    DependentNationalHealthDocumentsGroup dependentNationalHealthDocumentsGroup;
    /**
     * Documento rg
     */
    DependentRgNumberDocumentsGroup dependentRgNumberDocumentsGroup;
    /**
     * Dados referentes ao documento de certificado civil
     */
    DependentCivilCertificateDocumentsGroup dependentCivilCertificateDocumentsGroup;

    /**
     * Dados do certidão de óbito
     */
    DependentDeathCertificateDocumentsGroup dependentDeathCertificateDocumentsGroup;
}

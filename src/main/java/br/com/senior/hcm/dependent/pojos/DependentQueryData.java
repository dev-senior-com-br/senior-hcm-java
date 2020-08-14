package br.com.senior.hcm.dependent.pojos;

import lombok.Data;

/**
 * Dados de retorno da query de dependente
 */
@Data
public class DependentQueryData {
    /**
     * Dados pessoais
     */
    DependentPersonaData dependentPersonaData;

    /**
     * Documentos
     */
    DependentDocumentData dependentDocumentData;

    /**
     * Controles do dependente
     */
    DependentControlsData dependentControlsData;
}

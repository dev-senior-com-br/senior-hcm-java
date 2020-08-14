package br.com.senior.hcm.dependent.pojos;

import lombok.Data;

/**
 * Aba controles
 */
@Data
public class DependentControlsData {
    /**
     * Tutela
     */
    TutelageData tutelageGroup;
    /**
     * Auxílio creche
     */
    ChildcareAssistanceData childcareAssistanceGroup;
    /**
     * Salário familia
     */
    FamilySalaryData familySalaryGroup;
    /**
     * Documentos do salário familia
     */
    FamilySalaryDocumentData familySalaryDocumentGroup;
    /**
     * Controles do dependente no imposto de renda
     */
    DependentIncomeTaxData dependentIncomeTaxGroup;
    /**
     * Controles do dependente para plano de saúde
     */
    DependentHealthInsuranceData dependentHealthInsuranceGroup;
}

package br.com.senior.hcm.dependent.pojo;

import br.com.senior.hcm.payroll.pojos.AutoCompleteData;
import lombok.Data;

import java.util.Date;

/**
 * Documento rg
 */
@Data
public class DependentRgNumberDocumentsGroup {
    /**
     * Data de emissão
     */
    Date rgNumberEmissionDate;
    /**
     * Estado emissor
     */
    AutoCompleteData rgNumberState;
    /**
     * Orgão emissor
     */
    String rgNumberIssuer;
    /**
     * Número do rg
     */
    String rgNumber;
}

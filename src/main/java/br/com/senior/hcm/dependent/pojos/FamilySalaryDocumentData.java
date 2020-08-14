package br.com.senior.hcm.dependent.pojos;

import br.com.senior.hcm.payroll.pojos.AutoCompleteData;
import br.com.senior.hcm.payroll.pojos.AutoCompleteEnumData;
import lombok.Data;

import java.util.Date;

/**
 * Documentos do salário familia
 */
@Data
public class FamilySalaryDocumentData {
    /** Id da entidade */
    String id;
    /** Ano de referência */
    int referenceYear;
    /** Escola */
    AutoCompleteData school;
    /** É bolsista? */
    boolean scholarship;
    /** Série escolar */
    AutoCompleteEnumData schoolGrade;
    /** Frequência em maio */
    Date frequencyInMay;
    /** Percentual em maio */
    double percentageInMay;
    /** Frequência em novembro */
    Date frequencyInNovember;
    /** Percentual em novembro */
    double percentageInNovember;
    /** Vacinação */
    Date vaccination;
    /** Tipo da ação na base */
    ActionType actionType;
}

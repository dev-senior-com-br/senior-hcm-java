package br.com.senior.hcm.dependent.pojos;

import br.com.senior.hcm.payroll.pojos.AutoCompleteData;
import br.com.senior.hcm.payroll.pojos.AutoCompleteEnumData;
import br.com.senior.hcm.payroll.pojos.CustomData;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Cartão com os dependentes
 */
@Data
public class DependentData {
    /**
     * Id do dependente
     */
    String id;
    /**
     * Nome do dependente
     */
    String dependentName;
    /**
     * Grau de parentesco
     */
    AutoCompleteEnumData kinshipDegree;
    /**
     * Gênero da pessoa
     */
    AutoCompleteEnumData genderType;
    /**
     * Data de nascimento
     */
    Date birthdayDate;
    /**
     * Nome da mãe
     */
    String mothersName;
    /**
     * Estado civil
     */
    AutoCompleteEnumData maritalStatusType;
    /**
     * Grau de instrução
     */
    AutoCompleteData educationDegree;
    /**
     * País de nascimento
     */
    AutoCompleteData countryOfBirth;
    /**
     * Estado de nascimento
     */
    AutoCompleteData stateOfBirth;
    /**
     * Cidade de nascimento
     */
    AutoCompleteData cityOfBirth;
    /**
     * Número do CPF
     */
    String cpfNumber;
    /**
     * Nome do cartório
     */
    String nataryOffice;
    /**
     * Número do livro
     */
    String bookNumber;
    /**
     * Número da folha
     */
    String sheetNumber;
    /**
     * Número do registro
     */
    String registerNumber;
    /**
     * Campos customizados da entidade Dependent
     */
    List<CustomData> customFieldsDependent;
}

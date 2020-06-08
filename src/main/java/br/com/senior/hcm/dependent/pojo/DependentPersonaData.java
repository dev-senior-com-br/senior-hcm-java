package br.com.senior.hcm.dependent.pojo;

import br.com.senior.hcm.payroll.pojos.AutoCompleteData;
import br.com.senior.hcm.payroll.pojos.AutoCompleteEnumData;
import br.com.senior.hcm.payroll.pojos.CustomData;
import br.com.senior.hcm.payroll.pojos.FileUploadedData;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Cartão com os dados da guia pessoais
 */
@Data
public class DependentPersonaData {
    /**
     * Foto do colaborador
     */
    FileUploadedData fileUploadedData;
    /**
     * Id do colaborador
     */
    Employee employeeId;
    /**
     * Id do dependente
     */
    String dependentId;
    /**
     * Nome
     */
    String name;
    /**
     * Gênero da pessoa
     */
    AutoCompleteEnumData gender;
    /**
     * Grau de parentesco
     */
    AutoCompleteEnumData degreeOfKinship;
    /**
     * Tipo de Dependente eSocial
     */
    AutoCompleteEnumData eSocialDependentType;
    /**
     * Nome da mae
     */
    String motherName;
    /**
     * Data de nascimento da pessoa
     */
    Date birthday;
    /**
     * Estado civil da pessoa
     */
    AutoCompleteEnumData maritalStatus;
    /**
     * Grau de instrução da pessoa
     */
    AutoCompleteData degreeOfEducation;
    /**
     * Cidade de nascimento da pessoa
     */
    AutoCompleteData cityOfBirth;
    /**
     * Estado de nascimento
     */
    AutoCompleteData stateOfBirth;
    /**
     * País de nascimento
     */
    AutoCompleteData countryOfBirth;
    /**
     * Campos do usuário da entidade person
     */
    List<CustomData> customFieldsDependent;
    /**
     * Data da invalidez
     */
    Date disabilityDate;
}

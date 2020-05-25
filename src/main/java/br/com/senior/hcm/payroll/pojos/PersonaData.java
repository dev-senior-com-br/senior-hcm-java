package br.com.senior.hcm.payroll.pojos;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PersonaData {

    /**
     * Foto
     */
    FileUploadedData attachment;

    /**
     * Apelido
     */
    String nickname;

    /**
     * Gênero
     */
    AutoCompleteEnumData gender;

    /**
     * Nome social
     */
    String socialName;

    /**
     * Nome do pai
     */
    String fatherName;

    /**
     * Nome da mãe
     */
    String motherName;

    /**
     * Data de nascimento
     */
    Date birthday;

    /**
     * Estado civil
     */
    AutoCompleteEnumData maritalStatus;

    /**
     * Grau de instrução
     */
    AutoCompleteData degreeOfEducation;

    /**
     * Nacionalidade
     */
    AutoCompleteData nationality;

    /**
     * Raça
     */
    AutoCompleteEnumData race;

    /**
     * País de nascimento
     */
    AutoCompleteData countryOfBirthday;

    /**
     * Estado de nascimento
     */
    AutoCompleteData stateOfBirthday;

    /**
     * Cidade de nascimento
     */
    AutoCompleteData cityOfBirthday;

    /**
     * País
     */
    AutoCompleteData country;

    /**
     * Região Administrativa
     */
    AutoCompleteData administrativeRegion;

    /**
     * CEP do endereço
     */
    String cep;

    /**
     * Estado do endereço
     */
    AutoCompleteData state;

    /**
     * Cidade do endereço
     */
    AutoCompleteData city;

    /**
     * Bairro do endereço
     */
    AutoCompleteData neighborhood;

    /**
     * Tipo do logradouro
     */
    AutoCompleteEnumData addressType;

    /**
     * Nome da rua
     */
    String addressName;

    /**
     * Número do endereço
     */
    String addressNumber;

    /**
     * Complemento do endereço
     */
    String addressComplement;

    /**
     * Tem deficiência?
     */
    boolean isDisability;

    /**
     * Religião
     */
    AutoCompleteData religion;

    /**
     * É uma pessoa para preenchimento de cota?
     */
    boolean isOccupantQuota;

    /**
     * Deficiências
     */
    List<DisabilityData> disabilities;

    /**
     * Telefones
     */
    List<PhoneData> phones;

    /**
     * E-mails
     */
    List<EmailData> emails;

    /**
     * Campos do customizados da entidade person
     */
    List<CustomData> customFieldsPerson;
}

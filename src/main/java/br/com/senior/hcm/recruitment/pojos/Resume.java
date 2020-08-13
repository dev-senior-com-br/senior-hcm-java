/*
 * Recrutamento e Seleção
 * Serviço do Gestão de Recrutamento e Seleção.
 *
 * OpenAPI spec version: develop-SNAPSHOT
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.hcm.recruitment.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.hcm.recruitment.pojos.Ability;
import br.com.senior.hcm.recruitment.pojos.DisabilityDto;
import br.com.senior.hcm.recruitment.pojos.EducationSection;
import br.com.senior.hcm.recruitment.pojos.GenderDto;
import br.com.senior.hcm.recruitment.pojos.HonorificDto;
import br.com.senior.hcm.recruitment.pojos.Knowledge;
import br.com.senior.hcm.recruitment.pojos.LanguageSection;
import br.com.senior.hcm.recruitment.pojos.MaritalStatusDto;
import br.com.senior.hcm.recruitment.pojos.PersonalInterestSection;
import br.com.senior.hcm.recruitment.pojos.PersonalityModelCandidate;
import br.com.senior.hcm.recruitment.pojos.PositionSought;
import br.com.senior.hcm.recruitment.pojos.ProfessionalExperienceSection;
import br.com.senior.hcm.recruitment.pojos.ResumePhoneContact;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * Resume
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-13T15:43:18.879Z")



public class Resume {
  @SerializedName("birthday")
  private LocalDate birthday = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("gender")
  private GenderDto gender = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("additional")
  private String additional = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("educations")
  private List<EducationSection> educations = null;

  @SerializedName("instagram")
  private String instagram = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("salaryExpectation")
  private String salaryExpectation = null;

  @SerializedName("personalInterests")
  private List<PersonalInterestSection> personalInterests = null;

  @SerializedName("googlePlus")
  private String googlePlus = null;

  @SerializedName("abilities")
  private List<Ability> abilities = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("skype")
  private String skype = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("twitter")
  private String twitter = null;

  @SerializedName("personalityModelCandidate")
  private PersonalityModelCandidate personalityModelCandidate = null;

  @SerializedName("children")
  private Integer children = null;

  @SerializedName("cpf")
  private String cpf = null;

  @SerializedName("hasNotProfessionalExperience")
  private Boolean hasNotProfessionalExperience = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("attachmentId")
  private String attachmentId = null;

  @SerializedName("phoneContacts")
  private List<ResumePhoneContact> phoneContacts = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("honorific")
  private HonorificDto honorific = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("languages")
  private List<LanguageSection> languages = null;

  @SerializedName("professionalExperiences")
  private List<ProfessionalExperienceSection> professionalExperiences = null;

  @SerializedName("photoThumbnailLink")
  private String photoThumbnailLink = null;

  @SerializedName("facebook")
  private String facebook = null;

  @SerializedName("professionalSummary")
  private String professionalSummary = null;

  @SerializedName("photoId")
  private String photoId = null;

  @SerializedName("relocation")
  private Boolean relocation = null;

  @SerializedName("professionalGoal")
  private String professionalGoal = null;

  @SerializedName("linkedIn")
  private String linkedIn = null;

  @SerializedName("disabilities")
  private List<DisabilityDto> disabilities = null;

  @SerializedName("incompleteNotifications")
  private Integer incompleteNotifications = null;

  @SerializedName("positionsSought")
  private List<PositionSought> positionsSought = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("neighborhood")
  private String neighborhood = null;

  @SerializedName("photoLink")
  private String photoLink = null;

  @SerializedName("travel")
  private Boolean travel = null;

  @SerializedName("maritalStatus")
  private MaritalStatusDto maritalStatus = null;

  @SerializedName("knowledges")
  private List<Knowledge> knowledges = null;

  public Resume birthday(LocalDate birthday) {
    this.birthday = birthday;
    return this;
  }

   /**
   * Data de nascimento da pessoa.
   * @return birthday
  **/
  @ApiModelProperty(value = "Data de nascimento da pessoa.")
  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public Resume country(String country) {
    this.country = country;
    return this;
  }

   /**
   * País.
   * @return country
  **/
  @ApiModelProperty(value = "País.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Resume gender(GenderDto gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public GenderDto getGender() {
    return gender;
  }

  public void setGender(GenderDto gender) {
    this.gender = gender;
  }

  public Resume city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Cidade.
   * @return city
  **/
  @ApiModelProperty(value = "Cidade.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Resume additional(String additional) {
    this.additional = additional;
    return this;
  }

   /**
   * Informação adicional referente ao endereço (e.g. Número do apartamento, Bloco do residencial, Ponto de referência).
   * @return additional
  **/
  @ApiModelProperty(value = "Informação adicional referente ao endereço (e.g. Número do apartamento, Bloco do residencial, Ponto de referência).")
  public String getAdditional() {
    return additional;
  }

  public void setAdditional(String additional) {
    this.additional = additional;
  }

  public Resume postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Código postal.
   * @return postalCode
  **/
  @ApiModelProperty(value = "Código postal.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Resume educations(List<EducationSection> educations) {
    this.educations = educations;
    return this;
  }

  public Resume addEducationsItem(EducationSection educationsItem) {
    if (this.educations == null) {
      this.educations = new ArrayList<EducationSection>();
    }
    this.educations.add(educationsItem);
    return this;
  }

   /**
   * Formação acadêmica.
   * @return educations
  **/
  @ApiModelProperty(value = "Formação acadêmica.")
  public List<EducationSection> getEducations() {
    return educations;
  }

  public void setEducations(List<EducationSection> educations) {
    this.educations = educations;
  }

  public Resume instagram(String instagram) {
    this.instagram = instagram;
    return this;
  }

   /**
   * Perfil do Instagram.
   * @return instagram
  **/
  @ApiModelProperty(value = "Perfil do Instagram.")
  public String getInstagram() {
    return instagram;
  }

  public void setInstagram(String instagram) {
    this.instagram = instagram;
  }

  public Resume locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Preferencia de idoma do candidato.
   * @return locale
  **/
  @ApiModelProperty(value = "Preferencia de idoma do candidato.")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Resume salaryExpectation(String salaryExpectation) {
    this.salaryExpectation = salaryExpectation;
    return this;
  }

   /**
   * Pretensão salarial.
   * @return salaryExpectation
  **/
  @ApiModelProperty(value = "Pretensão salarial.")
  public String getSalaryExpectation() {
    return salaryExpectation;
  }

  public void setSalaryExpectation(String salaryExpectation) {
    this.salaryExpectation = salaryExpectation;
  }

  public Resume personalInterests(List<PersonalInterestSection> personalInterests) {
    this.personalInterests = personalInterests;
    return this;
  }

  public Resume addPersonalInterestsItem(PersonalInterestSection personalInterestsItem) {
    if (this.personalInterests == null) {
      this.personalInterests = new ArrayList<PersonalInterestSection>();
    }
    this.personalInterests.add(personalInterestsItem);
    return this;
  }

   /**
   * Interesses pessoais.
   * @return personalInterests
  **/
  @ApiModelProperty(value = "Interesses pessoais.")
  public List<PersonalInterestSection> getPersonalInterests() {
    return personalInterests;
  }

  public void setPersonalInterests(List<PersonalInterestSection> personalInterests) {
    this.personalInterests = personalInterests;
  }

  public Resume googlePlus(String googlePlus) {
    this.googlePlus = googlePlus;
    return this;
  }

   /**
   * Perfil do Google+.
   * @return googlePlus
  **/
  @ApiModelProperty(value = "Perfil do Google+.")
  public String getGooglePlus() {
    return googlePlus;
  }

  public void setGooglePlus(String googlePlus) {
    this.googlePlus = googlePlus;
  }

  public Resume abilities(List<Ability> abilities) {
    this.abilities = abilities;
    return this;
  }

  public Resume addAbilitiesItem(Ability abilitiesItem) {
    if (this.abilities == null) {
      this.abilities = new ArrayList<Ability>();
    }
    this.abilities.add(abilitiesItem);
    return this;
  }

   /**
   * Habilidades.
   * @return abilities
  **/
  @ApiModelProperty(value = "Habilidades.")
  public List<Ability> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<Ability> abilities) {
    this.abilities = abilities;
  }

  public Resume number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Número da residência/comércio.
   * @return number
  **/
  @ApiModelProperty(value = "Número da residência/comércio.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Resume skype(String skype) {
    this.skype = skype;
    return this;
  }

   /**
   * Usuário do Skype.
   * @return skype
  **/
  @ApiModelProperty(value = "Usuário do Skype.")
  public String getSkype() {
    return skype;
  }

  public void setSkype(String skype) {
    this.skype = skype;
  }

  public Resume createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Data de criação.
   * @return createdAt
  **/
  @ApiModelProperty(value = "Data de criação.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Resume twitter(String twitter) {
    this.twitter = twitter;
    return this;
  }

   /**
   * Perfil do Twitter.
   * @return twitter
  **/
  @ApiModelProperty(value = "Perfil do Twitter.")
  public String getTwitter() {
    return twitter;
  }

  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }

  public Resume personalityModelCandidate(PersonalityModelCandidate personalityModelCandidate) {
    this.personalityModelCandidate = personalityModelCandidate;
    return this;
  }

   /**
   * Get personalityModelCandidate
   * @return personalityModelCandidate
  **/
  @ApiModelProperty(value = "")
  public PersonalityModelCandidate getPersonalityModelCandidate() {
    return personalityModelCandidate;
  }

  public void setPersonalityModelCandidate(PersonalityModelCandidate personalityModelCandidate) {
    this.personalityModelCandidate = personalityModelCandidate;
  }

  public Resume children(Integer children) {
    this.children = children;
    return this;
  }

   /**
   * Quantidade de filhos.
   * @return children
  **/
  @ApiModelProperty(value = "Quantidade de filhos.")
  public Integer getChildren() {
    return children;
  }

  public void setChildren(Integer children) {
    this.children = children;
  }

  public Resume cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

   /**
   * CPF (Cadastro de Pessoas Físicas) da pessoa.
   * @return cpf
  **/
  @ApiModelProperty(value = "CPF (Cadastro de Pessoas Físicas) da pessoa.")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Resume hasNotProfessionalExperience(Boolean hasNotProfessionalExperience) {
    this.hasNotProfessionalExperience = hasNotProfessionalExperience;
    return this;
  }

   /**
   * Indica se a pessoa não tem experiência profissional.
   * @return hasNotProfessionalExperience
  **/
  @ApiModelProperty(value = "Indica se a pessoa não tem experiência profissional.")
  public Boolean isHasNotProfessionalExperience() {
    return hasNotProfessionalExperience;
  }

  public void setHasNotProfessionalExperience(Boolean hasNotProfessionalExperience) {
    this.hasNotProfessionalExperience = hasNotProfessionalExperience;
  }

  public Resume id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador único da entidade.
   * @return id
  **/
  @ApiModelProperty(value = "Identificador único da entidade.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Resume state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Estado do país.
   * @return state
  **/
  @ApiModelProperty(value = "Estado do país.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Resume attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

   /**
   * Anexo do currículo.
   * @return attachmentId
  **/
  @ApiModelProperty(value = "Anexo do currículo.")
  public String getAttachmentId() {
    return attachmentId;
  }

  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }

  public Resume phoneContacts(List<ResumePhoneContact> phoneContacts) {
    this.phoneContacts = phoneContacts;
    return this;
  }

  public Resume addPhoneContactsItem(ResumePhoneContact phoneContactsItem) {
    if (this.phoneContacts == null) {
      this.phoneContacts = new ArrayList<ResumePhoneContact>();
    }
    this.phoneContacts.add(phoneContactsItem);
    return this;
  }

   /**
   * Contatos telefônicos.
   * @return phoneContacts
  **/
  @ApiModelProperty(value = "Contatos telefônicos.")
  public List<ResumePhoneContact> getPhoneContacts() {
    return phoneContacts;
  }

  public void setPhoneContacts(List<ResumePhoneContact> phoneContacts) {
    this.phoneContacts = phoneContacts;
  }

  public Resume email(String email) {
    this.email = email;
    return this;
  }

   /**
   * E-mail.
   * @return email
  **/
  @ApiModelProperty(value = "E-mail.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Resume honorific(HonorificDto honorific) {
    this.honorific = honorific;
    return this;
  }

   /**
   * Get honorific
   * @return honorific
  **/
  @ApiModelProperty(value = "")
  public HonorificDto getHonorific() {
    return honorific;
  }

  public void setHonorific(HonorificDto honorific) {
    this.honorific = honorific;
  }

  public Resume updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Data da última alteração.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "Data da última alteração.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Resume address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Logradouro/Rua.
   * @return address
  **/
  @ApiModelProperty(value = "Logradouro/Rua.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Resume languages(List<LanguageSection> languages) {
    this.languages = languages;
    return this;
  }

  public Resume addLanguagesItem(LanguageSection languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<LanguageSection>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Idiomas.
   * @return languages
  **/
  @ApiModelProperty(value = "Idiomas.")
  public List<LanguageSection> getLanguages() {
    return languages;
  }

  public void setLanguages(List<LanguageSection> languages) {
    this.languages = languages;
  }

  public Resume professionalExperiences(List<ProfessionalExperienceSection> professionalExperiences) {
    this.professionalExperiences = professionalExperiences;
    return this;
  }

  public Resume addProfessionalExperiencesItem(ProfessionalExperienceSection professionalExperiencesItem) {
    if (this.professionalExperiences == null) {
      this.professionalExperiences = new ArrayList<ProfessionalExperienceSection>();
    }
    this.professionalExperiences.add(professionalExperiencesItem);
    return this;
  }

   /**
   * Experiências profissionais.
   * @return professionalExperiences
  **/
  @ApiModelProperty(value = "Experiências profissionais.")
  public List<ProfessionalExperienceSection> getProfessionalExperiences() {
    return professionalExperiences;
  }

  public void setProfessionalExperiences(List<ProfessionalExperienceSection> professionalExperiences) {
    this.professionalExperiences = professionalExperiences;
  }

  public Resume photoThumbnailLink(String photoThumbnailLink) {
    this.photoThumbnailLink = photoThumbnailLink;
    return this;
  }

   /**
   * Link da foto miniatura
   * @return photoThumbnailLink
  **/
  @ApiModelProperty(value = "Link da foto miniatura")
  public String getPhotoThumbnailLink() {
    return photoThumbnailLink;
  }

  public void setPhotoThumbnailLink(String photoThumbnailLink) {
    this.photoThumbnailLink = photoThumbnailLink;
  }

  public Resume facebook(String facebook) {
    this.facebook = facebook;
    return this;
  }

   /**
   * Perfil do Facebook.
   * @return facebook
  **/
  @ApiModelProperty(value = "Perfil do Facebook.")
  public String getFacebook() {
    return facebook;
  }

  public void setFacebook(String facebook) {
    this.facebook = facebook;
  }

  public Resume professionalSummary(String professionalSummary) {
    this.professionalSummary = professionalSummary;
    return this;
  }

   /**
   * Resumo profissional.
   * @return professionalSummary
  **/
  @ApiModelProperty(value = "Resumo profissional.")
  public String getProfessionalSummary() {
    return professionalSummary;
  }

  public void setProfessionalSummary(String professionalSummary) {
    this.professionalSummary = professionalSummary;
  }

  public Resume photoId(String photoId) {
    this.photoId = photoId;
    return this;
  }

   /**
   * Foto.
   * @return photoId
  **/
  @ApiModelProperty(value = "Foto.")
  public String getPhotoId() {
    return photoId;
  }

  public void setPhotoId(String photoId) {
    this.photoId = photoId;
  }

  public Resume relocation(Boolean relocation) {
    this.relocation = relocation;
    return this;
  }

   /**
   * Disponível para deslocalização.
   * @return relocation
  **/
  @ApiModelProperty(value = "Disponível para deslocalização.")
  public Boolean isRelocation() {
    return relocation;
  }

  public void setRelocation(Boolean relocation) {
    this.relocation = relocation;
  }

  public Resume professionalGoal(String professionalGoal) {
    this.professionalGoal = professionalGoal;
    return this;
  }

   /**
   * Objetivo profissional.
   * @return professionalGoal
  **/
  @ApiModelProperty(value = "Objetivo profissional.")
  public String getProfessionalGoal() {
    return professionalGoal;
  }

  public void setProfessionalGoal(String professionalGoal) {
    this.professionalGoal = professionalGoal;
  }

  public Resume linkedIn(String linkedIn) {
    this.linkedIn = linkedIn;
    return this;
  }

   /**
   * Perfil do LinkedIn.
   * @return linkedIn
  **/
  @ApiModelProperty(value = "Perfil do LinkedIn.")
  public String getLinkedIn() {
    return linkedIn;
  }

  public void setLinkedIn(String linkedIn) {
    this.linkedIn = linkedIn;
  }

  public Resume disabilities(List<DisabilityDto> disabilities) {
    this.disabilities = disabilities;
    return this;
  }

  public Resume addDisabilitiesItem(DisabilityDto disabilitiesItem) {
    if (this.disabilities == null) {
      this.disabilities = new ArrayList<DisabilityDto>();
    }
    this.disabilities.add(disabilitiesItem);
    return this;
  }

   /**
   * Deficiências da pessoa.
   * @return disabilities
  **/
  @ApiModelProperty(value = "Deficiências da pessoa.")
  public List<DisabilityDto> getDisabilities() {
    return disabilities;
  }

  public void setDisabilities(List<DisabilityDto> disabilities) {
    this.disabilities = disabilities;
  }

  public Resume incompleteNotifications(Integer incompleteNotifications) {
    this.incompleteNotifications = incompleteNotifications;
    return this;
  }

   /**
   * Número de notificação de currículo incompleto enviadas.
   * @return incompleteNotifications
  **/
  @ApiModelProperty(value = "Número de notificação de currículo incompleto enviadas.")
  public Integer getIncompleteNotifications() {
    return incompleteNotifications;
  }

  public void setIncompleteNotifications(Integer incompleteNotifications) {
    this.incompleteNotifications = incompleteNotifications;
  }

  public Resume positionsSought(List<PositionSought> positionsSought) {
    this.positionsSought = positionsSought;
    return this;
  }

  public Resume addPositionsSoughtItem(PositionSought positionsSoughtItem) {
    if (this.positionsSought == null) {
      this.positionsSought = new ArrayList<PositionSought>();
    }
    this.positionsSought.add(positionsSoughtItem);
    return this;
  }

   /**
   * Cargos pretendidos.
   * @return positionsSought
  **/
  @ApiModelProperty(value = "Cargos pretendidos.")
  public List<PositionSought> getPositionsSought() {
    return positionsSought;
  }

  public void setPositionsSought(List<PositionSought> positionsSought) {
    this.positionsSought = positionsSought;
  }

  public Resume name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome completo da pessoa.
   * @return name
  **/
  @ApiModelProperty(value = "Nome completo da pessoa.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Resume neighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
    return this;
  }

   /**
   * Bairro/Distrito.
   * @return neighborhood
  **/
  @ApiModelProperty(value = "Bairro/Distrito.")
  public String getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }

  public Resume photoLink(String photoLink) {
    this.photoLink = photoLink;
    return this;
  }

   /**
   * Link da foto
   * @return photoLink
  **/
  @ApiModelProperty(value = "Link da foto")
  public String getPhotoLink() {
    return photoLink;
  }

  public void setPhotoLink(String photoLink) {
    this.photoLink = photoLink;
  }

  public Resume travel(Boolean travel) {
    this.travel = travel;
    return this;
  }

   /**
   * Disponível para viagens.
   * @return travel
  **/
  @ApiModelProperty(value = "Disponível para viagens.")
  public Boolean isTravel() {
    return travel;
  }

  public void setTravel(Boolean travel) {
    this.travel = travel;
  }

  public Resume maritalStatus(MaritalStatusDto maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

   /**
   * Get maritalStatus
   * @return maritalStatus
  **/
  @ApiModelProperty(value = "")
  public MaritalStatusDto getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(MaritalStatusDto maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public Resume knowledges(List<Knowledge> knowledges) {
    this.knowledges = knowledges;
    return this;
  }

  public Resume addKnowledgesItem(Knowledge knowledgesItem) {
    if (this.knowledges == null) {
      this.knowledges = new ArrayList<Knowledge>();
    }
    this.knowledges.add(knowledgesItem);
    return this;
  }

   /**
   * Conhecimentos.
   * @return knowledges
  **/
  @ApiModelProperty(value = "Conhecimentos.")
  public List<Knowledge> getKnowledges() {
    return knowledges;
  }

  public void setKnowledges(List<Knowledge> knowledges) {
    this.knowledges = knowledges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resume resume = (Resume) o;
    return Objects.equals(this.birthday, resume.birthday) &&
        Objects.equals(this.country, resume.country) &&
        Objects.equals(this.gender, resume.gender) &&
        Objects.equals(this.city, resume.city) &&
        Objects.equals(this.additional, resume.additional) &&
        Objects.equals(this.postalCode, resume.postalCode) &&
        Objects.equals(this.educations, resume.educations) &&
        Objects.equals(this.instagram, resume.instagram) &&
        Objects.equals(this.locale, resume.locale) &&
        Objects.equals(this.salaryExpectation, resume.salaryExpectation) &&
        Objects.equals(this.personalInterests, resume.personalInterests) &&
        Objects.equals(this.googlePlus, resume.googlePlus) &&
        Objects.equals(this.abilities, resume.abilities) &&
        Objects.equals(this.number, resume.number) &&
        Objects.equals(this.skype, resume.skype) &&
        Objects.equals(this.createdAt, resume.createdAt) &&
        Objects.equals(this.twitter, resume.twitter) &&
        Objects.equals(this.personalityModelCandidate, resume.personalityModelCandidate) &&
        Objects.equals(this.children, resume.children) &&
        Objects.equals(this.cpf, resume.cpf) &&
        Objects.equals(this.hasNotProfessionalExperience, resume.hasNotProfessionalExperience) &&
        Objects.equals(this.id, resume.id) &&
        Objects.equals(this.state, resume.state) &&
        Objects.equals(this.attachmentId, resume.attachmentId) &&
        Objects.equals(this.phoneContacts, resume.phoneContacts) &&
        Objects.equals(this.email, resume.email) &&
        Objects.equals(this.honorific, resume.honorific) &&
        Objects.equals(this.updatedAt, resume.updatedAt) &&
        Objects.equals(this.address, resume.address) &&
        Objects.equals(this.languages, resume.languages) &&
        Objects.equals(this.professionalExperiences, resume.professionalExperiences) &&
        Objects.equals(this.photoThumbnailLink, resume.photoThumbnailLink) &&
        Objects.equals(this.facebook, resume.facebook) &&
        Objects.equals(this.professionalSummary, resume.professionalSummary) &&
        Objects.equals(this.photoId, resume.photoId) &&
        Objects.equals(this.relocation, resume.relocation) &&
        Objects.equals(this.professionalGoal, resume.professionalGoal) &&
        Objects.equals(this.linkedIn, resume.linkedIn) &&
        Objects.equals(this.disabilities, resume.disabilities) &&
        Objects.equals(this.incompleteNotifications, resume.incompleteNotifications) &&
        Objects.equals(this.positionsSought, resume.positionsSought) &&
        Objects.equals(this.name, resume.name) &&
        Objects.equals(this.neighborhood, resume.neighborhood) &&
        Objects.equals(this.photoLink, resume.photoLink) &&
        Objects.equals(this.travel, resume.travel) &&
        Objects.equals(this.maritalStatus, resume.maritalStatus) &&
        Objects.equals(this.knowledges, resume.knowledges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthday, country, gender, city, additional, postalCode, educations, instagram, locale, salaryExpectation, personalInterests, googlePlus, abilities, number, skype, createdAt, twitter, personalityModelCandidate, children, cpf, hasNotProfessionalExperience, id, state, attachmentId, phoneContacts, email, honorific, updatedAt, address, languages, professionalExperiences, photoThumbnailLink, facebook, professionalSummary, photoId, relocation, professionalGoal, linkedIn, disabilities, incompleteNotifications, positionsSought, name, neighborhood, photoLink, travel, maritalStatus, knowledges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resume {\n");
    
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    educations: ").append(toIndentedString(educations)).append("\n");
    sb.append("    instagram: ").append(toIndentedString(instagram)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    salaryExpectation: ").append(toIndentedString(salaryExpectation)).append("\n");
    sb.append("    personalInterests: ").append(toIndentedString(personalInterests)).append("\n");
    sb.append("    googlePlus: ").append(toIndentedString(googlePlus)).append("\n");
    sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    skype: ").append(toIndentedString(skype)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    personalityModelCandidate: ").append(toIndentedString(personalityModelCandidate)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    hasNotProfessionalExperience: ").append(toIndentedString(hasNotProfessionalExperience)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    phoneContacts: ").append(toIndentedString(phoneContacts)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    honorific: ").append(toIndentedString(honorific)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    professionalExperiences: ").append(toIndentedString(professionalExperiences)).append("\n");
    sb.append("    photoThumbnailLink: ").append(toIndentedString(photoThumbnailLink)).append("\n");
    sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
    sb.append("    professionalSummary: ").append(toIndentedString(professionalSummary)).append("\n");
    sb.append("    photoId: ").append(toIndentedString(photoId)).append("\n");
    sb.append("    relocation: ").append(toIndentedString(relocation)).append("\n");
    sb.append("    professionalGoal: ").append(toIndentedString(professionalGoal)).append("\n");
    sb.append("    linkedIn: ").append(toIndentedString(linkedIn)).append("\n");
    sb.append("    disabilities: ").append(toIndentedString(disabilities)).append("\n");
    sb.append("    incompleteNotifications: ").append(toIndentedString(incompleteNotifications)).append("\n");
    sb.append("    positionsSought: ").append(toIndentedString(positionsSought)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    neighborhood: ").append(toIndentedString(neighborhood)).append("\n");
    sb.append("    photoLink: ").append(toIndentedString(photoLink)).append("\n");
    sb.append("    travel: ").append(toIndentedString(travel)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    knowledges: ").append(toIndentedString(knowledges)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


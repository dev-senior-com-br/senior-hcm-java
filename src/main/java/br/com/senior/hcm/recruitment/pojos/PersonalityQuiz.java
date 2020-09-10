/*
 * Recrutamento e Seleção
 * Serviço do Gestão de Recrutamento e Seleção.
 *
 * OpenAPI spec version: 16.0.1
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
import br.com.senior.hcm.recruitment.pojos.PersonalityModelVacancy;
import br.com.senior.hcm.recruitment.pojos.Question;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * PersonalityQuiz
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-10T16:52:01.386Z")



public class PersonalityQuiz {
  @SerializedName("wordCount")
  private Integer wordCount = null;

  @SerializedName("canEdit")
  private Boolean canEdit = null;

  @SerializedName("questions")
  private List<Question> questions = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("isActive")
  private Boolean isActive = null;

  @SerializedName("initialDate")
  private LocalDate initialDate = null;

  @SerializedName("personalityModelVacancy")
  private PersonalityModelVacancy personalityModelVacancy = null;

  public PersonalityQuiz wordCount(Integer wordCount) {
    this.wordCount = wordCount;
    return this;
  }

   /**
   * Quantidade de palavras na resposta.
   * @return wordCount
  **/
  @ApiModelProperty(value = "Quantidade de palavras na resposta.")
  public Integer getWordCount() {
    return wordCount;
  }

  public void setWordCount(Integer wordCount) {
    this.wordCount = wordCount;
  }

  public PersonalityQuiz canEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

   /**
   * Indica se o usuário pode alterar o questionário vigente. O usuário só poderá editar, caso nenhum candidato interno ou externo tenha o respondido.
   * @return canEdit
  **/
  @ApiModelProperty(value = "Indica se o usuário pode alterar o questionário vigente. O usuário só poderá editar, caso nenhum candidato interno ou externo tenha o respondido.")
  public Boolean isCanEdit() {
    return canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  public PersonalityQuiz questions(List<Question> questions) {
    this.questions = questions;
    return this;
  }

  public PersonalityQuiz addQuestionsItem(Question questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<Question>();
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Perguntas do questionário.
   * @return questions
  **/
  @ApiModelProperty(value = "Perguntas do questionário.")
  public List<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }

  public PersonalityQuiz description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descrição do questionário.
   * @return description
  **/
  @ApiModelProperty(value = "Descrição do questionário.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PersonalityQuiz id(String id) {
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

  public PersonalityQuiz isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indica se é o modelo vigente (última data de criação - initialDate).
   * @return isActive
  **/
  @ApiModelProperty(value = "Indica se é o modelo vigente (última data de criação - initialDate).")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public PersonalityQuiz initialDate(LocalDate initialDate) {
    this.initialDate = initialDate;
    return this;
  }

   /**
   * Data de início do período de vigência.
   * @return initialDate
  **/
  @ApiModelProperty(value = "Data de início do período de vigência.")
  public LocalDate getInitialDate() {
    return initialDate;
  }

  public void setInitialDate(LocalDate initialDate) {
    this.initialDate = initialDate;
  }

  public PersonalityQuiz personalityModelVacancy(PersonalityModelVacancy personalityModelVacancy) {
    this.personalityModelVacancy = personalityModelVacancy;
    return this;
  }

   /**
   * Get personalityModelVacancy
   * @return personalityModelVacancy
  **/
  @ApiModelProperty(value = "")
  public PersonalityModelVacancy getPersonalityModelVacancy() {
    return personalityModelVacancy;
  }

  public void setPersonalityModelVacancy(PersonalityModelVacancy personalityModelVacancy) {
    this.personalityModelVacancy = personalityModelVacancy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalityQuiz personalityQuiz = (PersonalityQuiz) o;
    return Objects.equals(this.wordCount, personalityQuiz.wordCount) &&
        Objects.equals(this.canEdit, personalityQuiz.canEdit) &&
        Objects.equals(this.questions, personalityQuiz.questions) &&
        Objects.equals(this.description, personalityQuiz.description) &&
        Objects.equals(this.id, personalityQuiz.id) &&
        Objects.equals(this.isActive, personalityQuiz.isActive) &&
        Objects.equals(this.initialDate, personalityQuiz.initialDate) &&
        Objects.equals(this.personalityModelVacancy, personalityQuiz.personalityModelVacancy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wordCount, canEdit, questions, description, id, isActive, initialDate, personalityModelVacancy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalityQuiz {\n");
    
    sb.append("    wordCount: ").append(toIndentedString(wordCount)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    initialDate: ").append(toIndentedString(initialDate)).append("\n");
    sb.append("    personalityModelVacancy: ").append(toIndentedString(personalityModelVacancy)).append("\n");
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


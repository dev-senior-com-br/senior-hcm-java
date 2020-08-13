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
import io.swagger.client.model.Answer;
import io.swagger.client.model.BigFive;
import io.swagger.client.model.Needs;
import io.swagger.client.model.PersonalityQuiz;
import io.swagger.client.model.ToneAnalysis;
import io.swagger.client.model.Values;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PersonalityModelCandidate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-13T13:45:43.649Z")



public class PersonalityModelCandidate {
  @SerializedName("needs")
  private Needs needs = null;

  @SerializedName("resumeId")
  private String resumeId = null;

  @SerializedName("values")
  private Values values = null;

  @SerializedName("answers")
  private List<Answer> answers = null;

  @SerializedName("personalityQuiz")
  private PersonalityQuiz personalityQuiz = null;

  @SerializedName("employeeId")
  private String employeeId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("bigFive")
  private BigFive bigFive = null;

  @SerializedName("toneAnalysis")
  private ToneAnalysis toneAnalysis = null;

  public PersonalityModelCandidate needs(Needs needs) {
    this.needs = needs;
    return this;
  }

   /**
   * Get needs
   * @return needs
  **/
  @ApiModelProperty(value = "")
  public Needs getNeeds() {
    return needs;
  }

  public void setNeeds(Needs needs) {
    this.needs = needs;
  }

  public PersonalityModelCandidate resumeId(String resumeId) {
    this.resumeId = resumeId;
    return this;
  }

   /**
   * ID do candidato externo (quando aplicável).
   * @return resumeId
  **/
  @ApiModelProperty(value = "ID do candidato externo (quando aplicável).")
  public String getResumeId() {
    return resumeId;
  }

  public void setResumeId(String resumeId) {
    this.resumeId = resumeId;
  }

  public PersonalityModelCandidate values(Values values) {
    this.values = values;
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(value = "")
  public Values getValues() {
    return values;
  }

  public void setValues(Values values) {
    this.values = values;
  }

  public PersonalityModelCandidate answers(List<Answer> answers) {
    this.answers = answers;
    return this;
  }

  public PersonalityModelCandidate addAnswersItem(Answer answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<Answer>();
    }
    this.answers.add(answersItem);
    return this;
  }

   /**
   * Repostas do candidato para a criação do modelo e personalidade.
   * @return answers
  **/
  @ApiModelProperty(value = "Repostas do candidato para a criação do modelo e personalidade.")
  public List<Answer> getAnswers() {
    return answers;
  }

  public void setAnswers(List<Answer> answers) {
    this.answers = answers;
  }

  public PersonalityModelCandidate personalityQuiz(PersonalityQuiz personalityQuiz) {
    this.personalityQuiz = personalityQuiz;
    return this;
  }

   /**
   * Get personalityQuiz
   * @return personalityQuiz
  **/
  @ApiModelProperty(value = "")
  public PersonalityQuiz getPersonalityQuiz() {
    return personalityQuiz;
  }

  public void setPersonalityQuiz(PersonalityQuiz personalityQuiz) {
    this.personalityQuiz = personalityQuiz;
  }

  public PersonalityModelCandidate employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   * ID do candidato interno (quando aplicável).
   * @return employeeId
  **/
  @ApiModelProperty(value = "ID do candidato interno (quando aplicável).")
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public PersonalityModelCandidate id(String id) {
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

  public PersonalityModelCandidate bigFive(BigFive bigFive) {
    this.bigFive = bigFive;
    return this;
  }

   /**
   * Get bigFive
   * @return bigFive
  **/
  @ApiModelProperty(value = "")
  public BigFive getBigFive() {
    return bigFive;
  }

  public void setBigFive(BigFive bigFive) {
    this.bigFive = bigFive;
  }

  public PersonalityModelCandidate toneAnalysis(ToneAnalysis toneAnalysis) {
    this.toneAnalysis = toneAnalysis;
    return this;
  }

   /**
   * Get toneAnalysis
   * @return toneAnalysis
  **/
  @ApiModelProperty(value = "")
  public ToneAnalysis getToneAnalysis() {
    return toneAnalysis;
  }

  public void setToneAnalysis(ToneAnalysis toneAnalysis) {
    this.toneAnalysis = toneAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalityModelCandidate personalityModelCandidate = (PersonalityModelCandidate) o;
    return Objects.equals(this.needs, personalityModelCandidate.needs) &&
        Objects.equals(this.resumeId, personalityModelCandidate.resumeId) &&
        Objects.equals(this.values, personalityModelCandidate.values) &&
        Objects.equals(this.answers, personalityModelCandidate.answers) &&
        Objects.equals(this.personalityQuiz, personalityModelCandidate.personalityQuiz) &&
        Objects.equals(this.employeeId, personalityModelCandidate.employeeId) &&
        Objects.equals(this.id, personalityModelCandidate.id) &&
        Objects.equals(this.bigFive, personalityModelCandidate.bigFive) &&
        Objects.equals(this.toneAnalysis, personalityModelCandidate.toneAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(needs, resumeId, values, answers, personalityQuiz, employeeId, id, bigFive, toneAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalityModelCandidate {\n");
    
    sb.append("    needs: ").append(toIndentedString(needs)).append("\n");
    sb.append("    resumeId: ").append(toIndentedString(resumeId)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    personalityQuiz: ").append(toIndentedString(personalityQuiz)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bigFive: ").append(toIndentedString(bigFive)).append("\n");
    sb.append("    toneAnalysis: ").append(toIndentedString(toneAnalysis)).append("\n");
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


/*
 * Recrutamento e Seleção
 * Serviço do Gestão de Recrutamento e Seleção.
 *
 * OpenAPI spec version: 15.10.4
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
import br.com.senior.hcm.recruitment.pojos.PersonalityQuiz;
import br.com.senior.hcm.recruitment.pojos.Vacancy;
import java.io.IOException;

/**
 * PersonalityModelVacancy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-14T11:43:22.583Z")



public class PersonalityModelVacancy {
  @SerializedName("conscientiousness")
  private Double conscientiousness = null;

  @SerializedName("openness")
  private Double openness = null;

  @SerializedName("neuroticism")
  private Double neuroticism = null;

  @SerializedName("extraversion")
  private Double extraversion = null;

  @SerializedName("personalityQuiz")
  private PersonalityQuiz personalityQuiz = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("vacancy")
  private Vacancy vacancy = null;

  @SerializedName("agreeableness")
  private Double agreeableness = null;

  public PersonalityModelVacancy conscientiousness(Double conscientiousness) {
    this.conscientiousness = conscientiousness;
    return this;
  }

   /**
   * Escrupulosidade.
   * @return conscientiousness
  **/
  @ApiModelProperty(value = "Escrupulosidade.")
  public Double getConscientiousness() {
    return conscientiousness;
  }

  public void setConscientiousness(Double conscientiousness) {
    this.conscientiousness = conscientiousness;
  }

  public PersonalityModelVacancy openness(Double openness) {
    this.openness = openness;
    return this;
  }

   /**
   * Abertura.
   * @return openness
  **/
  @ApiModelProperty(value = "Abertura.")
  public Double getOpenness() {
    return openness;
  }

  public void setOpenness(Double openness) {
    this.openness = openness;
  }

  public PersonalityModelVacancy neuroticism(Double neuroticism) {
    this.neuroticism = neuroticism;
    return this;
  }

   /**
   * Alcance emocional.
   * @return neuroticism
  **/
  @ApiModelProperty(value = "Alcance emocional.")
  public Double getNeuroticism() {
    return neuroticism;
  }

  public void setNeuroticism(Double neuroticism) {
    this.neuroticism = neuroticism;
  }

  public PersonalityModelVacancy extraversion(Double extraversion) {
    this.extraversion = extraversion;
    return this;
  }

   /**
   * Extroversão.
   * @return extraversion
  **/
  @ApiModelProperty(value = "Extroversão.")
  public Double getExtraversion() {
    return extraversion;
  }

  public void setExtraversion(Double extraversion) {
    this.extraversion = extraversion;
  }

  public PersonalityModelVacancy personalityQuiz(PersonalityQuiz personalityQuiz) {
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

  public PersonalityModelVacancy id(String id) {
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

  public PersonalityModelVacancy vacancy(Vacancy vacancy) {
    this.vacancy = vacancy;
    return this;
  }

   /**
   * Get vacancy
   * @return vacancy
  **/
  @ApiModelProperty(value = "")
  public Vacancy getVacancy() {
    return vacancy;
  }

  public void setVacancy(Vacancy vacancy) {
    this.vacancy = vacancy;
  }

  public PersonalityModelVacancy agreeableness(Double agreeableness) {
    this.agreeableness = agreeableness;
    return this;
  }

   /**
   * Amabilidade.
   * @return agreeableness
  **/
  @ApiModelProperty(value = "Amabilidade.")
  public Double getAgreeableness() {
    return agreeableness;
  }

  public void setAgreeableness(Double agreeableness) {
    this.agreeableness = agreeableness;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalityModelVacancy personalityModelVacancy = (PersonalityModelVacancy) o;
    return Objects.equals(this.conscientiousness, personalityModelVacancy.conscientiousness) &&
        Objects.equals(this.openness, personalityModelVacancy.openness) &&
        Objects.equals(this.neuroticism, personalityModelVacancy.neuroticism) &&
        Objects.equals(this.extraversion, personalityModelVacancy.extraversion) &&
        Objects.equals(this.personalityQuiz, personalityModelVacancy.personalityQuiz) &&
        Objects.equals(this.id, personalityModelVacancy.id) &&
        Objects.equals(this.vacancy, personalityModelVacancy.vacancy) &&
        Objects.equals(this.agreeableness, personalityModelVacancy.agreeableness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conscientiousness, openness, neuroticism, extraversion, personalityQuiz, id, vacancy, agreeableness);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalityModelVacancy {\n");
    
    sb.append("    conscientiousness: ").append(toIndentedString(conscientiousness)).append("\n");
    sb.append("    openness: ").append(toIndentedString(openness)).append("\n");
    sb.append("    neuroticism: ").append(toIndentedString(neuroticism)).append("\n");
    sb.append("    extraversion: ").append(toIndentedString(extraversion)).append("\n");
    sb.append("    personalityQuiz: ").append(toIndentedString(personalityQuiz)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vacancy: ").append(toIndentedString(vacancy)).append("\n");
    sb.append("    agreeableness: ").append(toIndentedString(agreeableness)).append("\n");
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


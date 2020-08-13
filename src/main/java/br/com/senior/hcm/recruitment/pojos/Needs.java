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
import br.com.senior.hcm.recruitment.pojos.PersonalityModelCandidate;
import java.io.IOException;

/**
 * Needs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-13T20:44:04.403Z")



public class Needs {
  @SerializedName("love")
  private Double love = null;

  @SerializedName("harmony")
  private Double harmony = null;

  @SerializedName("ideal")
  private Double ideal = null;

  @SerializedName("curiosity")
  private Double curiosity = null;

  @SerializedName("closeness")
  private Double closeness = null;

  @SerializedName("excitement")
  private Double excitement = null;

  @SerializedName("structure")
  private Double structure = null;

  @SerializedName("practicality")
  private Double practicality = null;

  @SerializedName("personalityModelCandidate")
  private PersonalityModelCandidate personalityModelCandidate = null;

  @SerializedName("liberty")
  private Double liberty = null;

  @SerializedName("selfExpression")
  private Double selfExpression = null;

  @SerializedName("challenge")
  private Double challenge = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("stability")
  private Double stability = null;

  public Needs love(Double love) {
    this.love = love;
    return this;
  }

   /**
   * Amor.
   * @return love
  **/
  @ApiModelProperty(value = "Amor.")
  public Double getLove() {
    return love;
  }

  public void setLove(Double love) {
    this.love = love;
  }

  public Needs harmony(Double harmony) {
    this.harmony = harmony;
    return this;
  }

   /**
   * Harmonia.
   * @return harmony
  **/
  @ApiModelProperty(value = "Harmonia.")
  public Double getHarmony() {
    return harmony;
  }

  public void setHarmony(Double harmony) {
    this.harmony = harmony;
  }

  public Needs ideal(Double ideal) {
    this.ideal = ideal;
    return this;
  }

   /**
   * Ideal.
   * @return ideal
  **/
  @ApiModelProperty(value = "Ideal.")
  public Double getIdeal() {
    return ideal;
  }

  public void setIdeal(Double ideal) {
    this.ideal = ideal;
  }

  public Needs curiosity(Double curiosity) {
    this.curiosity = curiosity;
    return this;
  }

   /**
   * Curiosidade.
   * @return curiosity
  **/
  @ApiModelProperty(value = "Curiosidade.")
  public Double getCuriosity() {
    return curiosity;
  }

  public void setCuriosity(Double curiosity) {
    this.curiosity = curiosity;
  }

  public Needs closeness(Double closeness) {
    this.closeness = closeness;
    return this;
  }

   /**
   * Retraimento.
   * @return closeness
  **/
  @ApiModelProperty(value = "Retraimento.")
  public Double getCloseness() {
    return closeness;
  }

  public void setCloseness(Double closeness) {
    this.closeness = closeness;
  }

  public Needs excitement(Double excitement) {
    this.excitement = excitement;
    return this;
  }

   /**
   * Empolgação.
   * @return excitement
  **/
  @ApiModelProperty(value = "Empolgação.")
  public Double getExcitement() {
    return excitement;
  }

  public void setExcitement(Double excitement) {
    this.excitement = excitement;
  }

  public Needs structure(Double structure) {
    this.structure = structure;
    return this;
  }

   /**
   * Estrutura.
   * @return structure
  **/
  @ApiModelProperty(value = "Estrutura.")
  public Double getStructure() {
    return structure;
  }

  public void setStructure(Double structure) {
    this.structure = structure;
  }

  public Needs practicality(Double practicality) {
    this.practicality = practicality;
    return this;
  }

   /**
   * Natureza prática.
   * @return practicality
  **/
  @ApiModelProperty(value = "Natureza prática.")
  public Double getPracticality() {
    return practicality;
  }

  public void setPracticality(Double practicality) {
    this.practicality = practicality;
  }

  public Needs personalityModelCandidate(PersonalityModelCandidate personalityModelCandidate) {
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

  public Needs liberty(Double liberty) {
    this.liberty = liberty;
    return this;
  }

   /**
   * Liberdade.
   * @return liberty
  **/
  @ApiModelProperty(value = "Liberdade.")
  public Double getLiberty() {
    return liberty;
  }

  public void setLiberty(Double liberty) {
    this.liberty = liberty;
  }

  public Needs selfExpression(Double selfExpression) {
    this.selfExpression = selfExpression;
    return this;
  }

   /**
   * Expressão da própria personalidade.
   * @return selfExpression
  **/
  @ApiModelProperty(value = "Expressão da própria personalidade.")
  public Double getSelfExpression() {
    return selfExpression;
  }

  public void setSelfExpression(Double selfExpression) {
    this.selfExpression = selfExpression;
  }

  public Needs challenge(Double challenge) {
    this.challenge = challenge;
    return this;
  }

   /**
   * Desafio.
   * @return challenge
  **/
  @ApiModelProperty(value = "Desafio.")
  public Double getChallenge() {
    return challenge;
  }

  public void setChallenge(Double challenge) {
    this.challenge = challenge;
  }

  public Needs id(String id) {
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

  public Needs stability(Double stability) {
    this.stability = stability;
    return this;
  }

   /**
   * Estabilidade.
   * @return stability
  **/
  @ApiModelProperty(value = "Estabilidade.")
  public Double getStability() {
    return stability;
  }

  public void setStability(Double stability) {
    this.stability = stability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Needs needs = (Needs) o;
    return Objects.equals(this.love, needs.love) &&
        Objects.equals(this.harmony, needs.harmony) &&
        Objects.equals(this.ideal, needs.ideal) &&
        Objects.equals(this.curiosity, needs.curiosity) &&
        Objects.equals(this.closeness, needs.closeness) &&
        Objects.equals(this.excitement, needs.excitement) &&
        Objects.equals(this.structure, needs.structure) &&
        Objects.equals(this.practicality, needs.practicality) &&
        Objects.equals(this.personalityModelCandidate, needs.personalityModelCandidate) &&
        Objects.equals(this.liberty, needs.liberty) &&
        Objects.equals(this.selfExpression, needs.selfExpression) &&
        Objects.equals(this.challenge, needs.challenge) &&
        Objects.equals(this.id, needs.id) &&
        Objects.equals(this.stability, needs.stability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(love, harmony, ideal, curiosity, closeness, excitement, structure, practicality, personalityModelCandidate, liberty, selfExpression, challenge, id, stability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Needs {\n");
    
    sb.append("    love: ").append(toIndentedString(love)).append("\n");
    sb.append("    harmony: ").append(toIndentedString(harmony)).append("\n");
    sb.append("    ideal: ").append(toIndentedString(ideal)).append("\n");
    sb.append("    curiosity: ").append(toIndentedString(curiosity)).append("\n");
    sb.append("    closeness: ").append(toIndentedString(closeness)).append("\n");
    sb.append("    excitement: ").append(toIndentedString(excitement)).append("\n");
    sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
    sb.append("    practicality: ").append(toIndentedString(practicality)).append("\n");
    sb.append("    personalityModelCandidate: ").append(toIndentedString(personalityModelCandidate)).append("\n");
    sb.append("    liberty: ").append(toIndentedString(liberty)).append("\n");
    sb.append("    selfExpression: ").append(toIndentedString(selfExpression)).append("\n");
    sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    stability: ").append(toIndentedString(stability)).append("\n");
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


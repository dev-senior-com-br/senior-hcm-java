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
import br.com.senior.hcm.recruitment.pojos.BigFive;
import java.io.IOException;

/**
 * Agreeableness
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-13T20:31:14.805Z")



public class Agreeableness {
  @SerializedName("trust")
  private Double trust = null;

  @SerializedName("dimensionValue")
  private Double dimensionValue = null;

  @SerializedName("modesty")
  private Double modesty = null;

  @SerializedName("altruism")
  private Double altruism = null;

  @SerializedName("morality")
  private Double morality = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("sympathy")
  private Double sympathy = null;

  @SerializedName("bigFive")
  private BigFive bigFive = null;

  @SerializedName("cooperation")
  private Double cooperation = null;

  public Agreeableness trust(Double trust) {
    this.trust = trust;
    return this;
  }

   /**
   * Faceta de confiança.
   * @return trust
  **/
  @ApiModelProperty(value = "Faceta de confiança.")
  public Double getTrust() {
    return trust;
  }

  public void setTrust(Double trust) {
    this.trust = trust;
  }

  public Agreeableness dimensionValue(Double dimensionValue) {
    this.dimensionValue = dimensionValue;
    return this;
  }

   /**
   * Valor desta dimensão
   * @return dimensionValue
  **/
  @ApiModelProperty(value = "Valor desta dimensão")
  public Double getDimensionValue() {
    return dimensionValue;
  }

  public void setDimensionValue(Double dimensionValue) {
    this.dimensionValue = dimensionValue;
  }

  public Agreeableness modesty(Double modesty) {
    this.modesty = modesty;
    return this;
  }

   /**
   * Faceta de modéstia.
   * @return modesty
  **/
  @ApiModelProperty(value = "Faceta de modéstia.")
  public Double getModesty() {
    return modesty;
  }

  public void setModesty(Double modesty) {
    this.modesty = modesty;
  }

  public Agreeableness altruism(Double altruism) {
    this.altruism = altruism;
    return this;
  }

   /**
   * Faceta de altruísmo.
   * @return altruism
  **/
  @ApiModelProperty(value = "Faceta de altruísmo.")
  public Double getAltruism() {
    return altruism;
  }

  public void setAltruism(Double altruism) {
    this.altruism = altruism;
  }

  public Agreeableness morality(Double morality) {
    this.morality = morality;
    return this;
  }

   /**
   * Faceta de moralidade.
   * @return morality
  **/
  @ApiModelProperty(value = "Faceta de moralidade.")
  public Double getMorality() {
    return morality;
  }

  public void setMorality(Double morality) {
    this.morality = morality;
  }

  public Agreeableness id(String id) {
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

  public Agreeableness sympathy(Double sympathy) {
    this.sympathy = sympathy;
    return this;
  }

   /**
   * Faceta de empatia.
   * @return sympathy
  **/
  @ApiModelProperty(value = "Faceta de empatia.")
  public Double getSympathy() {
    return sympathy;
  }

  public void setSympathy(Double sympathy) {
    this.sympathy = sympathy;
  }

  public Agreeableness bigFive(BigFive bigFive) {
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

  public Agreeableness cooperation(Double cooperation) {
    this.cooperation = cooperation;
    return this;
  }

   /**
   * Faceta de cooperação.
   * @return cooperation
  **/
  @ApiModelProperty(value = "Faceta de cooperação.")
  public Double getCooperation() {
    return cooperation;
  }

  public void setCooperation(Double cooperation) {
    this.cooperation = cooperation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agreeableness agreeableness = (Agreeableness) o;
    return Objects.equals(this.trust, agreeableness.trust) &&
        Objects.equals(this.dimensionValue, agreeableness.dimensionValue) &&
        Objects.equals(this.modesty, agreeableness.modesty) &&
        Objects.equals(this.altruism, agreeableness.altruism) &&
        Objects.equals(this.morality, agreeableness.morality) &&
        Objects.equals(this.id, agreeableness.id) &&
        Objects.equals(this.sympathy, agreeableness.sympathy) &&
        Objects.equals(this.bigFive, agreeableness.bigFive) &&
        Objects.equals(this.cooperation, agreeableness.cooperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trust, dimensionValue, modesty, altruism, morality, id, sympathy, bigFive, cooperation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agreeableness {\n");
    
    sb.append("    trust: ").append(toIndentedString(trust)).append("\n");
    sb.append("    dimensionValue: ").append(toIndentedString(dimensionValue)).append("\n");
    sb.append("    modesty: ").append(toIndentedString(modesty)).append("\n");
    sb.append("    altruism: ").append(toIndentedString(altruism)).append("\n");
    sb.append("    morality: ").append(toIndentedString(morality)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sympathy: ").append(toIndentedString(sympathy)).append("\n");
    sb.append("    bigFive: ").append(toIndentedString(bigFive)).append("\n");
    sb.append("    cooperation: ").append(toIndentedString(cooperation)).append("\n");
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


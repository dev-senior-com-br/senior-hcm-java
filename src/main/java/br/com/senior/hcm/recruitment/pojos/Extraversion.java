/*
 * Recrutamento e Seleção
 * Serviço do Gestão de Recrutamento e Seleção.
 *
 * OpenAPI spec version: 15.11.0
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
 * Extraversion
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-26T22:02:06.260Z")



public class Extraversion {
  @SerializedName("gregariousness")
  private Double gregariousness = null;

  @SerializedName("dimensionValue")
  private Double dimensionValue = null;

  @SerializedName("cheerfulness")
  private Double cheerfulness = null;

  @SerializedName("excitementSeeking")
  private Double excitementSeeking = null;

  @SerializedName("friendliness")
  private Double friendliness = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("activityLevel")
  private Double activityLevel = null;

  @SerializedName("assertiveness")
  private Double assertiveness = null;

  @SerializedName("bigFive")
  private BigFive bigFive = null;

  public Extraversion gregariousness(Double gregariousness) {
    this.gregariousness = gregariousness;
    return this;
  }

   /**
   * Faceta de socialização.
   * @return gregariousness
  **/
  @ApiModelProperty(value = "Faceta de socialização.")
  public Double getGregariousness() {
    return gregariousness;
  }

  public void setGregariousness(Double gregariousness) {
    this.gregariousness = gregariousness;
  }

  public Extraversion dimensionValue(Double dimensionValue) {
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

  public Extraversion cheerfulness(Double cheerfulness) {
    this.cheerfulness = cheerfulness;
    return this;
  }

   /**
   * Faceta de alegria.
   * @return cheerfulness
  **/
  @ApiModelProperty(value = "Faceta de alegria.")
  public Double getCheerfulness() {
    return cheerfulness;
  }

  public void setCheerfulness(Double cheerfulness) {
    this.cheerfulness = cheerfulness;
  }

  public Extraversion excitementSeeking(Double excitementSeeking) {
    this.excitementSeeking = excitementSeeking;
    return this;
  }

   /**
   * Faceta de busca de emoção.
   * @return excitementSeeking
  **/
  @ApiModelProperty(value = "Faceta de busca de emoção.")
  public Double getExcitementSeeking() {
    return excitementSeeking;
  }

  public void setExcitementSeeking(Double excitementSeeking) {
    this.excitementSeeking = excitementSeeking;
  }

  public Extraversion friendliness(Double friendliness) {
    this.friendliness = friendliness;
    return this;
  }

   /**
   * Faceta de simpatia.
   * @return friendliness
  **/
  @ApiModelProperty(value = "Faceta de simpatia.")
  public Double getFriendliness() {
    return friendliness;
  }

  public void setFriendliness(Double friendliness) {
    this.friendliness = friendliness;
  }

  public Extraversion id(String id) {
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

  public Extraversion activityLevel(Double activityLevel) {
    this.activityLevel = activityLevel;
    return this;
  }

   /**
   * Faceta de energia.
   * @return activityLevel
  **/
  @ApiModelProperty(value = "Faceta de energia.")
  public Double getActivityLevel() {
    return activityLevel;
  }

  public void setActivityLevel(Double activityLevel) {
    this.activityLevel = activityLevel;
  }

  public Extraversion assertiveness(Double assertiveness) {
    this.assertiveness = assertiveness;
    return this;
  }

   /**
   * Faceta de assertividade.
   * @return assertiveness
  **/
  @ApiModelProperty(value = "Faceta de assertividade.")
  public Double getAssertiveness() {
    return assertiveness;
  }

  public void setAssertiveness(Double assertiveness) {
    this.assertiveness = assertiveness;
  }

  public Extraversion bigFive(BigFive bigFive) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Extraversion extraversion = (Extraversion) o;
    return Objects.equals(this.gregariousness, extraversion.gregariousness) &&
        Objects.equals(this.dimensionValue, extraversion.dimensionValue) &&
        Objects.equals(this.cheerfulness, extraversion.cheerfulness) &&
        Objects.equals(this.excitementSeeking, extraversion.excitementSeeking) &&
        Objects.equals(this.friendliness, extraversion.friendliness) &&
        Objects.equals(this.id, extraversion.id) &&
        Objects.equals(this.activityLevel, extraversion.activityLevel) &&
        Objects.equals(this.assertiveness, extraversion.assertiveness) &&
        Objects.equals(this.bigFive, extraversion.bigFive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gregariousness, dimensionValue, cheerfulness, excitementSeeking, friendliness, id, activityLevel, assertiveness, bigFive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Extraversion {\n");
    
    sb.append("    gregariousness: ").append(toIndentedString(gregariousness)).append("\n");
    sb.append("    dimensionValue: ").append(toIndentedString(dimensionValue)).append("\n");
    sb.append("    cheerfulness: ").append(toIndentedString(cheerfulness)).append("\n");
    sb.append("    excitementSeeking: ").append(toIndentedString(excitementSeeking)).append("\n");
    sb.append("    friendliness: ").append(toIndentedString(friendliness)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    activityLevel: ").append(toIndentedString(activityLevel)).append("\n");
    sb.append("    assertiveness: ").append(toIndentedString(assertiveness)).append("\n");
    sb.append("    bigFive: ").append(toIndentedString(bigFive)).append("\n");
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


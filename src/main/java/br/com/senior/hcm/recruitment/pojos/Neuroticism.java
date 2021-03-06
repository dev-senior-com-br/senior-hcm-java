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
import br.com.senior.hcm.recruitment.pojos.BigFive;
import java.io.IOException;

/**
 * Neuroticism
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-10T16:52:01.386Z")



public class Neuroticism {
  @SerializedName("anxiety")
  private Double anxiety = null;

  @SerializedName("selfConsciousness")
  private Double selfConsciousness = null;

  @SerializedName("dimensionValue")
  private Double dimensionValue = null;

  @SerializedName("immoderation")
  private Double immoderation = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("depression")
  private Double depression = null;

  @SerializedName("vulnerability")
  private Double vulnerability = null;

  @SerializedName("anger")
  private Double anger = null;

  @SerializedName("bigFive")
  private BigFive bigFive = null;

  public Neuroticism anxiety(Double anxiety) {
    this.anxiety = anxiety;
    return this;
  }

   /**
   * Faceta de ansiedade.
   * @return anxiety
  **/
  @ApiModelProperty(value = "Faceta de ansiedade.")
  public Double getAnxiety() {
    return anxiety;
  }

  public void setAnxiety(Double anxiety) {
    this.anxiety = anxiety;
  }

  public Neuroticism selfConsciousness(Double selfConsciousness) {
    this.selfConsciousness = selfConsciousness;
    return this;
  }

   /**
   * Faceta de autoconsciência.
   * @return selfConsciousness
  **/
  @ApiModelProperty(value = "Faceta de autoconsciência.")
  public Double getSelfConsciousness() {
    return selfConsciousness;
  }

  public void setSelfConsciousness(Double selfConsciousness) {
    this.selfConsciousness = selfConsciousness;
  }

  public Neuroticism dimensionValue(Double dimensionValue) {
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

  public Neuroticism immoderation(Double immoderation) {
    this.immoderation = immoderation;
    return this;
  }

   /**
   * Faceta de auto-indulgência.
   * @return immoderation
  **/
  @ApiModelProperty(value = "Faceta de auto-indulgência.")
  public Double getImmoderation() {
    return immoderation;
  }

  public void setImmoderation(Double immoderation) {
    this.immoderation = immoderation;
  }

  public Neuroticism id(String id) {
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

  public Neuroticism depression(Double depression) {
    this.depression = depression;
    return this;
  }

   /**
   * Faceta de depressão.
   * @return depression
  **/
  @ApiModelProperty(value = "Faceta de depressão.")
  public Double getDepression() {
    return depression;
  }

  public void setDepression(Double depression) {
    this.depression = depression;
  }

  public Neuroticism vulnerability(Double vulnerability) {
    this.vulnerability = vulnerability;
    return this;
  }

   /**
   * Faceta de resiliência.
   * @return vulnerability
  **/
  @ApiModelProperty(value = "Faceta de resiliência.")
  public Double getVulnerability() {
    return vulnerability;
  }

  public void setVulnerability(Double vulnerability) {
    this.vulnerability = vulnerability;
  }

  public Neuroticism anger(Double anger) {
    this.anger = anger;
    return this;
  }

   /**
   * Faceta de raiva.
   * @return anger
  **/
  @ApiModelProperty(value = "Faceta de raiva.")
  public Double getAnger() {
    return anger;
  }

  public void setAnger(Double anger) {
    this.anger = anger;
  }

  public Neuroticism bigFive(BigFive bigFive) {
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
    Neuroticism neuroticism = (Neuroticism) o;
    return Objects.equals(this.anxiety, neuroticism.anxiety) &&
        Objects.equals(this.selfConsciousness, neuroticism.selfConsciousness) &&
        Objects.equals(this.dimensionValue, neuroticism.dimensionValue) &&
        Objects.equals(this.immoderation, neuroticism.immoderation) &&
        Objects.equals(this.id, neuroticism.id) &&
        Objects.equals(this.depression, neuroticism.depression) &&
        Objects.equals(this.vulnerability, neuroticism.vulnerability) &&
        Objects.equals(this.anger, neuroticism.anger) &&
        Objects.equals(this.bigFive, neuroticism.bigFive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anxiety, selfConsciousness, dimensionValue, immoderation, id, depression, vulnerability, anger, bigFive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neuroticism {\n");
    
    sb.append("    anxiety: ").append(toIndentedString(anxiety)).append("\n");
    sb.append("    selfConsciousness: ").append(toIndentedString(selfConsciousness)).append("\n");
    sb.append("    dimensionValue: ").append(toIndentedString(dimensionValue)).append("\n");
    sb.append("    immoderation: ").append(toIndentedString(immoderation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    depression: ").append(toIndentedString(depression)).append("\n");
    sb.append("    vulnerability: ").append(toIndentedString(vulnerability)).append("\n");
    sb.append("    anger: ").append(toIndentedString(anger)).append("\n");
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


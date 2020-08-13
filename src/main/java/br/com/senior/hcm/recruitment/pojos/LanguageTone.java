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
import br.com.senior.hcm.recruitment.pojos.ToneAnalysis;
import java.io.IOException;

/**
 * LanguageTone
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-13T20:31:14.805Z")



public class LanguageTone {
  @SerializedName("analytical")
  private Double analytical = null;

  @SerializedName("confident")
  private Double confident = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("tentative")
  private Double tentative = null;

  @SerializedName("toneAnalysis")
  private ToneAnalysis toneAnalysis = null;

  public LanguageTone analytical(Double analytical) {
    this.analytical = analytical;
    return this;
  }

   /**
   * Analítico.
   * @return analytical
  **/
  @ApiModelProperty(value = "Analítico.")
  public Double getAnalytical() {
    return analytical;
  }

  public void setAnalytical(Double analytical) {
    this.analytical = analytical;
  }

  public LanguageTone confident(Double confident) {
    this.confident = confident;
    return this;
  }

   /**
   * Confiante.
   * @return confident
  **/
  @ApiModelProperty(value = "Confiante.")
  public Double getConfident() {
    return confident;
  }

  public void setConfident(Double confident) {
    this.confident = confident;
  }

  public LanguageTone id(String id) {
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

  public LanguageTone tentative(Double tentative) {
    this.tentative = tentative;
    return this;
  }

   /**
   * Hesitante.
   * @return tentative
  **/
  @ApiModelProperty(value = "Hesitante.")
  public Double getTentative() {
    return tentative;
  }

  public void setTentative(Double tentative) {
    this.tentative = tentative;
  }

  public LanguageTone toneAnalysis(ToneAnalysis toneAnalysis) {
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
    LanguageTone languageTone = (LanguageTone) o;
    return Objects.equals(this.analytical, languageTone.analytical) &&
        Objects.equals(this.confident, languageTone.confident) &&
        Objects.equals(this.id, languageTone.id) &&
        Objects.equals(this.tentative, languageTone.tentative) &&
        Objects.equals(this.toneAnalysis, languageTone.toneAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analytical, confident, id, tentative, toneAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageTone {\n");
    
    sb.append("    analytical: ").append(toIndentedString(analytical)).append("\n");
    sb.append("    confident: ").append(toIndentedString(confident)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tentative: ").append(toIndentedString(tentative)).append("\n");
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

